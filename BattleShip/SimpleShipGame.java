public class SimpleShipGame{

   public static void main(String[] args){
   
      int numOfGuesses = 0;
      GameHelper helper=new GameHelper();
      SimpleShip theShip = new SimpleShip();
      
      int randomNum = (int)(Math.random() * 8);
      
      int[] locations = {randomNum, randomNum+1, randomNum+2};
      theShip.setLocationCells(locations);
      boolean isAlive = true;
      
      while(isAlive == true){
         
         String guess = helper.getUserInput("enter a number");
         
         String result = theShip.checkYourself(guess);
         numOfGuesses++;
         
         if(result.equals("kill")){
         
            isAlive = false;
            System.out.println("You took " + numOfGuesses + " guesses.");
         
         }
         
      }
   
   
   }


}