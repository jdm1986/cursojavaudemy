package Parte4ProgramacionOrientadaAObjetos;

public enum TipoAutomovil {
    SEDAN("Sedan","Auto mediano",4),
    STATION_WAGON("Station Wagon", "Auto Grande",4),
    HATCHBACK("Hatchback","Auto compacto",4),
    PICKUP("PickUp","Camioneta",4),
    COUPE("Coupé","Auto Pequeño",2),
    CONVERTIBLE("Convertible","Auto deportivo",2),
    FURGON("Furgón","Auto utilitario",4);

    private final String nombre;
    private final String descripcion;
    private final int numeroPuertas;

    //se necesita un constructor para inicializar los atributos constantes

    TipoAutomovil(String nombre, String descripcion, int numeroPuertas) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numeroPuertas = numeroPuertas;
    }
    //se implementan los get y no los set porque una constante (final) no es modificable.


    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }
}
