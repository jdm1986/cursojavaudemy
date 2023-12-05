import java.util.Scanner;

public class OperadorTernario {

    public static void main(String[] args) {

        String variable = 7==7 ? "si es verdadero": "si es falso";
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 0.0;

        double mates = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la nota de matemáticas entre 2.0-7.0");
        mates = scanner.nextDouble();
        System.out.println("Ingresa la nota de matemáticas entre 2.0-7.0");
        ciencias = scanner.nextDouble();
        System.out.println("Ingresa la nota de matemáticas entre 2.0-7.0");
        historia = scanner.nextDouble();

        promedio = (mates+ciencias+historia)/3;
        System.out.println("promedio = " + promedio);

        estado = promedio >=5.49 ? "Aprobado":"Supenso";
        System.out.println("estado = " + estado);

        /*if (promedio >=5.49){
            estado = "aprobado con if";
        } else {
            estado = "suspenso con if";
        }
        System.out.println("estado = " + estado);*/
    }

}
