package com.jdiaz.parte15curso_api_de_coleccion_de_Java.set;

import com.jdiaz.parte15curso_api_de_coleccion_de_Java.modelo.Alumno;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class EjemploListArrayList {
    public static void main(String[] args) {



        List<Alumno> arrayList = new ArrayList<>();

        System.out.println(arrayList + ", size = " + arrayList.size());
        System.out.println("esta vacía = " + arrayList.isEmpty());
        arrayList.add(new Alumno("Paco",5));
        arrayList.add(new Alumno("Bea",7));
        arrayList.add(new Alumno("Luis",9));
        arrayList.add(2,new Alumno("Jano",3));
        arrayList.set(3,new Alumno("Zeus",3));

        System.out.println(arrayList + ", size = " + arrayList.size());



        //arrayList.remove(new Alumno("Jano",3));

        arrayList.remove(0);

        System.out.println("arrayList = " + arrayList + ", size = " + arrayList.size());

        boolean b = arrayList.contains(new Alumno("Jano", 3));
        System.out.println("La lista contiene a Jano = " + b);

        Object a[] = arrayList.toArray();
        for (int i = 0; i < a.length; i++){
            System.out.println("Desde el array" + a[i]);
        }
    }
}
