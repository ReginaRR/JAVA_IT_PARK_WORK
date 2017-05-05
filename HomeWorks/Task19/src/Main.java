import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Motorcycle motorcycle1 = new Motorcycle("WE23");
        Motorcycle motorcycle2 = new Motorcycle("R666");
        Car car1 = new Car("T123PH");
        Car car2 = new Car("X666XX");
        Byke byke1 = new Byke("12D");
        Byke byke2 = new Byke("14S");

        ParkingPlace place = new ParkingPlace();
        place.Parking(car1);
        place.Parking(motorcycle1);
        place.Parking(byke2);

        place.Unparking("WE23");

    }
}
