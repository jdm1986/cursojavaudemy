package com.jdiaz.parte15curso_api_de_coleccion_de_Java.set;

import com.jdiaz.parte15curso_api_de_coleccion_de_Java.modelo.Alumno;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class EjemploLinkedList {
    public static void main(String[] args) {


        LinkedList<Alumno> linkedList = new LinkedList<>();

        System.out.println(linkedList + ", size = " + linkedList.size());
        System.out.println("esta vacía = " + linkedList.isEmpty());
        linkedList.add(new Alumno("Paco", 7));
        linkedList.add(new Alumno("Bea", 7));
        linkedList.add(new Alumno("Luis", 3));
        linkedList.add(new Alumno("Jano", 3));
        linkedList.add(new Alumno("Zeus", 5));

        System.out.println(linkedList + ", size = " + linkedList.size());

        linkedList.addFirst(new Alumno("Manuel", 6));
        linkedList.addLast(new Alumno("Pepe", 8));

        System.out.println(linkedList + ", size = " + linkedList.size());

        System.out.println("Primero = " + linkedList.getFirst());
        System.out.println("Último = " + linkedList.getLast());
        System.out.println("Primero = " + linkedList.peekFirst());//recive pero no elimina y obtenemos el úlrimo elemento de la lista pero si no encuentra retorna null en vez de lanzar excepción.
        System.out.println("Último = " + linkedList.peekLast());
        System.out.println("Índice 2 = " + linkedList.get(2));

        Alumno manuel = linkedList.removeFirst();
        linkedList.removeLast();

        System.out.println(linkedList + ", size = " + linkedList.size());

        linkedList.remove(new Alumno("Bea",7));

        System.out.println(linkedList + ", size = " + linkedList.size());

        Alumno a = new Alumno("Lucas", 8);

        linkedList.add(a);
        System.out.println(linkedList + ", size = " + linkedList.size());
        System.out.println("Indice de lucas = " + linkedList.indexOf(a));

        linkedList.remove(2);

        System.out.println(linkedList + ", size = " + linkedList.size());
        System.out.println("Indice de lucas = " + linkedList.indexOf(a));

        linkedList.set(3, new Alumno("Arnaldo",5));

        System.out.println(linkedList + ", size = " + linkedList.size());

        ListIterator<Alumno> listIterator = linkedList.listIterator();

        while (listIterator.hasNext()){
            Alumno alumno = listIterator.next();
            System.out.println(alumno);
        }
        System.out.println("============================== previous");
        while (listIterator.hasPrevious()){
            Alumno alumno = listIterator.previous();
            System.out.println(alumno);
        }

    }
}

