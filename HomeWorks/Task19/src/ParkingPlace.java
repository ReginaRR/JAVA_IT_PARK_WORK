public class ParkingPlace{
   private final int size = 20;
   ParkingObject[] parkingObjects = new ParkingObject[size];

   ParkingPlace(){
      for(int i = 0; i < size; i++)
          parkingObjects[i] = null;
   }

   public void Parking(Transport T) {
      for(int i = 0; i < size; i++) {
         if(parkingObjects[i] == null) {
            try {
               parkingObjects[i] = (ParkingObject) T;
               parkingObjects[i].goToPark();
            } catch (ClassCastException e) {
               System.out.println("It's unparking object");
            }
            break;
         }
      }
   }

   public void Unparking(String s) {
      for(int i = 0; i < size; i++) {
         if(parkingObjects[i] != null && parkingObjects[i].getNumber1() == s){
            parkingObjects[i].goFromPark();
            parkingObjects[i] = null;
            break;
         }
      }
   }


}
