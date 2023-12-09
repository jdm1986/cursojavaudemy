package Parte1;

import java.util.Scanner;

public class OperadoresLogicosLoggin {
    public static void main(String[] args) {
        
        /*String[] usernames = new String[3];
        String[] passwords = new String[3];

        usernames[0] = "andres";
        passwords[0] = "12345";

        usernames[1] = "admin";
        passwords[1] = "12345";

        usernames[2] = "pepe";
        passwords[2] = "12345";*/

        String[] usernames = {"andres","admin","pepe"};
        String[] passwords = {"123","123","123"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el username");
        String usuario = scanner.next();

        System.out.println("Ingresa el password");
        String contrasenia = scanner.next();

        boolean esAutenticado = false;

        for (int i = 0; i< usernames.length; i++){

            esAutenticado = usernames[i].equals(usuario) && passwords[i].equals(contrasenia)? true: esAutenticado;

            /*if (usernames[i].equals(usuario) && passwords[i].equals(contrasenia)){
                esAutenticado = true;
                break;
            }*/
        }

        String mensaje = esAutenticado ? "Bienvenido usuario ".concat(usuario).concat("!") :"Username o contraseña incorrectos\nLo sentimos, requiere autenticación";
        System.out.println("mensaje = " + mensaje);
        /*if(esAutenticado){
            System.out.println("Bienvenido usuario ".concat(usuario).concat("!"));
        }else {
            System.out.println("Username o contraseña incorrectos");
            System.out.println("Lo siento, requiere autenticación");*/
        }
    }

