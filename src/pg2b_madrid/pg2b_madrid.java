package pg2b_madrid;
/**

 * Angel Madrid
 * Period 2
 * Eno
 * 9/24/14
 * pg2b_madrid
 * 310.413.7615
 * amadrid_16@esusdstudents.org
 */
 
import java.util.Scanner;

public class pg2b_madrid{

   public static void main(String[] args){
   
   //variable declarations
   Scanner keyboard = new Scanner(System.in);
   double stab;//same-type attack bonus. This is equal to 1.5 if the attack is of the same type as the user, and 1 if otherwise
   double type;//the type effectiveness. This can be either 0, 0.25, 0.5, 1, 2, or 4 depending on the type of attack and the type of the defending Pokemon.
   double random;//a random number from 0.85 to 1.00 inclusive (from the input).
   double critical;//2 for a critical hit, 1 otherwise.
   double base;//the base damage of the attack. It must be greater than zero.
   double level;//the level of the attacking Pokemon. It must be in the range [1, 99] inclusive.
   double attack;//are the working Attack and Defense stats of the attacking and defending Pokemon, respectively
   double defense;
   //these are for the modifier and damage calcutations
   double modifier;
   double damage;
   //these are for the word parts of the input
   String inputtype;
   String inputlevel;
   String inputattack;
   String inputdefense;
   String inputbase;
   String inputstab;
   String inputcritical;
   String inputrandom;
   
  
   
   System.out.println("Welcome to the damage calculator");//welcome user
   
   //set variables to work within the loop
   stab = -1;
   type = -1;
   random = -1;
   critical = -1;
   base = -1;
   level = -1;
   attack = -1;
   defense = -1;
   
   inputtype = "n";
   inputlevel = "n";
   inputattack = "n";
   inputdefense = "n";
   inputbase = "n";
   inputstab = "n";
   inputcritical = "n";
   inputrandom = "n";

   
   
   
   
   
   while((!inputtype.equalsIgnoreCase("Type")) || !inputlevel.equalsIgnoreCase("Level") || !inputattack.equalsIgnoreCase("Attack") || !inputdefense.equalsIgnoreCase("Defense") || !inputbase.equalsIgnoreCase("Base") || !inputstab.equalsIgnoreCase("STAB") || !inputcritical.equalsIgnoreCase("Critical") || !inputrandom.equalsIgnoreCase("Random")){
   //continue this loop until all words are correct
      stab = -1;
      type = -1;
      random = -1;
      critical = -1;
      base = -1;        //reset number values if words are wrong
      level = -1;
      attack = -1;
      defense = -1;

      while((type!=0 && type!= 0.25 && type!= 0.5 && type!= 1 && type != 2 && type != 4) || (level > 99 || level < 1) || (attack <= 0) || (defense<= 0) || (base <= 0) ||(stab != 1.5 && stab != 1) || (critical != 2 && critical != 1) || (random < 0.85 || random > 1)){  
      //continue untill all values are correct
         System.out.println("Please enter your pokemon stats(Type #  Level #  Attack # Defense # Base # STAB # Critical # Random #)");
         //tell user to input variables
         inputtype = keyboard.next();
         type = keyboard.nextDouble();//input type
         inputlevel = keyboard.next();
         level = keyboard.nextDouble();//input level
         inputattack = keyboard.next();
         attack = keyboard.nextDouble();//input attack
         inputdefense = keyboard.next();
         defense = keyboard.nextDouble();//input defense
         inputbase = keyboard.next();
         base = keyboard.nextDouble();//input base damage
         inputstab = keyboard.next();
         stab = keyboard.nextDouble();//input stab
         inputcritical = keyboard.next();
         critical = keyboard.nextDouble();//input critical
         inputrandom = keyboard.next();
         random = keyboard.nextDouble();//input random
         
         if(!inputtype.equalsIgnoreCase("Type")){//check if words are correct
            System.out.println("Expected Type!");//if not then tell user
         }
         else{
            if(!inputlevel.equalsIgnoreCase("Level")){
               System.out.println("Expected Level!");
            }
            else{
               if(!inputattack.equalsIgnoreCase("Attack")){
                  System.out.println("Expected Attack!");
               }
               else{
                  if(!inputdefense.equalsIgnoreCase("Defense")){
                     System.out.println("Expected Defense!");
                  }
                  else{
                     if(!inputbase.equalsIgnoreCase("Base")){
                        System.out.println("Expected Base!");
                     }
                     else{
                        if(!inputstab.equalsIgnoreCase("STAB")){
                           System.out.println("Expected STAB!");
                        }
                        else{
                           if(!inputcritical.equalsIgnoreCase("Critical")){
                              System.out.println("Expected Critical!");
                           }
                           else{
                              if(!inputrandom.equalsIgnoreCase("Random")){
                                 System.out.println("Expected Random!");
                              }
                              else{
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
   
      
         if(type !=0 && type != 0.25 && type != 0.5 && type != 1 && type != 2 && type != 4){//check for value invalidity
            System.out.println("Invalid Type Value!");//if value invalid tell user
         }
         else{
            if(level > 99 || level < 1){
               System.out.println("Invalid Level Value!");
            }
            else{
               if(attack <= 0){
                  System.out.println("Invalid Attack Value!");
               }
               else{
                  if(defense <= 0){
                     System.out.println("Invalid Defense Value!");
                  }
                  else{
                     if(base <= 0){
                        System.out.println("Invalid Base Value!");
                     }
                     else{
                        if(stab != 1.5 && stab != 1){
                           System.out.println("Invalid STAB Value!");
                        }
                        else{
                           if(critical != 2 && critical != 1){
                              System.out.println("Invalid Critical Value!");
                           }
                           else{
                              if(random < 0.85 || random > 1){
                                 System.out.println("Invalid Random Value!");
                              }
                              else{
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

    
      }
   }
  
  
  
  
  
  
  
  
   modifier = (stab*type*critical*(random));//for modifier
   damage = (int)((((2 * level + 10) / 250)*(attack / defense)*(base) + 2)*modifier); //for final damage  
   
   
   
   //System.out.println(inputtype + " " + type);            These were for testing the code
   //System.out.println(inputlevel + " " + level);
   //System.out.println(inputattack + " " + attack);
   //System.out.println(inputdefense + " " + defense);
   //System.out.println(inputbase + " " + base);
   //System.out.println(inputstab + " " + stab);
   //System.out.println(inputcritical + " " + critical);
   //System.out.println(inputrandom + " " + random);
   //System.out.println("modifier: " + modifier);
   
   
   System.out.println("Damage: " + damage);//showing the final damage
     
   }  
}

//This project was very difficult. I did not understand the functions correctly
//until the last few days. I did and redid the code differents ways about 3 times.
//The best part was getting everything to work correctly. The hardest part was getting all the 
//components to work correctly. Overall it was difficult but an awesome challenge. I am better
//for it.