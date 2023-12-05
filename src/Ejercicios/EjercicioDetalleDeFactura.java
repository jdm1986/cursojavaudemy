package Ejercicios;

import java.util.Scanner;

public class EjercicioDetalleDeFactura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el nombre de la factura");
        String nombreDeLaFactura = scanner.nextLine();

        System.out.println("Ingresa el nombre del producto 1");
        String nombreProducto1 = scanner.nextLine();

        System.out.println("Ingresa el precio del producto 1");
        double precioProducto1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Ingresa el nombre del producto 2");
        String nombreProducto2 = scanner.nextLine();

        System.out.println("Ingresa el precio del producto 2");
        double precioProducto2 = scanner.nextDouble();



        System.out.println();
        double sumadePrecios = precioProducto1+precioProducto2;
        double iva = sumadePrecios * 0.21;
        double totalConIva = sumadePrecios + iva;

        System.out.println("-----" + nombreDeLaFactura + "-----");
        System.out.println();
        System.out.println(nombreProducto1 + ": $" + precioProducto1);
        System.out.println(nombreProducto2 + ": $" + precioProducto2);
        System.out.println("Suma: $"+ sumadePrecios);
        System.out.println("Iva (21%): $" + iva);
        System.out.println("Total + Iva: $" + totalConIva);



    }
}
