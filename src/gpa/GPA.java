package gpa;

import java.util.Scanner;
public class GPA{
   
   int numClasses;
   int numCredits;
   int gradeScore;
   int overallGPA;
   int count=1;
   
   String gradeLetter = "A";
   Scanner keyboard = new Scanner(System.in);
   
   public int getUserInput(){
      
      
      
      
      System.out.println("Please enter class " + count + "'s Credit Value");
      
      numCredits += keyboard.nextInt();
      
      
      
      return numCredits;
      
         
   }
   public String getUserInputS(){
   
      System.out.println("Please enter class " + count + "'s Grade Letter");

      gradeLetter = gradeLetter + keyboard.next();
      
      count++;
      
      return gradeLetter;
   
   }
   
   
   public int translateGrade(String gradeLetter){
   
      if(gradeLetter.equalsIgnoreCase("A")){
         gradeScore += 4;
      }
      if(gradeLetter.equalsIgnoreCase("B")){
         gradeScore += 3;
      }
      if(gradeLetter.equalsIgnoreCase("C")){
         gradeScore += 2;
      }
      if(gradeLetter.equalsIgnoreCase("D")){
         gradeScore += 1;
      }
      if(gradeLetter.equalsIgnoreCase("F")){
         gradeScore += 0;
      }
      
      return gradeScore;
   
   }
   public int calculateGPA(){
   
      overallGPA = ((numCredits*gradeScore)/numCredits);
   
      return overallGPA;
   
   }

}