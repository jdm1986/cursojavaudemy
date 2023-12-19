package Parte4ProgramacionOrientadaAObjetos;


public class Poo02AutomovilStatic {
    public static void main(String[] args) {
        Automovil.setCapacidadEstanqueEstatico(45);
        Automovil subaru = new Automovil("subauru", "Impreza");
        //al implementar el constructor con parámetros de la clase, no necesito especialmente el set. Ya que estamos creando e inicializando
        // el objeto con el fabricante y el modelo.

        subaru.setCilindrada(2.0);
        subaru.setColor("blanco");

        Automovil mazda = new Automovil("Mazda", "Bt-50", "Rojo", 3.0);
        System.out.println("mazda.leerFabricante() = " + mazda.getFabricante());
        System.out.println();

        Automovil nissan = new Automovil("Nissan", "Navara", "Gris Oscuro", 3.5, 50);
        Automovil nissan2 = new Automovil("Nissan", "Navara", "Gris Oscuro", 3.5, 50);


        nissan2.setColor("amarillo");
        Automovil.setColorPatente("azul");
        Automovil auto = new Automovil();

        System.out.println();
        System.out.println(subaru.verDetalle());
        System.out.println();
        System.out.println(mazda.verDetalle());
        System.out.println();
        System.out.println(nissan.verDetalle());
        System.out.println();
        System.out.println(nissan2.verDetalle());
        System.out.println();
        System.out.println("Automovil.getColorPatente() = " + Automovil.getColorPatente());

        System.out.println("Kilómetros por litro = "+ Automovil.calcularConsumoEstatico(300,60)); //llamando a un método estático de la clase



    }

}
