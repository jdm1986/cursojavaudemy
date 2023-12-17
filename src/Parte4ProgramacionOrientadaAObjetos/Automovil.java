package Parte4ProgramacionOrientadaAObjetos;

public class Automovil {
    private String fabricante;
    private String modelo;
    private String color = "gris";
    private double cilindrada;
    private int capacidadEstanque = 40;

    public String leerFabricante(){
        return this.fabricante;
    }
    public void asignarFabricante(String fabricante){
        this.fabricante = fabricante;
    }
    public String leerModelo(){
        return this.modelo;
    }
    public void asignarModelo(String modelo){
        this.modelo = modelo;
    }
    public String leercolor(){
        return this.color;
    }
    public void  asignarColor(String color){
        this.color = color;
    }
    public Double leerCilindrada(){
        return this.cilindrada;
    }
    public void asignarCilindrada(Double cilindrada){
        this.cilindrada = cilindrada;
    }
    public int leerCapacidadEstanque(){
        return capacidadEstanque;
    }
    public void asignarCapacidadEstanque(int capacidadEstanque){
        this.capacidadEstanque = capacidadEstanque;
    }


    public String verDetalle() {

        String stringBuilder =
                /*con el this hago referencia de forma explícita al atributo de la clase y no a una variable que se llame igual dentr del contexto del método*/
                "auto.fabricante = " + this.fabricante +
                        "\nauto.modelo = " + this.modelo +
                        "\nauto.color = " + this.color +
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

    public float calcularConsumo(int km, int porcentajeCombustible) {
        return km / (this.capacidadEstanque * (porcentajeCombustible/100f));
    }
}
