package ss20_case_study_furama_resort.model.repository;

import java.util.List;

public interface IRepository<E> {
    List<E> display();
    void add(E e);
}
