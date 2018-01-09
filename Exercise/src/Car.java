public class Car {
    private String color;
    private String manufacturer;
    private int getNumberOfSeats;

    public Car(String color, String manufacturer, int getNumberOfSeats) {
        this.color = color;
        this.manufacturer = manufacturer;
        this.getNumberOfSeats = getNumberOfSeats;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getGetNumberOfSeats() {
        return getNumberOfSeats;
    }

    public void setGetNumberOfSeats(int getNumberOfSeats) {
        this.getNumberOfSeats = getNumberOfSeats;
    }
}
