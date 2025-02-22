import java.util.List;

public interface Repositorio<T> {
    List<T> listar();
    T porId(int id);
    void guardar(T t);
    void eliminar(int id);
}
