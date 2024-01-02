package com.jdiaz.parte6curso_appfacturas;

import com.jdiaz.parte6curso_appfacturas.modelo.*;

import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNif("30238098-Q\t");
        cliente.setNombre("Laura");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una descripción de la factura: ");
        Factura factura = new Factura(scanner.nextLine(), cliente);

        Producto producto;
        /*String nombre; en vez de usar las variables uso directamente scanner línea 29
          float precio; en vez de usar las variables uso directamente scanner línea 32
          int cantidad; me ahorraría las líneas 35,36,37 versus línea 38*/ //optimizo variables

        System.out.println();

        for (int i = 0; i < 2; i++) {
            producto = new Producto();
            System.out.print("Ingresa producto nº " + producto.getCodigo() + ": ");
            producto.setNombre(scanner.nextLine());

            System.out.print("Ingresa el precio: ");
            producto.setPrecio(scanner.nextFloat());

            System.out.print("Ingresa la cantidad: ");
            /*cantidad = scanner.nextInt();
            ItemFactura item = new ItemFactura(cantidad, producto);
            factura.addItemFactura(item);*/ //me ahorro tres líneas de código en una.
            factura.addItemFactura(new ItemFactura(scanner.nextInt(), producto));

            System.out.println();
            scanner.nextLine();
        }
        //System.out.println(factura.generarDetalle()); //como en Factura he implementado el toString con el método generar detalle, aquí solo tengo que imprimir el objeto.
        System.out.println(factura);
    }

}
