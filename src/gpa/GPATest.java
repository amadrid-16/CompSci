package gpa;

import java.util.Scanner;

public class GPATest{
   
   
   public static void main (String[] args){
      
      
      GPA gpa = new GPA();
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Please enter your number of classes that you take");
      gpa.numClasses = keyboard.nextInt();
      
      for(int count = 0; count<gpa.numClasses; count++){
         gpa.getUserInput();
         gpa.getUserInputS();
         gpa.translateGrade(gpa.gradeLetter);
      }
      gpa.calculateGPA();
      
      
      System.out.println("class " + gpa.numClasses + " creds " + gpa.numCredits + " gradeScore " + gpa.gradeScore);
      System.out.println("Your GPA is " + gpa.overallGPA);
      
         
      

   }
}