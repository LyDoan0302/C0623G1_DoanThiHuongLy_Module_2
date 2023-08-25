package case_study_furama_resort.model.model;

public class Contract {
    private String contractId;
    private String contractBookingId;
    private double deposit;
    private double totalPaymentAmount;
    public Contract() {}
    public Contract(String contractId, String contractBookingId, double deposit, double totalPaymentAmount) {
        this.contractId = contractId;
        this.contractBookingId = contractBookingId;
        this.deposit = deposit;
        this.totalPaymentAmount = totalPaymentAmount;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getContractBookingId() {
        return contractBookingId;
    }

    public void setContractBookingId(String contractBookingId) {
        this.contractBookingId = contractBookingId;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getTotalPaymentAmount() {
        return totalPaymentAmount;
    }

    public void setTotalPaymentAmount(double totalPaymentAmount) {
        this.totalPaymentAmount = totalPaymentAmount;
    }
}
