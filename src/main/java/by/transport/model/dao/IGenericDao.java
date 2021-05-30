package by.transport.model.dao;

import java.util.List;

public interface IGenericDao <T> {
    void save(T entity);
    void update(T entity);
    void delete(T entity);
    T getById(int entityId);
    List<T> getAll();
    void deleteById(int entityId);
}
