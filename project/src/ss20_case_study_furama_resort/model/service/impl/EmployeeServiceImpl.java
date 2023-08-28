package ss20_case_study_furama_resort.model.service.impl;


import ss20_case_study_furama_resort.model.model.Employee;
import ss20_case_study_furama_resort.model.model.Person;
import ss20_case_study_furama_resort.model.repository.IBookingRepository;
import ss20_case_study_furama_resort.model.repository.IEmployeeRepository;
import ss20_case_study_furama_resort.model.repository.impl.EmployeeRepositoryImpl;
import ss20_case_study_furama_resort.model.service.IEmployeeService;

import java.util.List;

public class EmployeeServiceImpl implements IEmployeeService {
    private final IEmployeeRepository employeeRepo = new EmployeeRepositoryImpl();

    @Override
    public List<Employee> display() {
        return this.employeeRepo.display();
    }

    @Override
    public void add(Employee employee) {
        for(Employee ep: employeeRepo.display()) {
            if(employee.getId().equals(ep.getId())) {
                employeeRepo.add(employee);
            }
        }
    }
    @Override
    public void edit(Employee employee) {
        this.employeeRepo.edit(employee);
    }

    @Override
    public void delete(String id) {
        this.employeeRepo.delete(id);
    }

    @Override
    public List<Employee> search(String name) {
        return employeeRepo.search(name);
    }
}
