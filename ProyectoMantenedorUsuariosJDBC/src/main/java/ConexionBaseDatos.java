import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionBaseDatos {
    private static Connection con = null;
    private static final String url = "jdbc:mysql://localhost:3306/mantenedorUsuario";
    private static final String usuario = "root";
    private static final String contraseña = "$1482Zaid$";

    public static Connection conectar() {
        try {
            if (con == null) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(url, usuario, contraseña);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
