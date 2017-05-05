public class Car extends Transport implements ParkingObject {
    Car(String number) {
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
