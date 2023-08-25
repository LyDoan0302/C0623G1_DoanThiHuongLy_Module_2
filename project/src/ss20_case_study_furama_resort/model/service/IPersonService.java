package case_study_furama_resort.model.service;

import java.util.List;

public interface IPersonService <E> extends IService{
    void edit(String id);
    void delete(String id);
    List<E> search(String name);
}
