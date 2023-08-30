package ss20_case_study_furama_resort.view;

import ss20_case_study_furama_resort.controller.CustomerController;
import ss20_case_study_furama_resort.model.model.Customer;
import ss20_case_study_furama_resort.model.model.Employee;
import ss20_case_study_furama_resort.utilsFile.AgeValidator;
import ss20_case_study_furama_resort.utilsFile.HandleException;
import ss20_case_study_furama_resort.utilsFile.HandleRegex;

import java.util.Scanner;

public class SubCustomerView {
    Scanner scanner = new Scanner(System.in);
    private static final CustomerController customerController = new CustomerController();

    public Customer inputCustomer() {
        Customer customer = new Customer();
        while (true) {
            String customerId = HandleRegex.handleRegex(HandleRegex.CUSTOMER_ID_REGEX, "customer's id");
            if (!checkInputId(customerId)) {
                customer.setId(customerId);
                break;
            } else {
                System.out.println("Id is exist!");
                System.out.print("Input again:");
            }
        }

        String customerName = HandleRegex.handleRegex(HandleRegex.NAME_REGEX, "customer name");
        customer.setName(customerName);

        while (true) {
            String customerBirth = HandleRegex.handleRegex(HandleRegex.DATE_OF_BIRTH_REGEX, "customer's birthday");
            if (!AgeValidator.ageValidator(customerBirth)) {
                System.out.println("Age must be greater than 18 year old!");
                System.out.println("Enter again:");
            } else {
                customer.setBirth(customerBirth);
                break;
            }
        }

        while (true) {
            System.out.print("Enter customer's gender (Male or Female):");
            String gender = scanner.nextLine();
            switch (gender) {
                case "Male":
                    customer.setGender("Male");
                    break;
                case "Female":
                    customer.setGender("Female");
                    break;
                default:
                    System.out.println("Gender is invalid!");
                    System.out.print("Enter customer's gender (Male or Female):");
                    gender = scanner.nextLine();
            }
            break;
        }

        String customerPrivateId = HandleRegex.handleRegex(HandleRegex.PRIVATE_ID_REGEX, "customer's private id");
        customer.setPrivateId(customerPrivateId);

        String customerPhoneNumber = HandleRegex.handleRegex(HandleRegex.PHONE_NUMBER_REGEX, "customer's phone number");
        customer.setPhoneNumber(customerPhoneNumber);

        String customerEmail = HandleRegex.handleRegex(HandleRegex.EMAIL_REGEX, "customer's email");
        customer.setEmail(customerEmail);

        String customerAddress = HandleRegex.handleRegex(HandleRegex.ADDRESS_REGEX, "customer's address");
        customer.setAddress(customerAddress);

        String customerClass = HandleRegex.handleRegex(HandleRegex.CUSTOMER_CLASS_REGEX, "customer class");
        customer.setCustomerClass(customerClass);

        return customer;
    }
    public boolean checkInputId(String idInput) {
        for (Customer ctm : customerController.display()) {
            if (idInput.equals(ctm.getId())) {
                return true;
            }
        }
        return false;
    }

    public Customer editInformation() {
        Customer customerToEdit = new Customer();
        while (true) {
            String customerId = HandleRegex.handleRegex(HandleRegex.CUSTOMER_ID_REGEX, "customer's id");
            if (!checkInputId(customerId)) {
                System.out.println("Id is not exist!");
                System.out.print("Input again:");
            } else {
                customerToEdit.setId(customerId);
                break;
            }
        }

        String customerName = HandleRegex.handleRegex(HandleRegex.NAME_REGEX, "customer's name");
        customerToEdit.setName(customerName);

        while (true) {
            String customerBirth = HandleRegex.handleRegex(HandleRegex.DATE_OF_BIRTH_REGEX, "customer's birthday");
            if (!AgeValidator.ageValidator(customerBirth)) {
                System.out.println("Age must be greater than 18 year old!");
                System.out.print("Enter again:");
            } else {
                customerToEdit.setBirth(customerBirth);
                break;
            }
        }

        while (true) {
            System.out.println("Enter customer's gender (Male or Female) to edit:");
            String gender = scanner.nextLine();
            switch (gender) {
                case "Male":
                    customerToEdit.setGender("Male");
                    break;
                case "Female":
                    customerToEdit.setGender("Female");
                    break;
                default:
                    System.out.println("Gender is invalid!");
                    System.out.print("Enter customer's gender (Male or Female) to edit:");
                    gender = scanner.nextLine();
            }
            break;
        }

        String customerPrivateId = HandleRegex.handleRegex(HandleRegex.PRIVATE_ID_REGEX, "customer's private id");
        customerToEdit.setPrivateId(customerPrivateId);

        String customerPhoneNumber = HandleRegex.handleRegex(HandleRegex.PHONE_NUMBER_REGEX, "customer's phone number");
        customerToEdit.setPhoneNumber(customerPhoneNumber);

        String customerEmail = HandleRegex.handleRegex(HandleRegex.EMAIL_REGEX, "customer's email");
        customerToEdit.setEmail(customerEmail);

        String customerAddress = HandleRegex.handleRegex(HandleRegex.ADDRESS_REGEX, "customer's address");
        customerToEdit.setAddress(customerAddress);

        String customerClass = HandleRegex.handleRegex(HandleRegex.CUSTOMER_CLASS_REGEX, "customer class");
        customerToEdit.setCustomerClass(customerClass);

        return customerToEdit;
    }
}
