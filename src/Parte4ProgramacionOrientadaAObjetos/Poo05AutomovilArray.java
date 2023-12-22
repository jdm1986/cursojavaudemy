package Parte4ProgramacionOrientadaAObjetos;


public class Poo05AutomovilArray {
    public static void main(String[] args) {

        Persona conductorSubaru = new Persona("Jesús", "Díaz");
        Automovil subaru = new Automovil("subauru", "Impreza");
        //Al implementar el constructor con parámetros de la clase, no necesito especialmente el set. Ya que estamos creando e inicializando
        //el objeto con el fabricante y el modelo.
        subaru.setMotor(new Motor(2.0, TipoMotor.GASOLINA));
        subaru.setDeposito(new Deposito());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaru);


        Automovil mazda = new Automovil("Mazda", "Bt-50", Color.ROJO, new Motor(3.0, TipoMotor.DIESEL));
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setDeposito(new Deposito(50));
        mazda.setConductor(new Persona("Israel", "Boza"));
        System.out.println();


        Persona laura = new Persona("Laura", "Lara");
        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, new Motor(4.0, TipoMotor.DIESEL), new Deposito(50));
        nissan.setConductor(laura);
        nissan.setTipo(TipoAutomovil.PICKUP);


        Persona pepe = new Persona("Pepe", "Rodriguez");
        Automovil suzuki = new Automovil("Suzuki", "Vitara", Color.GRIS, new Motor(1.6, TipoMotor.GASOLINA), new Deposito(50));
        suzuki.setTipo(TipoAutomovil.SUV);
        suzuki.setConductor(pepe);
        suzuki.setColor(Color.AMARILLO);
        Automovil.setColorPatente(Color.AZUL);

        Automovil audi = new Automovil("Audi","A3");
        audi.setConductor(new Persona("Ana","Martínez"));
        audi.setMotor(new Motor(3.5,TipoMotor.GASOLINA));
        audi.setDeposito(new Deposito(50));

        Automovil[] autos = new Automovil[5];
        autos[0] = subaru;
        autos[1] = mazda;
        autos[2] = nissan;
        autos[3] = suzuki;
        autos[4] = audi;

        for (int i = 0; i<autos.length;i++){
            System.out.println(autos[i]);
        }


    }

}
