package co.com.devco.certification.models;

public class Flight {

    private String from;
    private String to;
    private String option;
    private String type;
    private String date;

    public Flight(String from, String to, String option, String type, String date) {
        this.from = from;
        this.to = to;
        this.option = option;
        this.type = type;
        this.date = date;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getOption() {
        return option;
    }

    public String getType() {
        return type;
    }

    public String getDate() {
        return date;
    }
}

