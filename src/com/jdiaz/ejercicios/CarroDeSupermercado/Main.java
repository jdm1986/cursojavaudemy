package com.jdiaz.ejercicios.CarroDeSupermercado;

public class Main {
    public static void main(String[] args) {
        Fruta manzana = new Fruta("manzana", 0.50,0.150,"Rojo");
        Fruta banana = new Fruta("Banana", 0.30, 0.200, "Amarillo");
        Fruta pera = new Fruta("Pera", 0.25, 0.120, "Verde");
        Fruta naranja = new Fruta("Naranja", 0.20, 0.160, "Naranja");
        Fruta kiwi = new Fruta("Kiwi", 0.75, 0.080, "Marrón");
        Fruta sandia = new Fruta("Sandía", 1.60,3,"Verde");

        Limpieza detergente = new Limpieza("Detergente", 2.99,"Líquido", 5.125);
        Limpieza jabon = new Limpieza("Jabón", 1.20, "Sólido", 0.5);
        Limpieza cloro = new Limpieza("Cloro", 2.50, "Líquido", 1.0);
        Limpieza lavandina = new Limpieza("Lavandina", 1.80, "Líquido", 2.0);
        Limpieza suavizante = new Limpieza("Suavizante", 4.00, "Líquido", 1.5);

        Lacteo leche = new Lacteo("Leche", 0.90, 1, 3);
        Lacteo queso = new Lacteo("Queso", 2.50, 3, 20);
        Lacteo yogurt = new Lacteo("Yogurt", 0.80, 5, 5);
        Lacteo mantequilla = new Lacteo("Mantequilla", 1.50, 2, 7);
        Lacteo crema = new Lacteo("Crema", 1.20, 4, 10);

        NoPerecible arroz = new NoPerecible("arroz",1.50,500,300);


        BolsaSupermercado<Fruta> bolsaFrutas = new BolsaSupermercado<>();
        BolsaSupermercado<Limpieza> bolsaLimpieza = new BolsaSupermercado<>();
        BolsaSupermercado<Lacteo> bolsaLacteos = new BolsaSupermercado<>();
        BolsaSupermercado<NoPerecible> bolsaNoPerecible = new BolsaSupermercado<>();

        bolsaFrutas.addProducto(manzana);
        bolsaFrutas.addProducto(banana);
        bolsaFrutas.addProducto(pera);
        bolsaFrutas.addProducto(naranja);
        bolsaFrutas.addProducto(kiwi);
        bolsaFrutas.addProducto(sandia);

        bolsaLimpieza.addProducto(detergente);

        bolsaLacteos.addProducto(leche);

        bolsaNoPerecible.addProducto(arroz);

        System.out.println("bolsaFrutas = " + bolsaFrutas.getProductos());
        System.out.println("bolsaLimpieza = " + bolsaLimpieza.getProductos());
        System.out.println("bolsaLacteos = " + bolsaLacteos.getProductos());
        System.out.println("bolsaNoPerecible = " + bolsaNoPerecible.getProductos());
    }
}
