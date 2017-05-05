import com.sun.org.apache.xpath.internal.SourceTree;

public class Motorcycle extends Transport implements ParkingObject{
    Motorcycle (String number) {
        super(number);
    }

    public void goToPark(){
        System.out.println("Приехал");
    }
    public void goFromPark(){
        System.out.println("Уехал");
    }
    public String getNumber1() {
        return getNumber();
    }
}
