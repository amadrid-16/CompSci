package randomThings;
import java.util.Scanner;
public class namemachine{

   public static void main(String[] args){
      String username;
      String spiritanimal;
      String verbage;
      
      
      Scanner keyboard= new Scanner(System.in); 
      
      System.out.println("This is the name machine. What is your name?");
      username = keyboard.next();
      System.out.println("Your name is " + username);
      System.out.println("You also have a spirit animal yes?");
      spiritanimal = keyboard.next();
      System.out.println("Hmm interesting a " + spiritanimal + " I was expecting a unicorn or something.");
      System.out.println("Oh well I guess we will move on. Explain your favorite thing to do in one word.(swimming, running, jogging, etc.)");
      verbage = keyboard.next();
      System.out.println("Ok, your new name is................................" + verbage + " " + spiritanimal);
      
      
   
   
   }
}