package yourturn2;
/**
 * @author Simran Brar I will soon be the greatest java programer
 */
public class ParkingLot
{
   private String[] spaces = new String[10];
   private int numSpaces;

   public ParkingLot ()
   {
      for (int i = 0; i < spaces.length; i++) {
         spaces[i] = "Empty";
      }
   }

   public int getNumEmptySpaces ()
   {
      int numEmptySpaces = 0;
      for (int i = 0; i < spaces.length; i++) {
         if (spaces[i].equals("Empty")) {
            numEmptySpaces++;
         }
      }
      return numEmptySpaces;
   }

   public String getLotStatus ()
   {
      String emptySpaces = "";
      for (int i = 0; i < spaces.length; i++) {
         emptySpaces += spaces[i];
      }
      return emptySpaces;
   }

   public void parkCar (String licencePlate) throws Exception
   {
      for (int i = 0; i < spaces.length; i++) {
         if (spaces[i].equals("Empty")) {
            spaces[i] = licencePlate;
            break;
         }
         else {
            int num = this.getNumEmptySpaces();
            if (num == 0) {
               throw new Exception("parking not available");
            }
         }
      }
   }

   public int retrieveCar (String car) throws Exception
   {

      for (int i = 0; i < spaces.length; i++) {
         if (spaces[i].equals(car)) {
            spaces[i] = "Empty";
            return i;
         }
      }
      throw new Exception("car not found");
   }

}
