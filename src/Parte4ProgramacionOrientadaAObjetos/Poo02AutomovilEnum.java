package Parte4ProgramacionOrientadaAObjetos;


public class Poo02AutomovilEnum {
    public static void main(String[] args) {
        Automovil.setCapacidadEstanqueEstatico(45);
        Automovil subaru = new Automovil("subauru", "Impreza");
        //Al implementar el constructor con parámetros de la clase, no necesito especialmente el set. Ya que estamos creando e inicializando
        //el objeto con el fabricante y el modelo.
        subaru.setCilindrada(2.0);
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        System.out.println();


        Automovil mazda = new Automovil("Mazda", "Bt-50", Color.ROJO, 3.0);
        mazda.setTipo(TipoAutomovil.PICKUP);
        System.out.println("mazda.leerFabricante() = " + mazda.getFabricante());
        System.out.println();


        TipoAutomovil tipo = subaru.getTipo();
        System.out.println("tipoSubaru.getNombre() = " + tipo.getNombre());
        System.out.println("tipoSubaru.getDescripcion() = " + tipo.getDescripcion());

        tipo = mazda.getTipo();
        switch (tipo) {
            case CONVERTIBLE -> System.out.println("El automóvil es deportivo y descapotable de dos puertas");
            case COUPE -> System.out.println("Es un atomóvil pequeño de dos puertas y típicamente deportivo");
            case FURGON -> System.out.println("Es un automóvil utilitario típicamente de empresa");
            case PICKUP -> System.out.println("Camioneta utilitaria");
            case HATCHBACK -> System.out.println("Auto mediano compacto, aspecto deportivo");
            case SEDAN -> System.out.println("Auto tipo berlina mediano");
            case STATION_WAGON -> System.out.println("Automóvil grande con maletero grande");
        }



    }

}
