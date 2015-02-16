/**
 * Angel Madrid
 * Period 2
 * Eno
 * 1/21/15
 * Animal Farm
 * 310.413.7615
 * amadrid_16@esusdstudents.org
 */
public class Pig{
   int numColor;
   String Color;//these public variables can be used in other classes
   int numSound;
   String Sound;
   String MeatType;
   int numSpeed;
   String Speed;
                              //this number is an input for the method
   public String pigColor(int numColor){
      if(numColor == 1){
         System.out.println("The pig is pink");
         
         Color = "Pink";//sets the variable Color to pink when num color input is equal to 1
      }
      if(numColor == 2){
         System.out.println("The pig is black");
         Color = "Black";
      }
      if(numColor == 3){
         System.out.println("The pig is brown");
         Color = "Brown";
      }
      return Color;//this returns the variable Color in the class that called 
                   //the pigColor() method
   }
   
   public pigSound(){
      pigSound(3);
   }
   public pigSound(int numSound){
      //System.out.println("The pig goes oink");
      //for(int numOinks = 0;numOinks<numSound;numOinks++){
        // System.out.println("OINK!");      // the pig oinks according to the 
      //}                                   //keyboard input given by the user
      this.Sound = "OINK!";//this sets Sound to Oink
       //returns the variable Sound to the class that called the 
   }                //the pigSound() method
   public String pigMeat(){
      System.out.println("The pig makes BACON");
      MeatType = "Bacon"; //this sets MeatType to Bacon
      return MeatType;//this returns MeatType that was changed earlier to 
   }                 //the class that called pigMeat()
   public String pigSpeed(int numSpeed){
      
      if(numSpeed == 1){
         System.out.println("The pig is Fast");
         this.Speed = "Fast";//sets String Speed to "Fast"
      }
      if(numSpeed == 2){
         System.out.println("The pig is Slow");
         this.Speed = "Slow";
      }
      if(numSpeed == 3){
         System.out.println("The pig is Really Slow");
         this.Speed = "Really Slow";
      }
      return Speed;//return Speed to the class that ran pigSpeed()

   }

}