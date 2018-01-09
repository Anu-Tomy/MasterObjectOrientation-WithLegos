public class SaloonCar extends Car{
    private int numberOfSeats;

    public SaloonCar(int numberOfSeats){
        this.numberOfSeats = numberOfSeats;
    }


    public SaloonCar(String manufacturer, int numberOfSeats) {
        super(manufacturer);
        this.numberOfSeats = numberOfSeats;
    }

    public SaloonCar(String color, String manufacturer, int numberOfSeats) {
        super(color, manufacturer);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

}

