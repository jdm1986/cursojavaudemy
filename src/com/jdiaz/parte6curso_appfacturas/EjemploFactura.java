package com.jdiaz.parte6curso_appfacturas;

import com.jdiaz.parte6curso_appfacturas.modelo.Cliente;
import com.jdiaz.parte6curso_appfacturas.modelo.Factura;
import com.jdiaz.parte6curso_appfacturas.modelo.ItemFactura;
import com.jdiaz.parte6curso_appfacturas.modelo.Producto;

import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNif("30238098-Q\t");
        cliente.setNombre("Laura");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una descripción de la factura: ");
        String descripcionFactura = scanner.nextLine();
        Factura factura = new Factura(descripcionFactura,cliente);

        Producto producto;
        String nombre;
        float precio;
        int cantidad;

        System.out.println();

        for (int i = 0; i<5;i++){
            producto = new Producto();
            System.out.print("Ingresa producto nº " + producto.getCodigo() + ": ");
            nombre = scanner.nextLine();
            producto.setNombre(nombre);

            System.out.print("Ingresa el precio: ");
            precio = scanner.nextFloat();
            producto.setPrecio(precio);

            System.out.print("Ingresa la cantidad: ");
            cantidad = scanner.nextInt();

            ItemFactura item = new ItemFactura(cantidad,producto);
            factura.addItemFactura(item);

            System.out.println();
            scanner.nextLine();
        }
        System.out.println(factura.generarDetalle());
    }

}
