import javax.swing.*;

public class OperadoresAritmeticos {
    public static void main(String[] args) {

        int i = 5, j = 4 , suma = i+j;

        System.out.println("suma = " + suma);

        System.out.println("(i+j) = " + (i+j));

        float div2 = (float)i/(float)j;
        System.out.println("div2 = " + div2);
        System.out.println("(i/j) = " + (i/j));

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa unn número"));
        if ((numero % 2) == 0){
            System.out.println("numero es par = " + numero);
        } else {
            System.out.println("numero es impar = " + numero);
        }

    }
}
