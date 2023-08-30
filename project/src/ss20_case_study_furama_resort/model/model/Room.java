package ss20_case_study_furama_resort.model.model;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String idFacility, String facilityName, double usingArea, double price, int maxQuantityOfPeople, String rentingType, String freeService) {
        super(idFacility, facilityName, usingArea, price, maxQuantityOfPeople, rentingType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room's information: " + '\t' +
                super.toString() + '\t' +
                ",free service: " + freeService
                ;
    }
}
