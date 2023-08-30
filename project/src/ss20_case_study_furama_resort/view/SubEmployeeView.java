package ss20_case_study_furama_resort.view;

import ss20_case_study_furama_resort.controller.EmployeeController;
import ss20_case_study_furama_resort.model.model.Employee;
import ss20_case_study_furama_resort.utilsFile.AgeValidator;
import ss20_case_study_furama_resort.utilsFile.HandleException;
import ss20_case_study_furama_resort.utilsFile.HandleRegex;

import java.util.Scanner;

public class SubEmployeeView {
    Scanner scanner = new Scanner(System.in);
    private final EmployeeController employeeController = new EmployeeController();

    public Employee inputEmployee() {
        Employee employee = new Employee();

        while (true) {
            String employeeId = HandleRegex.handleRegex(HandleRegex.EMPLOYEE_ID_REGEX, "employee's id");
            if (!checkInputId(employeeId)) {
                employee.setId(employeeId);
                break;
            } else {
                System.out.println("Id is exist!");
                System.out.print("Input again:");
            }
        }

        String employeeName = HandleRegex.handleRegex(HandleRegex.NAME_REGEX, "Employee name");
        employee.setName(employeeName);

        while (true) {
            String employeeBirth = HandleRegex.handleRegex(HandleRegex.DATE_OF_BIRTH_REGEX, "Employee's birthday");
                if (!AgeValidator.ageValidator(employeeBirth)) {
                    System.out.println("Age must be greater than 18 year old!");
                    System.out.println("Enter again:");
                } else {
                    employee.setBirth(employeeBirth);
                    break;
                }
        }

        while (true) {
            System.out.print("Enter employee's gender (Male or Female):");
            String gender = scanner.nextLine();
            switch (gender) {
                case "Male":
                    employee.setGender("Male");
                    break;
                case "Female":
                    employee.setGender("Female");
                    break;
                default:
                    System.out.println("Gender is invalid!");
                    System.out.print("Enter employee's gender (Male or Female):");
                    gender = scanner.nextLine();
            }
            break;
        }

        String employeePrivateId = HandleRegex.handleRegex(HandleRegex.PRIVATE_ID_REGEX, "Employee's private id");
        employee.setPrivateId(employeePrivateId);

        String employeePhoneNumber = HandleRegex.handleRegex(HandleRegex.PHONE_NUMBER_REGEX, "Employee's phone number");
        employee.setPhoneNumber(employeePhoneNumber);

        String employeeEmail = HandleRegex.handleRegex(HandleRegex.EMAIL_REGEX, "Employee's email");
        employee.setEmail(employeeEmail);

        String employeeLevel = HandleRegex.handleRegex(HandleRegex.ACADEMIC_LEVEL_REGEX, "Employee's academic level");
        employee.setAcademicLevel(employeeLevel);

        String employeePosition = HandleRegex.handleRegex(HandleRegex.POSITION_REGEX, "Employee's position");
        employee.setPosition(employeePosition);

        while (true) {
            System.out.print("Input employee's salary:");
            double salary = HandleException.checkDouble();
            if (salary < 0) {
                System.out.println("Salary is invalid!");
            } else {
                employee.setSalary(salary);
                break;
            }
        }

        return employee;
    }
    public boolean checkInputId(String idInput) {
        for (Employee ep : employeeController.display()) {
            if (idInput.equals(ep.getId())) {
                return true;
            }
        }
        return false;
    }

    public Employee editInformation() {
        Employee employeeToEdit = new Employee();
        while (true) {
            String employeeId = HandleRegex.handleRegex(HandleRegex.EMPLOYEE_ID_REGEX, "employee's id");
            if (!checkInputId(employeeId)) {
                System.out.println("Id is not exist!");
                System.out.print("Input again:");
            } else {
                employeeToEdit.setId(employeeId);
                break;
            }
        }

        String employeeName = HandleRegex.handleRegex(HandleRegex.NAME_REGEX, "Employee name");
        employeeToEdit.setName(employeeName);

        while (true) {
            String employeeBirth = HandleRegex.handleRegex(HandleRegex.DATE_OF_BIRTH_REGEX, "Employee's birthday");
            if (!AgeValidator.ageValidator(employeeBirth)) {
                System.out.println("Age must be greater than 18 year old!");
                System.out.print("Enter again:");
            } else {
                employeeToEdit.setBirth(employeeBirth);
                break;
            }
        }

        while (true) {
            System.out.println("Input employeeToEdit's gender (Male or Female):");
            String gender = scanner.nextLine();
            switch (gender) {
                case "Male":
                    employeeToEdit.setGender("Male");
                    break;
                case "Female":
                    employeeToEdit.setGender("Female");
                    break;
                default:
                    System.out.println("Gender is invalid!");
                    System.out.print("Enter employeeToEdit's gender (Male or Female):");
                    gender = scanner.nextLine();
            }
            break;
        }

        String employeePrivateId = HandleRegex.handleRegex(HandleRegex.PRIVATE_ID_REGEX, "Employee's private id");
        employeeToEdit.setPrivateId(employeePrivateId);

        String employeePhoneNumber = HandleRegex.handleRegex(HandleRegex.PHONE_NUMBER_REGEX, "Employee's phone number");
        employeeToEdit.setPhoneNumber(employeePhoneNumber);

        String employeeEmail = HandleRegex.handleRegex(HandleRegex.EMAIL_REGEX, "Employee's email");
        employeeToEdit.setEmail(employeeEmail);

        String employeeLevel = HandleRegex.handleRegex(HandleRegex.ACADEMIC_LEVEL_REGEX, "Employee's academic level");
        employeeToEdit.setAcademicLevel(employeeLevel);

        String employeePosition = HandleRegex.handleRegex(HandleRegex.POSITION_REGEX, "Employee's position");
        employeeToEdit.setPosition(employeePosition);

        while (true) {
            System.out.print("Enter employeeToEdit's salary:");
            double salary = HandleException.checkDouble();
            if (salary < 0) {
                System.out.println("Salary is invalid!");
            } else {
                employeeToEdit.setSalary(salary);
                break;
            }
        }

        return employeeToEdit;

    }
}
