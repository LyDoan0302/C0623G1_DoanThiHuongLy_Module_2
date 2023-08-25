package case_study_furama_resort.model.repository;

public interface IRepository<E> {
    void display();
    void add(E e);
}
