public class Car {
    private String color;
    private String manufacturer;

    public Car() {
    }

    public Car(String manufacturer) {
        this.manufacturer = manufacturer;
    }


    public Car(String color, String manufacturer) {
        this.color = color;
        this.manufacturer = manufacturer;
    }



    public String getColor() {
        return color;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
