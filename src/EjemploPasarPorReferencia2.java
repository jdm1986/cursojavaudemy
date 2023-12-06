class Persona{
    private String nombre;

    public void modoficarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }
    public String leerNombre(){
        return this.nombre;
    }

}

public class EjemploPasarPorReferencia2 {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.modoficarNombre("Andrés");

        System.out.println("Iniciamos el método main");

        System.out.println("persona.nombre = " + persona.leerNombre());
        System.out.println("Antes de llamar al método test");
        test(persona);
        System.out.println("Después de llamar al método test");
        System.out.println("persona.nombre = " + persona.leerNombre());

    }

    public static void test(Persona persona){
        System.out.println("Iniciamos el método 'test'");
        persona.modoficarNombre("Pepe");
        System.out.println("Finaliza el método test");
    }
}
