public class SentenciaFor {
    public static void main(String[] args) {


        /*for (int i = 0; i <= 10; i++) {
            System.out.println("i = " + i);
        }

        for (int i = 10; i >= 0; i--) {
            System.out.println("i = " + i);
        }
*/
        for (int i = 0; i <= 10; i++) {
            if (!(i%2 == 0)){
                continue;
            }
            System.out.println("i = " + i); // con el continue, lo que hace es esa iteración saltársela según la condición impuesta, pero el for continua.
        }


    }
}
