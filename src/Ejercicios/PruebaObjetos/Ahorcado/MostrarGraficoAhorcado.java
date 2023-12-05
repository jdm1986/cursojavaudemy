package Ejercicios.PruebaObjetos.Ahorcado;

public class MostrarGraficoAhorcado {

    public static void mostrarAhorcado(int intentosFallidos) {
        switch (intentosFallidos) {
            case 0:
                System.out.println(" ----\n");
                break;
            case 1:
                System.out.println(" ----\n" +
                        "    |\n");
                break;
            case 2:
                System.out.println(" ----\n" +
                        "    |\n" +
                        "    o\n");
                break;
            case 3:
                System.out.println(" ----\n" +
                        "    |\n" +
                        "  \\ o\n");
                break;
            case 4:
                System.out.println(" ----\n" +
                        "    |\n" +
                        "  \\ o /\n");
                break;
            case 5:
                System.out.println(" ----\n" +
                        "    |\n" +
                        "  \\ o /\n" +
                        "    |\n");
                break;
            case 6, 7:
                System.out.println(" ----\n" +
                        "    |\n" +
                        "  \\ o /\n" +
                        "    |\n" +
                        "  /   \\\n");
                break;
        }
    }
}
