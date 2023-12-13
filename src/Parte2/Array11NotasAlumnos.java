package Parte2;

import java.util.Scanner;

public class Array11NotasAlumnos {
    public static void main(String[] args) {

        double sumaNotasMatematicas = 0;
        double sumaNotasHistoria = 0;
        double sumaNotasLengua = 0;

        double[] claseMatematicas = new double[7];
        double[] claseHistoria = new double[7];
        double[] claseLenguaje = new double[7];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa 7 notas de estudiantes para matemáticas: ");
        for (int i = 0; i < claseMatematicas.length;i++){
            claseMatematicas[i]= scanner.nextDouble();
        }
        System.out.println("Ingresa 7 notas de estudiantes para historia: ");
        for (int i = 0; i < claseHistoria.length;i++){
            claseHistoria[i]= scanner.nextDouble();
        }
        System.out.println("Ingresa 7 notas de estudiantes para lenguaje: ");
        for (int i = 0; i < claseLenguaje.length;i++){
            claseLenguaje[i]= scanner.nextDouble();
        }

        for(int i = 0;i<7;i++){
            sumaNotasMatematicas += claseMatematicas[i];
            sumaNotasHistoria += claseHistoria[i];
            sumaNotasLengua += claseLenguaje[i];
        }

        double promedioMatematicas = (sumaNotasMatematicas/claseMatematicas.length);
        double promedioHistoria = (sumaNotasHistoria/claseHistoria.length);
        double promedioLengua = (sumaNotasLengua/claseLenguaje.length);

        System.out.println("PromedioMatematicas = " + (sumaNotasMatematicas/claseMatematicas.length));
        System.out.println("PromedioNotasHistoria = " + (sumaNotasHistoria/claseHistoria.length));
        System.out.println("PromedioNotasLengua = " + (sumaNotasLengua/claseLenguaje.length));
        System.out.println("Promedio Curso = " + ((promedioMatematicas+promedioLengua+promedioHistoria)/3));

        System.out.println("Ingresa el número del alumno (de 0 - 6)");
        int id = scanner.nextInt();
        double promedioAlumno = (claseMatematicas[id]+claseHistoria[id]+claseLenguaje[id])/3;
        System.out.println("Nota Matemáticas de alumno " + id + " = " + claseMatematicas[id]);
        System.out.println("Nota Historia de alumno " + id + " = " + claseHistoria[id]);
        System.out.println("Nota Lengua de alumno " + id + " = " + claseLenguaje[id]);
        System.out.println("Promedio alumno " + id + " es igual a: " + promedioAlumno);


    }
}
