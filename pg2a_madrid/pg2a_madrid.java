/**
 * Angel Madrid
 * Period 2
 * Eno
 * 9/24/14
 * pg2a_madrid
 * 310.413.7615
 * amadrid_16@esusdstudents.org
 */

import java.util.Scanner;

public class pg2a_madrid{

   public static void main(String[] args){
   
     //variables
      Scanner keyboard = new Scanner(System.in);

      
      String trainername;
      String pokemon;
      String yesno;
      int pokemonlevel;
    //------------------------------------------------------------------------------------------------Trainer Name
      yesno = "n";
      trainername = "John";
      
      System.out.println("Hello and welcome to Pokemon.");//start program
   
      while(!yesno.equalsIgnoreCase("y")){//start while loop
            System.out.println("Please enter your first name:");
   
            trainername = keyboard.next();//enter trainer name
   
            System.out.println("Is this your name?:" + trainername + "(y/n)");//ask if name is correct
   
            yesno = keyboard.next();
         if (yesno.equalsIgnoreCase("y")){//if yesno is yes then move on
            System.out.println("Ok " + trainername + " lets move on");//show this
         }
            else {
               System.out.println("Lets try again");//if not then ask again
            }
      }
    
    
      System.out.println("Now it's time for your Pokemon ");//move on to pokemon

     
     
           
     
     //------------------------------------------------------------------------------------------------Pokemon Values
      pokemon = "n";
      pokemonlevel = 0;
          
      while(!pokemon.equalsIgnoreCase("Pikachu")&& !pokemon.equalsIgnoreCase("Charmander")&& !pokemon.equalsIgnoreCase("Squirtle")&& !pokemon.equalsIgnoreCase("Bulbasaur")){//run as long as not equal to valid pokemon
      
         while(pokemonlevel >15 || pokemonlevel <1){//run as long as pokemon level invalid
            System.out.println("Please input Pokemon name(Pikachu/Charmander/Squirtle/Bulbasaur) and level (1-15)");
            pokemon = keyboard.next();// ask for data from keyboard
            pokemonlevel = keyboard.nextInt();
                  


            
         
                                
            if (pokemon.equalsIgnoreCase("Pikachu")){//if pikachu
                pokemon = "Pikachu";
                if (pokemonlevel <15 && pokemonlevel >1){               
                }
                else{
                     System.out.println("Invalid Level!");
                     pokemonlevel = 0;          
                     }
            }
            else {
                 if (pokemon.equalsIgnoreCase("Charmander")){//if charmander
                  pokemon = "Charmander";  
                     if (pokemonlevel <15 && pokemonlevel >1){
                     }
                     else{
                          System.out.println("Invalid Level!");
                          pokemonlevel = 0;
                     }                                                                  
                 }
                 else{
                     if (pokemon.equalsIgnoreCase("Squirtle")){//if squirtle
                        pokemon = "Squirtle";
                        if (pokemonlevel <15 && pokemonlevel >1){
                        }
                        else{
                            System.out.println("Invalid Level!");
                            pokemonlevel = 0;
                        }
                     }
                     else{
                         if(pokemon.equalsIgnoreCase("Bulbasaur")){//if bulbasaur
                            pokemon = "Bulbasaur";
                            if (pokemonlevel <15 && pokemonlevel >1){
                            }
                            else{
                                System.out.println("Invalid Level!");
                                pokemonlevel = 0; 
                            }
                          }
                          else{
                               System.out.println("Invalid Pokemon!");//if not then ask again
                               pokemon = "n";
                               if (pokemonlevel <15 && pokemonlevel >1){
                               pokemonlevel = 0;
                               }
                               else{
                                   System.out.println("Invalid Level!");
                                   pokemonlevel = 0;
                                   
                               }
                               
                          }
                     }
                 }
            }   
         } 
      }
       
    //-------------------------------------------------------------------------------------------------End Result
     System.out.println("Added Level " + pokemonlevel + " " + pokemon + " for " + trainername);
   
   }   
}     

//This project was very difficult. I did not understand the functions correctly
//until the last few days. I did and redid the code differents ways about four times.
//The best part was getting everything to work. The hardest part was getting all the 
//components to work correctly. Overall it was good but difficult.