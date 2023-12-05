public class PrimitivosEnteros {

    public static void main(String[] args) {

        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Tipo byte ocupa en memoria " + Byte.BYTES + "bytes y corresponde a "+ Byte.SIZE + " bits");
        System.out.println("Valor máximo de un byte " + Byte.MAX_VALUE);
        System.out.println("Valor mínimo de un byte " + Byte.MIN_VALUE);

        Short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Tipo short ocupa en memoria " + Short.BYTES + "bytes y corresponde a "+ Short.SIZE + " bits");
        System.out.println("Valor máximo de un short " + Short.MAX_VALUE);
        System.out.println("Valor mínimo de un short " + Short.MIN_VALUE);

        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Tipo Int ocupa en memoria " + Integer.BYTES + "bytes y corresponde a "+ Integer.SIZE + " bits");
        System.out.println("Valor máximo de un integer " + Integer.MAX_VALUE);
        System.out.println("Valor mínimo de un integer " + Integer.MIN_VALUE);

        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Tipo Int ocupa en memoria " + Long.BYTES + "bytes y corresponde a "+ Long.SIZE + " bits");
        System.out.println("Valor máximo de un long " + Long.MAX_VALUE);
        System.out.println("Valor mínimo de un long " + Long.MIN_VALUE);

        var numeroVar = 92233720368547758079F;
    }
}
