import java.util.Random;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {

        //Usando la clase Math.

        String[] colores = {"azul","amarillo","rojo","verde","blanco","negro"};
        double random = Math.random();
        System.out.println("random = " + random);
        random *= colores.length;


        random = Math.floor(random);
        System.out.println("random = " + random);

        System.out.println("colores = " + colores[(int)random]);

        //Usando el objeto Random

        Random randomObj = new Random();
        int randomInt = randomObj.nextInt(0,1000+1);//El valor del final no es inclusivo, sumarle 1 o porne 1001 por ejemplo.
        System.out.println("randomInt = " + randomInt);

        randomInt = randomObj.nextInt(colores.length);
        System.out.println("randomInt = " + randomInt);
        System.out.println("colores = " + colores[randomInt]);
    }
}
