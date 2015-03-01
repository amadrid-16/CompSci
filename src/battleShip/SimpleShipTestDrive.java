package battleShip;
public class SimpleShipTestDrive{

   public static void main (String[] args){
   
      SimpleShip ship = new SimpleShip(); //instantiate a Simpleship object
      
      int[] locations = {2,3,4}; //make an int array for the location of the ship(3 consecutive ints out of 100)
                                 
      ship.setLocationCells(locations); //invoke the setter method on the ship
      
      String userGuess = "2"; //make a fake user guess
      
      String result = ship.checkYourself(userGuess); //invoke the checkYourself() method on the object and pass it the fake guess
      String testResult = "failed";
      
      if(result.equals("hit")){
         testResult = "passed"; //if the fake guess (2) gives back a "hit",its working
                               
      }
      System.out.println(testResult); //print out the test result (passed or failed)
   }
} 