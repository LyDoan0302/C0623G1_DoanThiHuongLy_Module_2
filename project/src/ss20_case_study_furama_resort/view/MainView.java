package case_study_furama_resort.view;

import case_study_furama_resort.utilsFile.HandleException;

import java.util.Scanner;

public class MainView {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new MainView().Render();
    }

    public void Render() {
        displayMainMenu();
        System.out.print("Choice: ");
        int option = HandleException.checkInt();
        while (true) {
            switch (option) {
                case 1:
                    this.choiceEmployee();
                    return;
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
                    this.displayMainMenu();//??? vi sao hien menu >> dung chuong trinh luon
                    return;

                default:
                    //System.out.println("Enter again!");
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
                    this.displayMainMenu();
                    return;
                default:
                    //System.out.println("Enter again:");
                    System.out.print("Choice:");
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
                    this.displayMainMenu(); //???
                    return;
                default:
                    // System.out.println("Enter again:");
                    System.out.print("Choice:");
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
                    this.displayMainMenu();
                    return;
                default:
                    // System.out.println("Enter again:");
                    System.out.print("Choice:");
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
                    this.displayMainMenu();
                    return;
                default:
                    //  System.out.println("Enter again:");
                    System.out.print("Choice:");
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
