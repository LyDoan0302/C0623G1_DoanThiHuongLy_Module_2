package ss20_case_study_furama_resort.model.service;

import ss20_case_study_furama_resort.model.model.Person;

import java.util.List;

public interface IPersonService <E> extends IService<E>{
    void edit(E e);
    void delete(String id);
    List<E> search(String name);

}
