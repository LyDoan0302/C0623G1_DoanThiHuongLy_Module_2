package ss20_case_study_furama_resort.view;

import ss20_case_study_furama_resort.controller.CustomerController;
import ss20_case_study_furama_resort.controller.EmployeeController;
import ss20_case_study_furama_resort.controller.FacilityController;
import ss20_case_study_furama_resort.model.model.Customer;
import ss20_case_study_furama_resort.model.model.Employee;
import ss20_case_study_furama_resort.model.model.Facility;
import ss20_case_study_furama_resort.utilsFile.AgeValidator;
import ss20_case_study_furama_resort.utilsFile.HandleException;
import ss20_case_study_furama_resort.utilsFile.HandleRegex;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MainView {
    Scanner scanner = new Scanner(System.in);
    private final EmployeeController employeeController = new EmployeeController();
    private final SubEmployeeView subEmployeeView = new SubEmployeeView();
    private final CustomerController customerController = new CustomerController();
    private final SubCustomerView subCustomerView = new SubCustomerView();
    private final FacilityController facilityController = new FacilityController();
    private final SubFacilityView subFacilityView = new SubFacilityView();

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
                    break;
                case 3:
                    this.choiceFacility();
                    break;
                case 4:
                    this.choiceBooking();
                    break;
                case 5:
                    this.choicePromotion();
                    break;
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
                    employeeController.add(subEmployeeView.inputEmployee());
                    System.out.println("Employee's information is created.");
                    return;
                case 3: //edit
                    employeeController.edit(subEmployeeView.editInformation());
                    System.out.println("Employee's information is edited.");
                    return;

                case 4: //delete
                    while (true) {
                        String employeeId = HandleRegex.handleRegex(HandleRegex.EMPLOYEE_ID_REGEX, "employee's id");
                        if (!subEmployeeView.checkInputId(employeeId)) {
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
                    List<Employee> employeesSearchList = employeeController.search(name);
                    if(employeesSearchList.size() == 0) {
                        System.out.println("Name is not exist!");
                    }
                    for(Employee emp : employeesSearchList) {
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
                    for (Customer ctm : customerController.display()) {
                        System.out.println(ctm);
                    }
                    return;
                case 2: //add
                    customerController.add(subCustomerView.inputCustomer());
                    System.out.println("Customer's information is created!");
                    return;
                case 3: //edit
                    customerController.edit(subCustomerView.editInformation());
                    System.out.println("Customer's information is edited!");
                    return;
                case 4: //delete
                    while (true) {
                        String customerId = HandleRegex.handleRegex(HandleRegex.CUSTOMER_ID_REGEX, "customer's id");
                        if (!subCustomerView.checkInputId(customerId)) {
                            System.out.println("Id is not exist!");
                            System.out.print("Input again:");
                        } else {
                            customerController.delete(customerId);
                            System.out.println("Customer's information is removed.");
                            return;
                        }
                    }
                case 5: //search
                    System.out.println("Enter customer's name:");
                    String name = scanner.nextLine();
                    List<Customer> customersSearchList = customerController.search(name);
                    if(customersSearchList.size() == 0) {
                        System.out.println("Name is not exist!");
                    }
                    for(Customer ctm : customersSearchList) {
                        System.out.println(ctm);
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
                    LinkedHashMap<Facility, Integer> linkedHashMap= facilityController.display();
                    for (Map.Entry<Facility,Integer> entry: linkedHashMap.entrySet()) {
                        System.out.println(entry.getKey()+" \nUsed times: " + entry.getValue());
                    }
                    return;
                case 2: //add
                    facilityController.addFacility(subFacilityView.inputFacilityMain());
                    return;
                case 3: //display list facility maintenance
                    facilityController.displayListFacilityMaintain();
                    return;
                case 4: //delete

                    while (true) {
                        System.out.print("Enter facility's id to remove:");
                        String inputId = scanner.nextLine();
                        LinkedHashMap<Facility, Integer> facilityList = facilityController.display();
                        for(Facility f: facilityList.keySet()) {
                            if(inputId.equals(f.getIdFacility())) {
                                facilityController.deleteFacility(inputId);
                                System.out.println("Removed successfully!");
                                return;
                            }
                        }
                            System.out.println("Id is invalid!");
                            System.out.println("Enter again.");
                        }
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

}
