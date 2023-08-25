package case_study_furama_resort.model.model;

public abstract class Facility {
    private String idFacility;
    private String facilityName;
    private double usingArea;
    private double price;
    private int maxQuantityOfPeople;
    private String rentingType;

    protected Facility() {

    }
    protected Facility(String idFacility, String facilityName, double usingArea, double price,
                       int maxQuantityOfPeople, String rentingType) {
        this.idFacility = idFacility;
        this.facilityName = facilityName;
        this.usingArea = usingArea;
        this.price = price;
        this.maxQuantityOfPeople = maxQuantityOfPeople;
        this.rentingType = rentingType;

    }
    public String getIdFacility() {
        return idFacility;
    }

    public void setIdFacility(String idFacility) {
        this.idFacility = idFacility;
    }

    public String getFacilityName() {
        return facilityName;
    }

    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
    }

    public double getUsingArea() {
        return usingArea;
    }

    public void setUsingArea(double usingArea) {
        this.usingArea = usingArea;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMaxQuantityOfPeople() {
        return maxQuantityOfPeople;
    }

    public void setMaxQuantityOfPeople(int maxQuantityOfPeople) {
        this.maxQuantityOfPeople = maxQuantityOfPeople;
    }

    public String getRentingType() {
        return rentingType;
    }

    public void setRentingType(String rentingType) {
        this.rentingType = rentingType;
    }




}
