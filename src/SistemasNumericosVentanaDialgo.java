import javax.swing.*;

public class SistemasNumericosVentanaDialgo {
    public static void main(String[] args) {

        // Solicitar un número al usuario
        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un número entero");
        int numeroDecimal = 0;

        try {
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error,debes ingeresar un número entero");
            main(args);
            System.exit(0 );
        }


        // Convertir a binario
        String resultadoMensajeBinario = "Número binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoMensajeBinario);

        // Convertir a octal
        String resultadoMensajeOctal = "Número octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoMensajeOctal);

        // Convertir a hexadecimal
        String resultadoMensajeHexadecimal = "Número hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(resultadoMensajeHexadecimal);

        // Mostrar los resultados en un mensaje
        String mensaje = resultadoMensajeBinario;
        mensaje += "\n" + resultadoMensajeOctal;
        mensaje += "\n" + resultadoMensajeHexadecimal;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
