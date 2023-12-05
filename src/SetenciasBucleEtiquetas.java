public class SetenciasBucleEtiquetas {
    public static void main(String[] args) {

        bucle1:
        for (int i = 0; i < 5; i++) {

            System.out.println();
            for (int j = 0; j < 5; j++) {

                if (i == 2) {
                    continue bucle1;
                }
                System.out.print("[i = " + i + ", j = " + j + "], ");
            }
        }
        System.out.println("\n"+"\n=============================================================");
        bucle2:
        for (int i = 0; i < 5; i++) {

            System.out.println();
            for (int j = 0; j < 5; j++) {

                if (i == 2) {
                    break bucle2;
                }
                System.out.print("[i = " + i + ", j = " + j + "], ");
            }
        }
        System.out.println("\n"+"\n=============================================================");

        bucle3:
        for (int i = 0; i < 5; i++) {

            System.out.println();
            int j = 0;
            while ( j < 5) {

                if (i == 2) {
                    continue bucle3;
                }
                System.out.print("[i = " + i + ", j = " + j + "], ");
                j++;
            }
        }
        System.out.println("\n"+"\n=============================================================");

        bucle4:
        for (int i = 1; i <= 7; i++) {

            System.out.println();
            for (int j = 1; j <= 8; j++) {

                if (i == 6 || i == 7) {
                    System.out.println("Dia " + i + "Descanso de fin de semana!");
                    continue bucle4;
                }
                System.out.println("[Dia " + i + ", trabajando a las " + j + "hrs.. ");
            }
        }
    }
}
