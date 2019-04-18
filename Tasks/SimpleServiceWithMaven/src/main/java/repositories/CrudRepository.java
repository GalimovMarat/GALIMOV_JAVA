package repositories;

import java.sql.SQLException;
import java.util.List;

public interface CrudRepository<T> {

    // Ничег не возвращает, просто сохраняет
    void save(T model);

    // Поиск по id( в частном случае, можно искать по любому полю модели)
    // Возвращает объект класса Т, поэтому в начале Т
    T findById(Long id) throws SQLException;

    //List, потому что возвращает коллекцию объектов.
    List<T> findAll();


}
