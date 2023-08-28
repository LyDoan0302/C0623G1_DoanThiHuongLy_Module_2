package ss20_case_study_furama_resort.model.repository;

import ss20_case_study_furama_resort.model.model.Person;

import java.util.List;

public interface IPersonRepository<E> extends IRepository<E> {
    void edit(E e);
    void delete(String id);
    List<E> search(String name);
}
