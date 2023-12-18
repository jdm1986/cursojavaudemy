package Ejercicios;

import javax.swing.*;

public class ProgramaNotasTipoTest {

        public static void main(String[] args) {

            String totalPreguntasStr = JOptionPane.showInputDialog("Introduce el total de preguntas:");
            int totalPreguntas = Integer.parseInt(totalPreguntasStr);

            String aciertosStr = JOptionPane.showInputDialog("Introduce el número de aciertos:");
            int aciertos = Integer.parseInt(aciertosStr);

            String erroresStr = JOptionPane.showInputDialog("Introduce el número de errores:");
            int errores = Integer.parseInt(erroresStr);

            int penalizacion = errores / 4;

            int aciertosFinales = Math.max(aciertos - penalizacion, 0);

            boolean aprobado = (aciertosFinales / (double) totalPreguntas) > 0.5;

            if (aprobado){
                System.out.println("Enhorabuena has aprobado");
                // Calcular la nota final
                double notaFinal = 10.0 * aciertosFinales / totalPreguntas;
                // Mostrar el resultado
                JOptionPane.showMessageDialog(null, "Nota final: " + notaFinal);
            } else {
                System.out.println("Lo siento, has suspendido");
                double notaFinal = 10.0 * aciertosFinales / totalPreguntas;
                // Mostrar el resultado
                JOptionPane.showMessageDialog(null, "Nota final: " + notaFinal);
            }

        }
    }

