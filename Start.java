package yourturn2;

/**
 * Make the ParkingLot class:
 * -spaces is an array of Strings with 10 elements...each element contains either the word Empty or the license
 * plate of the car parked there.
 * <p>
 * Add a constructor that will set all spaces to contain the work Empty
 * <p>
 * getNumEmptySpaces will return the number of spaces that are Empty
 * setLotStatus will print out what is in each space...either the word Empty or the license plate of the car parked there
 * <p>
 * parkCar will look for an Empty space and put the car license in it. If it can't find any, it will throw an exception
 * <p>
 * retrieveCar will return the index in the spots array where the car was retrieved from...It will also set that space to Empty
 * If it can't find the car, it will throw an exception
 */
public class Start
{
   public static void main (String[] args) throws Exception
   {
      ParkingLot p1 = new ParkingLot();
      System.out.println(p1.getNumEmptySpaces());
      System.out.println(p1.getLotStatus());
      p1.parkCar("ABC123");
      p1.parkCar("XYZ987");
      p1.parkCar("JAVA 1");
      System.out.println(p1.getLotStatus());
      System.out.println(p1.getNumEmptySpaces());
      System.out.println("Car at " + p1.retrieveCar("XYZ987") + " was retrieved");
      System.out.println(p1.getLotStatus());
      p1.parkCar("STUDY UP");
      System.out.println(p1.getLotStatus());
   }
}
