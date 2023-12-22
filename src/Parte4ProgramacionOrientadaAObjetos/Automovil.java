package Parte4ProgramacionOrientadaAObjetos;

public class Automovil {
    private int id = 0;
    private String fabricante;
    private String modelo;
    private Color color = Color.GRIS;
    private Motor motor;
    private Deposito deposito;
    private Persona conductor;
    private Rueda[] ruedas;

    private TipoAutomovil tipo;

    private static Color colorPatente = Color.PÚRPURA;
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

    public Automovil(String fabricante, String modelo, Color color) {
        this(fabricante, modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor) {
        this(fabricante, modelo, color);
        this.motor = motor;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Deposito deposito) {
        this(fabricante, modelo, color, motor);
        this.deposito = deposito;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Deposito deposito, Persona conductor, Rueda[] ruedas) {
        this(fabricante, modelo, color, motor, deposito);
        this.conductor = conductor;
        this.ruedas = ruedas;
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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public static Color getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(Color colorPatente) {
        Automovil.colorPatente = colorPatente;
    }

    public static int getCapacidadEstanqueEstatico() {
        return capacidadEstanqueEstatico;
    }

    public static void setCapacidadEstanqueEstatico(int capacidadEstanqueEstatico) {
        Automovil.capacidadEstanqueEstatico = capacidadEstanqueEstatico;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Deposito getDeposito() {
        if (deposito == null) {
            this.deposito = new Deposito();
        }
        return deposito;
    }

    public void setDeposito(Deposito deposito) {
        this.deposito = deposito;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }


    public String verDetalle() {

        String detalle =
                /*con el this hago referencia de forma explícita al atributo de la clase y no a una variable que se llame igual dentr del contexto del método
                 * a continuación 4 formas de hacer referencia a los atributos, get, this.get, atributo mientras no haya una variable igual, o this.atributo. */"auto.id = " + this.id +
                "\nauto.fabricante = " + getFabricante() +
                "\nauto.modelo = " + this.getModelo();
        if (this.getTipo() != null) {
            detalle += "\nauto.tipo = " + this.getTipo().getDescripcion();
        }
        detalle += "\nauto.color = " + color.getColor() +
                "\nauto.patenteColor = " + colorPatente.getColor();
        if (this.motor != null) {
            detalle += "\nauto.cilindrada = " + this.motor.getCilindrada();
        }
        if (conductor != null) {
            detalle += "\nConductor subaru: " + this.getConductor();
        }
        if (getRuedas() != null) {
            for (Rueda rueda : this.getRuedas()) {
                detalle += "\n" + rueda.getFabricante() + ", aro: " + rueda.getAro() + ", ancho" + rueda.getAncho();
            }
        }


        /*stringBuilder.append("auto.fabricante = " + this.fabricante);
        stringBuilder.append("\nauto.modelo = " + this.modelo);
        stringBuilder.append("\nauto.color = " + this.color);
        stringBuilder.append("\nauto.cilindrada = " + this.cilindrada);*/ //otra manera sin concatenar.
        return detalle;
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
        return km / (this.getDeposito().getCapacidad() * porcentajeCombustible);
    }

    public static float calcularConsumoEstatico(int km, float porcentajeCombustible) {
        return km / (Automovil.capacidadEstanqueEstatico * (porcentajeCombustible / 100f));
    }

    public float calcularConsumo(int km, int porcentajeCombustible) {
        return km / (this.getDeposito().getCapacidad() * (porcentajeCombustible / 100f));
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
    public String toString() { //Botón derecho, "generaTE" (marcas todos los atributos) y representa mediante cadena los atributos del objeto. Puedes modificar para que
        //represente lo que quieras, todos los atributos... algunos... una cadena en concreto...
        return
                "Automovil{" + "id='" + id +
                        "fabricante='" + fabricante + '\'' +
                        ", modelo='" + modelo + '\'' +
                        ", color='" + color + '\'' +
                        ", cilindrada=" + this.motor.getCilindrada() +
                        ", capacidadEstanque=" + deposito.getCapacidad() +
                        '}';
    }
}
