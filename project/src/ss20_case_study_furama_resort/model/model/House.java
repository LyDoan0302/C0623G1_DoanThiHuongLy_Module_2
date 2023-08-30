package ss20_case_study_furama_resort.model.model;

public class House extends Facility{
    private String standardOfHouseRoom;
    private int numberOfFloorInHouse;
    public House() {
    }
    public House(String idFacility, String facilityName, double usingArea, double price, int maxQuantityOfPeople,
                 String rentingType, String standardOfHouseRoom, int numberOfFloorInHouse) {
        super(idFacility, facilityName, usingArea,price,maxQuantityOfPeople, rentingType);
        this.standardOfHouseRoom =standardOfHouseRoom;
        this.numberOfFloorInHouse = numberOfFloorInHouse;
    }

    public String getStandardOfHouseRoom() {
        return standardOfHouseRoom;
    }

    public void setStandardOfHouseRoom(String standardOfHouseRoom) {
        this.standardOfHouseRoom = standardOfHouseRoom;
    }

    public int getNumberOfFloorInHouse() {
        return numberOfFloorInHouse;
    }

    public void setNumberOfFloorInHouse(int numberOfFloorInHouse) {
        this.numberOfFloorInHouse = numberOfFloorInHouse;
    }

    @Override
    public String toString() {
        return "House's information: " + '\t' +
                super.toString() + '\t' +
                ",standard of house's room: " + standardOfHouseRoom + '\t' +
                ",number of floor in house: " + numberOfFloorInHouse
                ;
    }
}
