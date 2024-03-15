package com.jdiaz.ejercicios.AlmacenConsumo;

public class Almacen {
    public static void main(String[] args) {

        Fruta manzana = new Fruta("Manzana", 0.50,150,"Goldem");
        Fruta pera = new Fruta("Pera", 0.40,150, "Conferencia");
        Limpieza limpiaSuelos = new Limpieza("Limpiasuelos",0.50,"Abrillantador",2);
        Limpieza limpiaCristales = new Limpieza("LimpiaCristales",0.50,"Alcohol",1);
        Lacteo natillas = new Lacteo("Natillas",1.20,4,20);
        Lacteo yogur = new Lacteo("Yogur", 1.50, 4,20);
        NoPerecedero galletas = new NoPerecedero("Galletas",1.50,100,300);
        NoPerecedero picos = new NoPerecedero("Picos", 2.50,300,500);

        Producto[] productos = {manzana,pera,limpiaSuelos,limpiaCristales,natillas,yogur,galletas,picos};

        for (int i = 0; i < productos.length;i++){
            System.out.println(productos[i]);

        }

    }
}
