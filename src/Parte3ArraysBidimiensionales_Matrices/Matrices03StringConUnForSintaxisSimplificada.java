package Parte3ArraysBidimiensionales_Matrices;

public class Matrices03StringConUnForSintaxisSimplificada {
    public static void main(String[] args) {

        String[][] nombres = {{"pepe","pepa",},{"josefa","paco",},{"lucas","maria"}};

        System.out.println("<<<<<<<<<<<<<<<<<<< ITERANDO CON FOR EACH >>>>>>>>>>>>>>>>>>>>");

/*Por cada fila del array nombres, quiero el nombre de cada elemento de la fila*/


        for(String [] fila: nombres){
            for(String nombre:fila){
                System.out.println(nombre+" \t");
            }
            System.out.println("------");
        }
    }

}
