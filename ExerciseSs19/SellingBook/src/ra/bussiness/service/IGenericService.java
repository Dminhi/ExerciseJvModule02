package ra.bussiness.service;

import java.util.List;

public interface IGenericService <T,E>{
    List<T> displayAll();
    T findById(E id);
    void updateById(T t);
    void deleteById(String t);
}
