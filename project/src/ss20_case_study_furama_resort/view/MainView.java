package ss20_case_study_furama_resort.view;

import ss20_case_study_furama_resort.controller.EmployeeController;
import ss20_case_study_furama_resort.model.model.Employee;
import ss20_case_study_furama_resort.utilsFile.AgeValidator;
import ss20_case_study_furama_resort.utilsFile.HandleException;
import ss20_case_study_furama_resort.utilsFile.Regex;

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
                    System.out.println(employeeController.display());
                    return;
                case 2: //add
                    Employee employee = inputEmployee();
                    employeeController.add(employee);

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
            System.out.println("Input employee's Id:");
            String employeeId = scanner.nextLine();
            if(!Regex.employeeIdRegex(employeeId)){
                System.out.println("Employee's id is wrong format!");
                System.out.println("Input again:");
            } else {
                employee.setId(employeeId);
                break;
            }
        }
        while (true) {
            System.out.println("Input employee's name:");
            String employeeName = scanner.nextLine();
            if(!Regex.nameRegex(employeeName)){
                System.out.println("Employee's name is wrong format!");
                System.out.println("Input again:");
            } else {
                employee.setName(employeeName);
                break;
            }
        }
        while (true) {
            System.out.println("Input employee's birthday:");
            String dateOfBirth = scanner.nextLine();
            if(!AgeValidator.ageValidator(dateOfBirth)) {
                System.out.println("Employee's birthday is wrong format!");
                System.out.println("Input again:");
            } else {
                employee.setBirth(dateOfBirth);
                break;
            }
        }
        while (true) {
            System.out.println("Input employee's gender (Male or Female):");
            String gender = scanner.nextLine();
            switch (gender) {
                case "Male" :
                    employee.setGender("Male");
                    break;
                case "Female" :
                    employee.setGender("Female");
                    break;
                default:
                    System.out.println("Gender is invalid!");
                   // System.out.println("Input again:");
            }
            break;
        }
        while (true) {
            System.out.println("Input employee's privateId: ");
            String privateId = scanner.nextLine();
            if (!Regex.privateIdRegex(privateId)) {
                System.out.println("privateId is wrong format!");
            } else {
                employee.setPrivateId(privateId);
                break;
            }
        }
        while (true) {
            System.out.println("Input employee's phone number:");
            String phoneNumber = scanner.nextLine();
            if(!Regex.phoneNumberRegex(phoneNumber)) {
                System.out.println("phone number is wrong format!");
            } else {
                employee.setPhoneNumber(phoneNumber);
                break;
            }
        }
        while (true) {
            System.out.println("Input employee's email: ");
            String email = scanner.nextLine();
            if(!Regex.employeeIdRegex(email)) {
                System.out.println("Email is wrong format!");
            } else {
                employee.setEmail(email);
                break;
            }
        }
        while (true) {
            System.out.println("Input employee's level of academic" +
                    "(TC: trung cap; CD: cao dang; DH: dai hoc; SDH: sau dai hoc):");
            String acdLevel = scanner.nextLine();
            switch (acdLevel) {
                case "TC" :
                    employee.setAcademicLevel("Trung cap");
                    break;
                case "CD" :
                    employee.setAcademicLevel("Cao dang");
                    break;
                case "DH" :
                    employee.setAcademicLevel("Dai hoc");
                    break;
                case "SDH" :
                    employee.setAcademicLevel("Sau dai hoc");
                    break;
                default:
                    System.out.println("invalid!");
                    break;
            }
            break;
        }
        while (true) {
            System.out.println("Input employee's position" +
                    "(LT: le tan; PV: phuc vu; CV: chuyen vien; GS: giam sat; QL: quan ly; GD: giam doc):");
            String position = scanner.nextLine();
            switch (position) {
                case "LT" :
                    employee.setPosition("Le tan");
                    break;
                case "PV" :
                    employee.setPosition("Phuc vu");
                    break;
                case "CV" :
                    employee.setPosition("Chuyen vien");
                    break;
                case "GS" :
                    employee.setPosition("Giam sat");
                    break;
                case "QL" :
                    employee.setPosition("Quan ly");
                    break;
                case "GD" :
                    employee.setPosition("Giam doc");
                    break;
                default:
                    System.out.println("invalid!");
                    break;
            }
            break;
        }

        return employee;
    }
}
