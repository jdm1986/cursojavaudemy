package com.jdiaz.ejercicios;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.*;
import java.awt.event.*;

public class ProgramaNotasTipoTest {

    public static void main(String[] args) {
        String aciertosStr = JOptionPane.showInputDialog("Introduce el número de aciertos:");
        int aciertos = Integer.parseInt(aciertosStr);

        String erroresStr = JOptionPane.showInputDialog("Introduce el número de errores:");
        int errores = Integer.parseInt(erroresStr);

        int totalPreguntas = aciertos + errores;

        int penalizacion = errores / 4;

        int aciertosFinales = Math.max(aciertos - penalizacion, 0);

        boolean aprobado = (aciertosFinales / (double) totalPreguntas) > 0.5;

        double notaFinal = 10.0 * aciertosFinales / totalPreguntas;

        final String mensaje = (aprobado ? "Enhorabuena has aprobado" : "Lo siento, has suspendido") +
                "\nNota final: " + notaFinal;
        // Crear el JPanel para la ventana personalizada
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Agregar el mensaje
        JTextArea textArea = new JTextArea(mensaje);
        textArea.setEditable(false);
        panel.add(textArea, BorderLayout.CENTER);

        // Crear el botón de copiar
        JButton copyButton = new JButton("Copiar Resultado");
        copyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringSelection stringSelection = new StringSelection(mensaje);
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard.setContents(stringSelection, null);
            }
        });
        panel.add(copyButton, BorderLayout.SOUTH);

        // Mostrar el diálogo
        JOptionPane.showMessageDialog(null, panel);


    }
}
