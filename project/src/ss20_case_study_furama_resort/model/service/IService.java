package ss20_case_study_furama_resort.model.service;

import java.util.List;

public interface IService <E> {
    List<E> display();
    void add(E e);
}
