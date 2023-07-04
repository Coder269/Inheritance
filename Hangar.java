import entity.Boat;
import entity.Car;

public class Hangar {

    public static void main(String[] args) {

        Car car1 = new Car("Mercedes-Benz", 100);
        Boat boat1 = new Boat("ACM", 200);
        car1.doStuff();
        boat1.doStuff();
    }
}
