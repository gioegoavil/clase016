
package pe.edu.utp.clase16.dao;

import java.util.List;

/**
 *
 * @author GamingWorld
 * @param <T>
 */
public interface Operaciones<T> {
    int create(T t);
    int update(T t);
    int delete(int id);
    T read(int id);
    List<T> readAll();
}
