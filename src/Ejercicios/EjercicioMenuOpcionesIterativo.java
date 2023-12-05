package Ejercicios;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class EjercicioMenuOpcionesIterativo {
    public static void main(String[] args) {

        int opcionIndice = 0;

        Map<String,Integer> opciones = new HashMap<>();
        opciones.put("Actualizar",1);
        opciones.put("Eliminar",2);
        opciones.put("Agregar",3);
        opciones.put("Listar",4);
        opciones.put("Salir",5);

        Object[] opArreglo = opciones.keySet().toArray();

        do {
            Object opcion = JOptionPane.showInputDialog(null,
                    "Seleccione una Opción",
                    "Mantenedor de Productos",
                    JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);

            if (opcion == null) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
                continue;
            }

            opcionIndice = opciones.get(opcion.toString());


            switch (opcionIndice) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Usuario actualizado correctamente");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Usuario agregado correctamente");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Listado de usuarios");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Haz salido con éxito!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        } while (opcionIndice != 5);
    }
}
