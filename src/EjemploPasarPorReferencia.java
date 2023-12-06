public class EjemploPasarPorReferencia {
    public static void main(String[] args) {

        int[] edad = {10,11,12};
        System.out.println("Iniciamos el método main");

        for (int i=0;i <edad.length;i++){
            System.out.println("edad = " + edad[i]);
        }
        System.out.println("Antes de llamar al método test");
        test(edad);
        System.out.println("Después de llamar al método test");
        for (int i=0;i <edad.length;i++){
            System.out.println("edad = " + edad[i]);
        }
        System.out.println("Finaliza el método main con con los datos del arreglo modificado");

    }

    public static void test(int[] edadArreglo){
        System.out.println("Iniciamos el método 'test'");
        for (int i=0;i <edadArreglo.length;i++){
            edadArreglo[i] = edadArreglo[i]+20;
            System.out.println("Modificando la referencia " + (i+1));
        }
        System.out.println("Finaliza el método test");
    }
}
