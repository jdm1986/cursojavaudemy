public class OperadorInstanceOff {
    public static void main(String[] args) {

        String texto = new String("Creando un objeto de la clase String ..... que tal!");

        Integer num = 7;

        boolean b1 = texto instanceof String;
        System.out.println("Texto es del tipo String? = " + b1);

        b1 = num instanceof Integer;
        System.out.println("num es de la clase Integer? = " + b1);





    }
}

