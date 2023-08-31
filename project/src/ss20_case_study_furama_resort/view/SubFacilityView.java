package ss20_case_study_furama_resort.view;

import ss20_case_study_furama_resort.controller.FacilityController;
import ss20_case_study_furama_resort.model.model.Facility;
import ss20_case_study_furama_resort.model.model.House;
import ss20_case_study_furama_resort.model.model.Room;
import ss20_case_study_furama_resort.model.model.Villa;
import ss20_case_study_furama_resort.utilsFile.HandleException;
import ss20_case_study_furama_resort.utilsFile.HandleRegex;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SubFacilityView {
    Scanner scanner = new Scanner(System.in);
    private static final FacilityController facilityController = new FacilityController();
    private static LinkedHashMap<Facility, Integer> facilityList = facilityController.display();
    static SubFacilityView subFacilityView = new SubFacilityView();


    public static void showFacilityInputMenu() {
        System.out.println("===Facility input menu===");
        System.out.println("1.  Room");
        System.out.println("2.  Villa");
        System.out.println("3.  House");
        System.out.println("4.  Back to input menu.");
    }

    public Facility inputFacilityMain() {
        showFacilityInputMenu();
        System.out.print("Choice: ");
        int choice = HandleException.checkInt();
        while (true) {

            switch (choice) {
                case 1:
                    Facility facilityRoom = inputRoom();
                    System.out.println("New room is created successfully!");
                    return  facilityRoom;
                case 2:
                    Facility facilityVilla = inputVilla();
                    System.out.println("New villa is created successfully!");
                    return facilityVilla;
                case 3:
                    Facility facilityHouse = inputHouse();
                    System.out.println("New house is created successfully!");
                    return  facilityHouse;
                case 4:
                    inputFacilityMain();
                default:
                    System.out.println("Choice is invalid!");
                    System.out.print("Enter again: ");
                    choice = HandleException.checkInt();
            }
        }
    }

    public static Room inputRoom() {
        Room newRoom = new Room();

        String facilityId;
        String facilityName;
        double usingArea;
        double price;
        int maxQuantityOfPeople;
        String rentingType;
        String freeService;

        // Enter facility-room id:
        while (true) {
            facilityId = HandleRegex.handleRegex(HandleRegex.FACILITY_ROOM_ID_REGEX, "facility's id");
            if (!checkFacilityKey(facilityId)) {
                newRoom.setIdFacility(facilityId);
                break;
            } else {
                System.out.println("Id is exist!");
                System.out.println("Enter again.");
            }
        }

        // Enter facility-room name:
        facilityName = HandleRegex.handleRegex(HandleRegex.FACILITY_NAME_GENERAL_REGEX, "facility's name");
        newRoom.setFacilityName(facilityName);
        // Enter facility-room using area:
        while (true) {
            System.out.print("Enter using area: ");
            usingArea = HandleException.checkDouble();
            if (usingArea > 0 && usingArea > 30) {
                newRoom.setUsingArea(usingArea);
                break;
            } else {
                System.out.println("Using area needs to be greater than 30m^2!");
                System.out.println("Enter again.");
            }
        }

        // Enter renting price:
        System.out.print("Enter price: ");
        price = HandleException.checkDouble();
        newRoom.setPrice(price);

        // Enter max quantity of people:
        while (true) {
            System.out.print("Enter max quantity of people: ");
            maxQuantityOfPeople = HandleException.checkInt();
            if(maxQuantityOfPeople > 0 && maxQuantityOfPeople < 20) {
                newRoom.setMaxQuantityOfPeople(maxQuantityOfPeople);
                break;
            }
            System.out.println("Max quantity of people needs to be less than 20!");
            System.out.println("Enter again.");
        }

        // Enter renting type:
        rentingType = HandleRegex.handleRegex(HandleRegex.RENTING_TYPE_REGEX, "renting type ");
        newRoom.setRentingType(rentingType);

        // Enter free service:
        freeService = HandleRegex.handleRegex(HandleRegex.FACILITY_NAME_GENERAL_REGEX, "free service ");
        newRoom.setFreeService(freeService);

        return newRoom;
    }

    public static Villa inputVilla() {
        Villa newVilla = new Villa();
        String facilityId;
        String facilityName;
        double usingArea;
        double price;
        int maxQuantityOfPeople;
        String rentingType;
        double poolArea;
        String standardOfVillaRoom;
        int numberOfFloorInVilla;

        // Enter facility-villa id:
        while (true) {

            facilityId = HandleRegex.handleRegex(HandleRegex.FACILITY_VILLA_ID_REGEX, "facility's id");
            if (!checkFacilityKey(facilityId)) {
                newVilla.setIdFacility(facilityId);
                break;
            } else {
                System.out.println("Id is exist!");
                System.out.println("Enter again.");
            }
        }

        // Enter facility-room name:
        facilityName = HandleRegex.handleRegex(HandleRegex.FACILITY_NAME_GENERAL_REGEX, "facility's name");
        newVilla.setFacilityName(facilityName);
        // Enter facility-room using area:
        while (true) {
            System.out.print("Enter using area: ");
            usingArea = HandleException.checkDouble();
            if (usingArea > 0 && usingArea > 30) {
                newVilla.setUsingArea(usingArea);
                break;
            } else {
                System.out.println("Using area needs to be greater than 30m^2!");
                System.out.println("Enter again.");
            }
        }

        // Enter renting price:
        System.out.print("Enter price: ");
        price = HandleException.checkDouble();
        newVilla.setPrice(price);

        // Enter max quantity of people:
        while (true) {
            System.out.print("Enter max quantity of people: ");
            maxQuantityOfPeople = HandleException.checkInt();
            if(maxQuantityOfPeople > 0 && maxQuantityOfPeople < 20) {
                newVilla.setMaxQuantityOfPeople(maxQuantityOfPeople);
                break;
            } else {
                System.out.println("Max quantity of people needs to be less than 20!");
                System.out.println("Enter again.");
            }
        }

        // Enter renting type:
        rentingType = HandleRegex.handleRegex(HandleRegex.RENTING_TYPE_REGEX, "renting type");
        newVilla.setRentingType(rentingType);

        // Enter pool's area:
        while (true) {
            System.out.print("Enter pool area: ");
             poolArea = HandleException.checkDouble();
            if (poolArea > 0 &&  poolArea > 30) {
                newVilla.setPoolArea(poolArea);
                break;
            } else {
                System.out.println("Pool area needs to be greater than 30m^2!");
                System.out.println("Enter again.");
            }
        }

        // Enter villa room's standard:
        standardOfVillaRoom = HandleRegex.handleRegex(HandleRegex.FACILITY_NAME_GENERAL_REGEX, "villa room's standard ");
        newVilla.setStandardOfVillaRoom(standardOfVillaRoom);

        // Enter number of floor of villa:
        System.out.print("Enter number of villa's:");
        numberOfFloorInVilla = HandleException.checkInt();
        newVilla.setNumberOfFloorInVilla(numberOfFloorInVilla);

        return newVilla;
    }

    public static House inputHouse() {
        House newHouse = new House();
        String facilityId;
        String facilityName;
        double usingArea;
        double price;
        int maxQuantityOfPeople;
        String rentingType;
        String standardOfHouseRoom;
        int numberOfFloorInHouse;

        // Enter facility-house id:
        while (true) {

            facilityId = HandleRegex.handleRegex(HandleRegex.FACILITY_HOUSE_ID_REGEX, "facility's id");
            if (!checkFacilityKey(facilityId)) {
                newHouse.setIdFacility(facilityId);
                break;
            } else {
                System.out.println("Id is exist!");
                System.out.println("Enter again.");
            }
        }

        // Enter facility-house name:
        facilityName = HandleRegex.handleRegex(HandleRegex.FACILITY_NAME_GENERAL_REGEX, "facility's name");
        newHouse.setFacilityName(facilityName);
        // Enter facility-house using area:
        while (true) {
            System.out.print("Enter using area: ");
            usingArea = HandleException.checkDouble();
            if (usingArea > 0 && usingArea > 30) {
                newHouse.setUsingArea(usingArea);
                break;
            } else {
                System.out.println("Using area needs to be greater than 30m^2!");
                System.out.println("Enter again.");
            }
        }

        // Enter renting price:
        System.out.print("Enter price: ");
        price = HandleException.checkDouble();
        newHouse.setPrice(price);

        // Enter max quantity of people:
        while (true) {
            System.out.print("Enter max quantity of people: ");
            maxQuantityOfPeople = HandleException.checkInt();
            if(maxQuantityOfPeople > 0 && maxQuantityOfPeople < 20) {
                newHouse.setMaxQuantityOfPeople(maxQuantityOfPeople);
                break;
            } else {
                System.out.println("Max quantity of people needs to be less than 20!");
                System.out.println("Enter again.");
            }
        }

        // Enter renting type:
        rentingType = HandleRegex.handleRegex(HandleRegex.RENTING_TYPE_REGEX, "renting type ");
        newHouse.setRentingType(rentingType);


        // Enter houseroom's standard:
        standardOfHouseRoom = HandleRegex.handleRegex(HandleRegex.FACILITY_NAME_GENERAL_REGEX, "house room's standard ");
        newHouse.setStandardOfHouseRoom(standardOfHouseRoom);

        // Enter number of floor of house:
        System.out.print("Enter number of house's floor: ");
        numberOfFloorInHouse = HandleException.checkInt();
        newHouse.setNumberOfFloorInHouse(numberOfFloorInHouse);

        return newHouse;
    }

    public static boolean checkFacilityKey(String inputId) {
        for (Facility f : facilityList.keySet()) {
            if (inputId.equals(f.getIdFacility())) {
                return true;
            }
        }
        return false;
    }

}