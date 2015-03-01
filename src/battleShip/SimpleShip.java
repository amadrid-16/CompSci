package battleShip;
public class SimpleShip{

   int[] locationCells;//create location cells array to store location of the ship
   int numOfHits = 0;//create and initialize number of hitson ship variable
   
   public void setLocationCells(int[] locs){//setter method for location of ship
      locationCells = locs;
   }//end method
   
   public String checkYourself(String stringGuess){
      int guess = Integer.parseInt(stringGuess);//convert the String to an int
      String result = "miss";//make a variable to hold the result we'll return. put "miss as
      for(int cell: locationCells){//repeat with each cell in the locationCells array
         if(guess == cell){//compare the user guess to this element (cell) in the array
            result = "hit";//we got a hit
            numOfHits++;
            break;//get out of the loop, no need to test the other cells
         }//end if
      }//end for
      if(numOfHits == locationCells.length){//we're out of the loop, but lets see if we're now "dead" hit 3 times
      result = "kill";//if we need to change hit result to "kill"
      }//end if
      System.out.println(result);//display the result for the user
      return result;             //return result back to the calling method
   }

}