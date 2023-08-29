package ss20_case_study_furama_resort.model.repository.impl;

import ss20_case_study_furama_resort.model.model.Employee;
import ss20_case_study_furama_resort.model.model.Person;
import ss20_case_study_furama_resort.model.repository.IEmployeeRepository;
import ss20_case_study_furama_resort.utilsFile.ReadAndWriteByCharacterStream;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class EmployeeRepositoryImpl implements IEmployeeRepository {

    public static final String COMMA = ",";
    private static final String PATH_NAME = "/Users/mac/Documents/GitHub_ver2/C0623G1_DoanThiHuongLy_Module_2/project/src/ss20_case_study_furama_resort/data/Employee.csv";

    @Override
    public List<Employee> display() {
        List<Employee> employeeList = this.convertToEmployee();
        return employeeList;
    }

    @Override
    public void add(Employee employee) {
        List<Employee> employeeList = this.convertToEmployee();
        employeeList.add(employee);
        ReadAndWriteByCharacterStream.writeByCharacterStream(PATH_NAME, convertToString(employeeList));
    }
    @Override
    public void edit(Employee employee) {
        List<Employee> employeeList = this.convertToEmployee();
        for(Employee ep : employeeList) {
            if(employee.getId().equals(ep.getId())) {
                ep.setName(employee.getName());
                ep.setBirth(employee.getBirth());
                ep.setGender(employee.getGender());
                ep.setPrivateId(employee.getPrivateId());
                ep.setPhoneNumber(employee.getPhoneNumber());
                ep.setEmail(employee.getEmail());
                ep.setAcademicLevel(employee.getAcademicLevel());
                ep.setPosition(employee.getPosition());
                ep.setSalary(employee.getSalary());
            }
        }
        ReadAndWriteByCharacterStream.writeByCharacterStream(PATH_NAME,convertToString(employeeList));
    }

    @Override
    public void delete(String id) {
        List<Employee> employeeList = this.convertToEmployee();
        for(Employee ep : employeeList) {
            if(id.equals(ep.getId())) {
                employeeList.remove(ep);
                break;
            }
        }
        ReadAndWriteByCharacterStream.writeByCharacterStream(PATH_NAME,convertToString(employeeList));
    }

    @Override
    public List<Employee> search(String name) {
        List<Employee> employeeList = this.convertToEmployee();
        List<Employee> employeesSearchList = new ArrayList<>();
        for(Employee ep: employeeList) {
            if(ep.getName().contains(name)) {
                employeesSearchList.add(ep);
            }
        }
        return employeesSearchList;
    }
    public List<Employee> convertToEmployee() {
        List<Employee> employeeList = new ArrayList<>();
        List<String> stringList = ReadAndWriteByCharacterStream.readByCharacterStream(PATH_NAME);
        String[] array;
        for(String employee: stringList) {
             array = employee.split(COMMA);
            employeeList.add(new Employee(
                    array[0],
                    array[1],
                    array[2],
                    array[3],
                    array[4],
                    array[5],
                    array[6],
                    array[7],
                    array[8],
                    Double.parseDouble(array[9])));
        }
        return employeeList;
    }
    public List<String> convertToString(List<Employee> employeeList) {
        List<String> employeeStringList = new ArrayList<>();
        for(Employee emp : employeeList) {
            employeeStringList.add(emp.getId() + COMMA +
                    emp.getName() + COMMA +
                    emp.getBirth() + COMMA +
                    emp.getGender() + COMMA +
                    emp.getPrivateId() + COMMA +
                    emp.getPhoneNumber() + COMMA +
                    emp.getEmail() + COMMA +
                    emp.getAcademicLevel() + COMMA +
                    emp.getPosition() + COMMA +
                    emp.getSalary());
        }
        return employeeStringList;
    }
//    public List<Employee> getEmployeeList(){
//         List<Employee> employeeStringList = new ArrayList<>();
//         employeeStringList = convertToEmployee(ReadAndWriteByCharacterStream.readByCharacterStream(PATH_NAME));
//        return employeeStringList;
//    }


}
