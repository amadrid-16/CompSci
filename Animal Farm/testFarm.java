/**
 * Angel Madrid
 * Period 2
 * Eno
 * 1/21/15
 * Animal Farm
 * 310.413.7615
 * amadrid_16@esusdstudents.org
 */

import java.util.Scanner;
public class testFarm{
   public static void main(String[] args){
      
      Pig pig = new Pig();//this uses the Pig class to create a new object.
      //this new object can now be used to run methods() from the class that 
      //the object is from.       
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Input your Pig color to start (1,2,3)");//ask user for keyboard input
      pig.numColor = keyboard.nextInt();//set the pig's numColor to keyboard input
      pig.pigColor(pig.numColor);//run pigColor() method from Pig.java class
      
      System.out.println("Input your Pig number of sounds to start (int)");
      pig.numSound = keyboard.nextInt();
      pig.pigSound();
   
      System.out.println("The pig is a great creature because...");
      //this method does not require keyboard input because it does not use a value in the pigMeat() method
      pig.pigMeat();
      
      System.out.println("Input your pig's Speed (1,2,3)");
      pig.numSpeed = keyboard.nextInt();//set input variable for the pigSpeed() method
      pig.pigSpeed(pig.numSpeed);
      
      System.out.println("Pig Color: " + pig.Color + "| Pig Sound: " +pig.Sound + "| Pig Meat: " + pig.MeatType + " | Pig Speed: " + pig.Speed);//print out the pig's Color
      
      
   }
}