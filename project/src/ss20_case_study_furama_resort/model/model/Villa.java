package ss20_case_study_furama_resort.model.model;

public class Villa extends Facility{
    private String standardOfVillaRoom;
    private double poolArea;
    private int numberOfFloorInVilla;
    public Villa() {

    }
    public Villa(String idFacility, String facilityName, double usingArea, double price,
                 int maxQuantityOfPeople, String rentingType, String standardOfVillaRoom, double poolArea, int numberOfFloorInVilla ) {
        super(idFacility, facilityName, usingArea, price, maxQuantityOfPeople, rentingType);
        this.standardOfVillaRoom = standardOfVillaRoom;
        this.poolArea = poolArea;
        this.numberOfFloorInVilla = numberOfFloorInVilla;

    }
    public String getStandardOfVillaRoom() {
        return standardOfVillaRoom;
    }

    public void setStandardOfVillaRoom(String standardOfVillaRoom) {
        this.standardOfVillaRoom = standardOfVillaRoom;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloorInVilla() {
        return numberOfFloorInVilla;
    }

    public void setNumberOfFloorInVilla(int numberOfFloorInVilla) {
        this.numberOfFloorInVilla = numberOfFloorInVilla;
    }


}
