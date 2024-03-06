import javax.swing.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Aplicacion {
    public static void main(String[] args) {

        UsuarioRepositorioImpl repositorio = new UsuarioRepositorioImpl();

        int opcionIndice;

        do {
            Map<String, Integer> operaciones = new HashMap<>();
            operaciones.put("Actualizar", 1);
            operaciones.put("Eliminar", 2);
            operaciones.put("Agregar", 3);
            operaciones.put("Listar", 4);
            operaciones.put("Salir", 5);

            Object[] opArreglo = operaciones.keySet().toArray();
            Object opcion = JOptionPane.showInputDialog(null, "Seleccione una operación"
                    , "Mantenedor de Usuarios", JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);

            if (opcion == null) {
                JOptionPane.showInputDialog(null, "Debe seleccionar una operación");
                opcionIndice = -1;
            } else {
                opcionIndice = operaciones.get(opcion.toString());
                switch (opcionIndice) {
                    case 1:
                        actualizarUsuario(repositorio);
                        break;
                    case 2:
                        eliminarUsuario(repositorio);
                        break;
                    case 3:
                        agregarUsuario(repositorio);
                        break;
                    case 4:
                        listarUsuarios(repositorio);
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "Saliendo del programa");
                        repositorio.cerrarConexion();
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no reconocida");
                }
            }

        } while (opcionIndice != 5);

    }

    private static void agregarUsuario(UsuarioRepositorioImpl repositorio) {
        String username = JOptionPane.showInputDialog("Ingrese el nombre de usuario:");
        String password = JOptionPane.showInputDialog("Ingrese la contraseña:");
        String email = JOptionPane.showInputDialog("Ingrese el email:");

        Usuario nuevoUsuario = new Usuario();
        nuevoUsuario.setUsername(username);
        nuevoUsuario.setPassword(password);
        nuevoUsuario.setEmail(email);

        repositorio.guardar(nuevoUsuario);
        JOptionPane.showMessageDialog(null, "Usuario agregado con éxito");
    }

    private static void eliminarUsuario(UsuarioRepositorioImpl repositorio) {
        // Pedir el ID del usuario a eliminar
        String idStr = JOptionPane.showInputDialog(null, "Ingrese el ID del usuario a eliminar:");
        int id = Integer.parseInt(idStr);

        // Eliminar el usuario de la base de datos
        repositorio.eliminar(id);
        JOptionPane.showMessageDialog(null, "Usuario eliminado exitosamente.");
    }

    private static void actualizarUsuario(UsuarioRepositorioImpl repositorio) {
        // Pedir los datos al usuario
        String idStr = JOptionPane.showInputDialog(null, "Ingrese el ID del usuario a actualizar:");
        int id = Integer.parseInt(idStr);
        String username = JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre de usuario:");
        String password = JOptionPane.showInputDialog(null, "Ingrese la nueva contraseña:");
        String email = JOptionPane.showInputDialog(null, "Ingrese el nuevo email:");

        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setUsername(username);
        usuario.setPassword(password);
        usuario.setEmail(email);

        // Actualizar el usuario en la base de datos
        repositorio.actualizar(usuario);
        JOptionPane.showMessageDialog(null, "Usuario actualizado exitosamente.");

    }
    private static void listarUsuarios(UsuarioRepositorioImpl repositorio) {
        // Obtener la lista de usuarios de la base de datos
        List<Usuario> usuarios = repositorio.listar();

        // Construir una cadena de texto con la información de los usuarios
        StringBuilder sb = new StringBuilder("Usuarios:\n");
        for (Usuario usuario : usuarios) {
            sb.append("ID: ").append(usuario.getId())
                    .append(", Usuario: ").append(usuario.getUsername())
                    .append(", Email: ").append(usuario.getEmail())
                    .append("\n");
        }

        // Mostrar la lista de usuarios
        JOptionPane.showMessageDialog(null, sb.toString());
    }
}
