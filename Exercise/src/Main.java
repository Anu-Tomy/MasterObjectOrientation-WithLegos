public class Main {
/*  Make a car class with properties: color and manufacturer.
    Make car1 object(instantiate with color red and manufacturer Toyota)
    Make new SaloonCar class that inherits from Car class.
    Add new property called: numberOfSeats.

    Write 3 constructors to do the following:

    Constructor1 allows assognment of numberOfSeats only.
    Constructor2 allows assognment of numberOfSeats and manufacturer only.
    Constructor3 allows assognment of numberOfSeats, manufacturer and color.

    Create object saloonCar1 with 2 seats.
    Create object saloonCar2 with 3 seats and manufacturer Nissan.
    Create object saloonCar3 with 4 seats and manufacturer Ford and color purple.
 */
    public static void main(String[] args) {

        Car car = new Car("Red", "Toyota");
        System.out.println("New Car is " + car.getColor() +" " + car.getManufacturer());

        SaloonCar saloonCar1 = new SaloonCar(2);
        System.out.println("SaloonCar1 has " + saloonCar1.getNumberOfSeats()+  " seats" );

        SaloonCar saloonCar2 = new SaloonCar("Nissan", 3);
        System.out.println("SaloonCar2 has " + saloonCar2.getNumberOfSeats() + " seats and manufacturer is " + saloonCar2.getManufacturer());

        SaloonCar saloonCar3 = new SaloonCar("Purple","Ford", 4 );
        System.out.println("SaloonCar3 has "+ saloonCar3.getNumberOfSeats() + " seats and manufacturer is " + saloonCar3.getManufacturer() + " and " + saloonCar3.getColor()+ " color" );




    }
}
