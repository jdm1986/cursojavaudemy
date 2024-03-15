package com.jdiaz.parte21curso_antoniones.procesador;

import com.jdiaz.parte21curso_antoniones.JsonAtributo;
import com.jdiaz.parte21curso_antoniones.procesador.exception.JsonSerializadorException;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Objects;

public class JasonSerializador {

    public static String convertirJason(Object object){

        if(Objects.isNull(object)){
            throw new JsonSerializadorException("El objeto serializado no puede ser null");
        }
        Field[] atributos = object.getClass().getDeclaredFields();
        return Arrays.stream(atributos)
                .filter(field -> field.isAnnotationPresent(JsonAtributo.class))
                .map(field -> {
                    field.setAccessible(true);
                    String nombre = field.getAnnotation(JsonAtributo.class).nombre().equals("") ? field.getName(): field.getAnnotation(JsonAtributo.class).nombre();
                    try {
                        Object valor = field.get(object);
                        if(field.getAnnotation(JsonAtributo.class).capitalizar()&& valor instanceof String){
                            String nuevoValor = (String) valor;
                            nuevoValor = nuevoValor.substring(0,1).toUpperCase() + nuevoValor.substring(1).toLowerCase();
                            field.set(object,nuevoValor);
                        }
                        return "\"" + nombre + "\":\"" + field.get(object) + "\"";
                    } catch (IllegalAccessException e) {
                        throw new JsonSerializadorException("Error al serilizar a json: " + e.getMessage());
                    }
                })
                .reduce("{" , (a,b)-> {
                    if ("{".equals(a)) {
                        return a + b;
                    }
                    return a + ", " + b;
                }).concat("}");
    }

}
