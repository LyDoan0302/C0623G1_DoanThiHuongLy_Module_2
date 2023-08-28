package ss20_case_study_furama_resort.model.model;

public class Booking {
    private String bookingId;
    private String bookingDate;
    private String startingRentDate;
    private String endingRentDate;
    private String bookingCustomerId;
    private String bookingServiceId;
    public Booking() {
    }
    public Booking(String bookingId, String bookingDate, String startingRentDate, String endingRentDate,
                   String bookingCustomerId, String bookingServiceId) {
        this.bookingId = bookingId;
        this.bookingDate = bookingDate;
        this.startingRentDate = startingRentDate;
        this.endingRentDate = endingRentDate;
        this.bookingCustomerId = bookingCustomerId;
        this.bookingServiceId = bookingServiceId;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getStartingRentDate() {
        return startingRentDate;
    }

    public void setStartingRentDate(String startingRentDate) {
        this.startingRentDate = startingRentDate;
    }

    public String getEndingRentDate() {
        return endingRentDate;
    }

    public void setEndingRentDate(String endingRentDate) {
        this.endingRentDate = endingRentDate;
    }

    public String getBookingCustomerId() {
        return bookingCustomerId;
    }

    public void setBookingCustomerId(String bookingCustomerId) {
        this.bookingCustomerId = bookingCustomerId;
    }

    public String getBookingServiceId() {
        return bookingServiceId;
    }

    public void setBookingServiceId(String bookingServiceId) {
        this.bookingServiceId = bookingServiceId;
    }
}
