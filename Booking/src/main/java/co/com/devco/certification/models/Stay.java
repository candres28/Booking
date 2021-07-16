package co.com.devco.certification.models;

public class Stay {

    private String destination;
    private String checkin;
    private String  checkout;

    public Stay(String destination, String checkin, String checkout) {
        this.destination = destination;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public String getDestination() {
        return destination;
    }

    public String getCheckin() {
        return checkin;
    }

    public String getCheckout() {
        return checkout;
    }
}
