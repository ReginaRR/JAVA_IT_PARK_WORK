public class ParkingPlace {
   private final int size = 20;
   Transport objects[] = new Transport[size];
   String a[] = new String[size];

   ParkingPlace(){
      for(int i = 0; i < size; i++)
          objects[i] = null;
   }

   public void Parking(Transport T) {
      if (T instanceof ParkingObject) {
         for(int i = 0; i < size; i++) {
            if (objects[i] == null) {
               objects[i] = T;
               a[i] = T.getNumber();
               break;
            }
         }
      }
   }

   public void Show() {
       for(int i = 0; i < size;  i++) {
          if (objects[i] != null){
             System.out.println(a[i]);
          }

       }
   }

   public void Unparking(Transport T) {
      for(int i = 0; i < size; i++) {
         if(a[i] == T.getNumber()) {
            objects[i] = null;
            break;
         }
      }
   }


}
