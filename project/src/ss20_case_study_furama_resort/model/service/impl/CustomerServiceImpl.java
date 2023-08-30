package ss20_case_study_furama_resort.model.service.impl;

import ss20_case_study_furama_resort.model.model.Customer;
import ss20_case_study_furama_resort.model.model.Employee;
import ss20_case_study_furama_resort.model.model.Person;
import ss20_case_study_furama_resort.model.repository.ICustomerRepository;
import ss20_case_study_furama_resort.model.repository.impl.CustomerRepositoryImpl;
import ss20_case_study_furama_resort.model.service.ICustomerService;

import java.util.List;

public class CustomerServiceImpl implements ICustomerService {
    private static final ICustomerRepository customerRepository = new CustomerRepositoryImpl();

    @Override
    public List<Customer> display() {
        return customerRepository.display();
    }

    @Override
    public void add(Customer customer) {
        customerRepository.add(customer);
    }
    @Override
    public void edit(Customer customer) {
        customerRepository.edit(customer);
    }

    @Override
    public void delete(String id) {
        customerRepository.delete(id);
    }

    @Override
    public List<Customer> search(String name) {
        return customerRepository.search(name);
    }


}
