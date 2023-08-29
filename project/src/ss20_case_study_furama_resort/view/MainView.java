package ss20_case_study_furama_resort.view;

import ss20_case_study_furama_resort.controller.EmployeeController;
import ss20_case_study_furama_resort.model.model.Employee;
import ss20_case_study_furama_resort.utilsFile.AgeValidator;
import ss20_case_study_furama_resort.utilsFile.HandleException;
import ss20_case_study_furama_resort.utilsFile.HandleRegex;

import java.util.Scanner;

public class MainView {
    Scanner scanner = new Scanner(System.in);
    private final EmployeeController employeeController = new EmployeeController();

    public void render() {
        displayMainMenu();
        System.out.print("Choice: ");
        int option = HandleException.checkInt();
        while (true) {
            switch (option) {
                case 1:
                    this.choiceEmployee();
                    break;
                case 2:
                    this.choiceCustomer();
                    return;
                case 3:
                    this.choiceFacility();
                    return;
                case 4:
                    this.choiceBooking();
                    return;
                case 5:
                    this.choicePromotion();
                    return;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Enter again!");
                    System.out.print("Choice: ");
                    option = HandleException.checkInt();
            }
        }
    }

    public void displayMainMenu() {
        System.out.println("===Main Menu===");
        System.out.println("1.\tEmployee Management");
        System.out.println("2.\tCustomer Management");
        System.out.println("3.\tFacility Management ");
        System.out.println("4.\tBooking Management");
        System.out.println("5.\tPromotion Management");
        System.out.println("6.\tExit");
    }

    public void choiceEmployee() {

        this.displayEmployeeMenu();
        System.out.print("Choice: ");
        int option = HandleException.checkInt();
        while (true) {
            switch (option) {
                case 1: //display
                    for (Employee ep : employeeController.display()) {
                        System.out.println(ep);
                    }
                    return;
                case 2: //add
                    employeeController.add(inputEmployee());
                    System.out.println("Employee's information is created.");
                    return;
                case 3: //edit
                    employeeController.edit(editInformation());
                    System.out.println("Employee's information is edited.");
                    return;

                case 4: //delete
                    while (true) {
                        String employeeId = HandleRegex.handleRegex(HandleRegex.EMPLOYEE_ID_REGEX, "employee's id");
                        if (!checkInputId(employeeId)) {
                            System.out.println("Id is not exist!");
                            System.out.print("Input again:");
                        } else {
                            employeeController.delete(employeeId);
                            System.out.println("Employee's information is removed.");
                            return;
                        }
                    }

                case 5: //search
                    System.out.println("Enter employee's name:");
                    String name = scanner.nextLine();
                    for(Employee emp : employeeController.search(name)) {
                        System.out.println(emp);
                    }
                    return;
                case 6:
                    this.render();

                default:
                    System.out.println("Enter again!");
                    System.out.print("Choice: ");
                    option = HandleException.checkInt();

            }

        }
    }

    public void displayEmployeeMenu() {
        System.out.println("===Employee Menu===");
        System.out.println("1\tDisplay list employees");
        System.out.println("2\tAdd new employee");
        System.out.println("3\tEdit employee");
        System.out.println("4\tDelete employee");
        System.out.println("5\tSearch by name employee");
        System.out.println("6\tReturn main menu");
    }

    public void choiceCustomer() {
        this.displayCustomerMenu();
        System.out.print("Choice:");
        int option = HandleException.checkInt();
        while (true) {
            switch (option) {
                case 1: //display
                    employeeController.display();
                    return;
                case 2: //add

                    return;
                case 3: //edit

                    return;
                case 4: //delete

                    return;
                case 5: //search

                    return;
                case 6:
                    this.render();
                default:
                    System.out.println("Enter again!");
                    System.out.print("Choice: ");
                    option = HandleException.checkInt();

            }
        }
    }

    public void displayCustomerMenu() {
        System.out.println("===Customer Menu===");
        System.out.println("1.\tDisplay list customers");
        System.out.println("2.\tAdd new customer");
        System.out.println("3.\tEdit customer");
        System.out.println("4.\tDelete customer");
        System.out.println("5.\tSearch by name customer");
        System.out.println("6.\tReturn main menu");
    }

    public void choiceFacility() {
        this.displayFacilityMenu();
        System.out.print("Choice:");
        int option = HandleException.checkInt();
        while (true) {
            switch (option) {
                case 1: //display

                    return;
                case 2: //add

                    return;
                case 3: //display list facility maintenance

                    return;
                case 4: //delete

                    return;
                case 5:
                    this.render();
                default:
                    System.out.println("Enter again!");
                    System.out.print("Choice: ");
                    option = HandleException.checkInt();
            }
        }
    }

    public void displayFacilityMenu() {
        System.out.println("===Facility Menu===");
        System.out.println("1\tDisplay list facility");
        System.out.println("2\tAdd new facility");
        System.out.println("3\tDisplay list facility maintenance");
        System.out.println("4\tDelete facility");
        System.out.println("5\tReturn main menu");
    }

    public void choiceBooking() {
        this.displayBookingMenu();
        System.out.print("Choice:");
        int option = HandleException.checkInt();
        while (true) {
            switch (option) {
                case 1: //display

                    return;
                case 2: //add

                    return;
                case 3: //edit

                    return;
                case 4: //delete

                    return;
                case 5: //search

                    return;
                case 6:
                    this.render();

                default:
                    System.out.println("Enter again!");
                    System.out.print("Choice: ");
                    option = HandleException.checkInt();
            }
        }
    }

    public void displayBookingMenu() {
        System.out.println("===Booking Menu===");
        System.out.println("1.\tAdd new booking");
        System.out.println("2.\tDisplay list booking");
        System.out.println("3.\tCreate new contracts");
        System.out.println("4.\tDisplay list contracts");
        System.out.println("5.\tEdit contracts");
        System.out.println("6.\tReturn main menu");
    }

    public void choicePromotion() {
        this.displayPromotionMenu();
        System.out.print("Choice: ");
        int option = HandleException.checkInt();
        while (true) {
            switch (option) {
                case 1: //display list customers use service

                    return;
                case 2: //display list customers get voucher

                    return;
                case 3: //
                    this.render();

                default:
                    System.out.println("Enter again!");
                    System.out.print("Choice: ");
                    option = HandleException.checkInt();
            }
        }
    }

    public void displayPromotionMenu() {
        System.out.println("===Promotion Menu===");
        System.out.println("1.\tDisplay list customers use service");
        System.out.println("2.\tDisplay list customers get voucher");
        System.out.println("3.\tReturn main menu");
    }


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
