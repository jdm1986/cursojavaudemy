package Parte4ProgramacionOrientadaAObjetos;

public class Automovil {
    private int id = 0;
    private String fabricante;
    private String modelo;
    private String color = COLOR_GRIS;
    private double cilindrada;
    private int capacidadEstanque = 40;
    private static String colorPatente = "Naranja";
    private static int capacidadEstanqueEstatico = 30;
    private static int ultimoId = 0;
    public static final Integer VELOCIDAD_MAX_CARRETERA = 120;
    public static final int VELOCIDAD_MAX_CIUDAD = 50;
    public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_AMARILLO = "Amarillo";
    public static final String COLOR_AZUL = "Azul";
    public static final String COLOR_BLANCO = "Blanco";
    public static final String COLOR_GRIS = "Gris oscuro";


    //esto es un constructor vacío por defecto
    public Automovil() {
        this.id = ++ultimoId;
    }

    //lo siguiente es sobrecarga de constructores, que pasa por parámetros los atributos que seleccione.
    public Automovil(String fabricante, String modelo) {
        this();//con this(); llamas al constructor anterior
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, String color) {
        this(fabricante, modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, String color, double cilindrada) {
        this(fabricante, modelo, color);
        this.cilindrada = cilindrada;
    }

    public Automovil(String fabricante, String modelo, String color, double cilindrada, int capacidadEstanque) {
        this(fabricante, modelo, color, cilindrada);
        this.capacidadEstanque = capacidadEstanque;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    } //al estar en el constructor, podría prescidir del set

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCapacidadEstanque() {
        return capacidadEstanque;
    }

    public void setCapacidadEstanque(int capacidadEstanque) {
        this.capacidadEstanque = capacidadEstanque;
    }

    public static String getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(String colorPatente) {
        Automovil.colorPatente = colorPatente;
    }

    public static int getCapacidadEstanqueEstatico() {
        return capacidadEstanqueEstatico;
    }

    public static void setCapacidadEstanqueEstatico(int capacidadEstanqueEstatico) {
        Automovil.capacidadEstanqueEstatico = capacidadEstanqueEstatico;
    }

    public String verDetalle() {

        String stringBuilder =
                /*con el this hago referencia de forma explícita al atributo de la clase y no a una variable que se llame igual dentr del contexto del método
                 * a continuación 4 formas de hacer referencia a los atributos, get, this.get, atributo mientras no haya una variable igual, o this.atributo. */"auto.id = " + this.id +
                "\nauto.fabricante = " + getFabricante() +
                "\nauto.modelo = " + this.getModelo() +
                "\nauto.color = " + color +
                "\nauto.patenteColor = " + colorPatente +
                "\nauto.cilindrada = " + this.cilindrada;
        /*stringBuilder.append("auto.fabricante = " + this.fabricante);
        stringBuilder.append("\nauto.modelo = " + this.modelo);
        stringBuilder.append("\nauto.color = " + this.color);
        stringBuilder.append("\nauto.cilindrada = " + this.cilindrada);*/ //otra manera sin concatenar.
        return stringBuilder;
    }

    public String acelerar(int rpm) {
        return "El auto " + this.fabricante + " acelerando a " + rpm + " rpm";
    }

    public String frenar() {
        return this.fabricante + " " + this.modelo + " frenando!";
    }

    public String acelerarYFrenar(int rpm) { //en este método hago referencia a los métodos acelear y frenar

        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, float porcentajeCombustible) {
        return km / (this.capacidadEstanque * porcentajeCombustible);
    }

    public static float calcularConsumoEstatico(int km, float porcentajeCombustible) {
        return km / (Automovil.capacidadEstanqueEstatico * (porcentajeCombustible / 100f));
    }

    public float calcularConsumo(int km, int porcentajeCombustible) {
        return km / (this.capacidadEstanque * (porcentajeCombustible / 100f));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Automovil)) {
            return false;
        }
        Automovil a = (Automovil) obj;
        return (this.fabricante != null && this.modelo != null && this.fabricante.equals(a.getFabricante()) && this.modelo.equals(a.getModelo()));
    }

    @Override
    public String toString() { //botón derecho, generate (marcas todos los atributos) y representa mediante cadena los atributos del objeto. Puedes modificar para que
        //represente lo que quieras, todos los atributos... algunos... una cadena en concreto...
        return
                "Automovil{" + "id='"+id+
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cilindrada=" + cilindrada +
                ", capacidadEstanque=" + capacidadEstanque +
                '}';
    }
}
