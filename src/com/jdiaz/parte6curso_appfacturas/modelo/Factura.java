package com.jdiaz.parte6curso_appfacturas.modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {

    private int folio;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;

    private ItemFactura[] arrayItems;
    private int indiceItems;
    public static final int MAX_ITEMS = 12;
    private static int ultimoFolio;

    public Factura(String descripcion, Cliente cliente) {
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.arrayItems = new ItemFactura[Factura.MAX_ITEMS];
        this.folio = ++ultimoFolio;
        this.fecha = new Date();
    }

    public int getFolio() {
        return folio;
    }


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ItemFactura[] getArrayItems() {
        return arrayItems;
    }

    public void addItemFactura(ItemFactura item) {
        if (indiceItems < MAX_ITEMS) {
            this.arrayItems[indiceItems++] = item;
        }
    }

    public float calcularTotal() {
        float total = 0.0f;
        for (int i = 0; i < indiceItems; i++) {
            total += this.arrayItems[i].calcularImporte();
        }
        return total;
    }

    public String generarDetalle() {
        StringBuilder stringBuilder = new StringBuilder("Factura Nº: ");
        stringBuilder.append(folio)
                .append("\nCliente: ").append(this.cliente.getNombre()).append("\t NIF: ").append(cliente.getNif())
                .append("\nDescripción: ").append(this.descripcion)
                .append("\n");


        SimpleDateFormat dateFormat = new SimpleDateFormat("dd 'de' MMMM, yyyy");
        stringBuilder.append("Fecha Emisión: ").append(dateFormat.format(this.fecha)).append("\n")
                .append("\n#\tNombre\t\t\t€Euros€\tCantidad:\tTotal:\n");

        for (int i = 0; i < indiceItems; i++) {
            stringBuilder.append(this.arrayItems[i]).append("\n");
            /*stringBuilder.append(item.getProducto().getCodigo()).append("\t")
                    .append(item.getProducto().getNombre()).append("\t")
                    .append(item.getProducto().getPrecio()).append("\t")
                    .append(item.getCantidad()).append("\t")
                    .append(item.calcularImporte()).append("\t")
                    .append("\n");*/ //al haber implementado los toString en ItemFactura y Producto me ahorro todas estas líneas de código.
            //imprimiendo el objetio item invocando el toString
        }
        stringBuilder.append("\nGRAN TOTAL: ").append(calcularTotal());

        return stringBuilder.toString();

    }

    @Override
    public String toString() {
        return generarDetalle();
    }
}
