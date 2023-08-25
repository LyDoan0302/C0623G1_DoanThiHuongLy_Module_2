package case_study_furama_resort.model.model;

public class Customer extends Person{
    private String address;
    private String customerClass;
    public Customer() {}
    public Customer(String id, String name, String birth, String gender, String privateId, String phoneNumber,
                    String email, String address, String customerClass) {
        super(id, name, birth, gender, privateId, phoneNumber, email);
        this.address = address;
        this.customerClass = customerClass;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCustomerClass() {
        return customerClass;
    }

    public void setCustomerClass(String customerLevel) {
        this.customerClass = customerLevel;
    }
}
