package com.jdiaz.parte21curso_antoniones;

import com.jdiaz.parte21curso_antoniones.models.Producto;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.util.Arrays;

public class EjemploAnotacion {
    public static void main(String[] args) {

        Producto p = new Producto();
        p.setFecha(LocalDate.now());
        p.setNombre("Mesa centro roble");
        p.setPrecio(1000L);

        Field[] atribtus = p.getClass().getDeclaredFields();

        String json = Arrays.stream(atribtus)
                .filter(field -> field.isAnnotationPresent(JsonAtributo.class))
                .map(field -> {
                    field.setAccessible(true);
                    String nombre = field.getAnnotation(JsonAtributo.class).nombre().equals("") ? field.getName(): field.getAnnotation(JsonAtributo.class).nombre();
                    try {
                        return "\"" + nombre + "\":\"" + field.get(p) + "\"";
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException("Error al serilizar a json: " + e.getMessage());
                    }
                })
                .reduce("{" , (a,b)-> {
                    if ("{".equals(a)) {
                        return a + b;
                    }
                    return a + ", " + b;
                }).concat("}");
        System.out.println("json = " + json);
    }
}
