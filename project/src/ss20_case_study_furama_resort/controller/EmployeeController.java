package ss20_case_study_furama_resort.controller;

import ss20_case_study_furama_resort.model.model.Employee;
import ss20_case_study_furama_resort.model.service.IEmployeeService;
import ss20_case_study_furama_resort.model.service.impl.EmployeeServiceImpl;

import java.util.List;

public class EmployeeController {
    private final IEmployeeService employeeService = new EmployeeServiceImpl();
    public List<Employee> display(){
        return employeeService.display();
    }
    public void add(Employee employee){
        employeeService.add(employee);
    }
    public void edit(Employee employee){
        employeeService.edit(employee);
    }
    public void delete(String id){
        employeeService.delete(id);
    }
    public List<Employee> search(String name){
        return employeeService.search(name);
    }
}
