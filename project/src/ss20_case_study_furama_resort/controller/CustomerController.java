package ss20_case_study_furama_resort.controller;

import ss20_case_study_furama_resort.model.model.Customer;
import ss20_case_study_furama_resort.model.model.Employee;
import ss20_case_study_furama_resort.model.service.ICustomerService;
import ss20_case_study_furama_resort.model.service.impl.CustomerServiceImpl;

import java.util.List;

public class CustomerController {
    private static final ICustomerService customerService = new CustomerServiceImpl();
    public List<Customer> display(){
        return customerService.display();
    }
    public void add(Customer customer){
        customerService.add(customer);
    }
    public void edit(Customer customer){
        customerService.edit(customer);
    }
    public void delete(String id){
        customerService.delete(id);
    }
    public List<Customer> search(String name){
        return customerService.search(name);
    }
}
