package case_study_furama_resort.model.repository;

import java.util.List;

public interface IPersonRepository<E> extends IRepository{
    void edit(String id);
    void delete(String id);
    List<E> search(String name);
}
