package Parte4ProgramacionOrientadaAObjetos;

public enum Color { //Un enumerador es una colección de valores constantes, o atributos constantes.

    ROJO("Rojo"),
    AMARILLO("Amarillo"),
    AZUL("Azul"),
    BLANCO("Blanco"),
    GRIS("Gris oscuro"),
    PÚRPURA("Púrpura");

    private  final String Color;

    Color(String color) {
        this.Color = color;
    }

    public String getColor() {
        return Color;
    }

    @Override
    public String toString() {
        return this.Color;
    }
}
