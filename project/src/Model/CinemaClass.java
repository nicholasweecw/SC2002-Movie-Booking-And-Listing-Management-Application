package Model;

public enum CinemaClass {
    PLATINUM("Suites", 0),
    GOLD("Gold", 0),
    STANDARD("Standard", 0);

    private String type;
    private double price;

    CinemaClass(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return type;
    }

    public double getTicketPrice() {
        return price;
    }

    public void setTicketPrice(double price) {
        this.price = price;
    }
}