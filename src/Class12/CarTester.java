package Class12;

public class CarTester {

    public static void main(String[] args) {

        // below code will create an object of car class

        Car vehicle = new Car();
        vehicle.brand = "Acura";
        vehicle.doors = 4;
        vehicle.isElectric = false;
        vehicle.countryOrigin = "Japan";
        vehicle.seats = 7;

        vehicle.speed();
        vehicle.brake();
        vehicle.horn();

        Car car1 = new Car();
        car1.brand = "Tesla";
        car1.doors = 4;
        car1.isElectric = true;
        car1.countryOrigin = "USA";
        car1.seats = 5;

        car1.speed();
        car1.brake();
        car1.horn();

    }
}
