package pg3a_madrid;
/**

 * Angel Madrid
 * Period 2
 * Eno
 * 10/22/14
 * pg3a_madrid
 * 310.413.7615
 * amadrid_16@esusdstudents.org
 */

import java.util.Scanner;

public class pg3a_madrid{

   public static void main(String[] args){
   
     //variables
      Scanner keyboard = new Scanner(System.in);
      //------------------menu options
      int menu;      
      //------------------trainernames
      String trainernamea;
      String trainernameb;
      //------------------trainer 1
      String pokemon1a;
      String pokemon2a;
      String pokemon3a;
      String pokemon4a;
      String highestpokemona;
      
      int pokemonlevel1a;
      int pokemonlevel2a;
      int pokemonlevel3a;
      int pokemonlevel4a;
      int highestpokemonlevela;
      //------------------trainer 2
      String pokemon1b;
      String pokemon2b;
      String pokemon3b;
      String pokemon4b;
      String highestpokemonb;
      
      int pokemonlevel1b;
      int pokemonlevel2b;
      int pokemonlevel3b;
      int pokemonlevel4b;
      int highestpokemonlevelb;
      //-----------------yes or no
      String yesno1;
      String yesno2;
    
    yesno1 = "n";
    trainernamea = "Trainer 1";
    yesno2 = "n";
    trainernameb = "Trainer 2";
    pokemon1a = "Pokemon";
    pokemonlevel1a = 0;
    pokemon2a = "Pokemon";
    pokemonlevel2a = 0;
    pokemon3a = "Pokemon";
    pokemonlevel3a = 0;
    pokemon4a = "Pokemon";
    pokemonlevel4a = 0;
    pokemon1b = "Pokemon";
    pokemonlevel1b = 0;
    pokemon2b = "Pokemon";
    pokemonlevel2b = 0;
    pokemon3b = "Pokemon";
    pokemonlevel3b = 0;
    pokemon4b = "Pokemon";
    pokemonlevel4b = 0;
    highestpokemonlevela = 0;
    highestpokemonlevelb = 0;
    highestpokemona = "n";
    highestpokemonb = "n";

    menu = 0;  
    while (menu != 7 && menu == 0){
      System.out.println("\nPlease select a menu option");
      System.out.println("\n1 Change Trainer 1's Name \n2 Change Trainer 2's Name \n3 Set Trainer 1's Pokemon \n4 Set Trainer 2's Pokemon \n5 Display Trainer Names and Pokemon \n6 Display Trainer With the Highest Level Pokemon \n7 Exit Program");
      menu = keyboard.nextInt();
    //------------------------------------------------------------------------------------------------Trainer Names
      while (menu == 1){
         yesno1 = "n";
         trainernamea = "Trainer 1";
         
         System.out.println("Change name for Trainer 1");//start program
         while(!yesno1.equalsIgnoreCase("y")){//start while loop
               System.out.println("Please enter first name for Trainer 1:");
               trainernamea = keyboard.next();//enter trainer name
               System.out.println("Is this your name?:" + trainernamea + "(y/n)");//ask if name is correct
               yesno1 = keyboard.next();
            if (yesno1.equalsIgnoreCase("y")){//if yesno is yes then move on
               menu = 0;
            }
               else {
                  System.out.println("Lets try again");//if not then ask again
               }
         }
      }
      while (menu == 2){
         yesno2 = "n";
         trainernameb = "Trainer 2";
         
         while(!yesno2.equalsIgnoreCase("y")){//start while loop
               System.out.println("Please enter first name for Trainer 2:");
               trainernameb = keyboard.next();//enter trainer name
               System.out.println("Is this your name?:" + trainernameb + "(y/n)");//ask if name is correct
               yesno2 = keyboard.next();
            if (yesno2.equalsIgnoreCase("y")){//if yesno is yes then move on
               menu = 0;
            }
               else {
                  System.out.println("Lets try again");//if not then ask again
               }
         } 
      }
     
     
           
     
     //------------------------------------------------------------------------------------------------trainer 1 Pokemon Values
      while (menu == 3){
         pokemon1a = "Pokemon";
         pokemonlevel1a = 0;
             
         while(!pokemon1a.equalsIgnoreCase("Pikachu")&& !pokemon1a.equalsIgnoreCase("Charmander")&& !pokemon1a.equalsIgnoreCase("Squirtle")&& !pokemon1a.equalsIgnoreCase("Bulbasaur")){//run as long as not equal to valid pokemon
            while(pokemonlevel1a >15 || pokemonlevel1a <1){//run as long as pokemon level invalid
               System.out.println("\nPlease input Pokemon for " + trainernamea + "(Pikachu/Charmander/Squirtle/Bulbasaur) and level (1-15)");
               pokemon1a = keyboard.next();// ask for data from keyboard
               pokemonlevel1a = keyboard.nextInt();                   
               if (pokemon1a.equalsIgnoreCase("Pikachu")){//if pikachu
                   pokemon1a = "Pikachu";
                   if (pokemonlevel1a <16 && pokemonlevel1a >0){               
                     System.out.println("Added Level " + pokemonlevel1a + " Pikachu for " + trainernamea);
                   }
                   else{
                        System.out.println("Invalid Level!");
                        pokemonlevel1a = 0;          
                        }
               }
               else {
                    if (pokemon1a.equalsIgnoreCase("Charmander")){//if charmander
                        pokemon1a = "Charmander";  
                        if (pokemonlevel1a <16 && pokemonlevel1a >0){
                           System.out.println("Added Level " + pokemonlevel1a + " Charmander for " + trainernamea);
                        }
                        else{
                             System.out.println("Invalid Level!");
                             pokemonlevel1a = 0;
                        }                                                                  
                    }
                    else{
                        if (pokemon1a.equalsIgnoreCase("Squirtle")){//if squirtle
                           pokemon1a = "Squirtle";
                           if (pokemonlevel1a <16 && pokemonlevel1a >0){
                              System.out.println("Added Level " + pokemonlevel1a + " Squirtle for " + trainernamea);
                           }
                           else{
                               System.out.println("Invalid Level!");
                               pokemonlevel1a = 0;
                           }
                        }
                        else{
                            if(pokemon1a.equalsIgnoreCase("Bulbasaur")){//if bulbasaur
                               pokemon1a = "Bulbasaur";
                               if (pokemonlevel1a <16 && pokemonlevel1a >0){
                                 System.out.println("Added Level " + pokemonlevel1a + " Bulbasaur for " + trainernamea);
                               }
                               else{
                                   System.out.println("Invalid Level!");
                                   pokemonlevel1a= 0; 
                               }
                             }
                             else{
                                  System.out.println("Invalid Pokemon!");//if not then ask again
                                  pokemon1a = "n";
                                  if (pokemonlevel1a <16 && pokemonlevel1a >0){
                                    pokemonlevel1a = 0;
                                  }
                                  else{
                                      System.out.println("Invalid Level!");
                                      pokemonlevel1a = 0;
                                      
                                  }
                                  
                             }
                        }
                    }
               }   
            } 
         }
         pokemon2a = "Pokemon";
         pokemonlevel2a = 0;
         
         while(!pokemon2a.equalsIgnoreCase("Pikachu")&& !pokemon2a.equalsIgnoreCase("Charmander")&& !pokemon2a.equalsIgnoreCase("Squirtle")&& !pokemon2a.equalsIgnoreCase("Bulbasaur")){//run as long as not equal to valid pokemon
            while(pokemonlevel2a >15 || pokemonlevel2a <1){//run as long as pokemon level invalid
               System.out.println("\nPlease input Pokemon for " + trainernamea + "(Pikachu/Charmander/Squirtle/Bulbasaur) and level (1-15)");
               pokemon2a = keyboard.next();// ask for data from keyboard
               pokemonlevel2a = keyboard.nextInt();                   
               if (pokemon2a.equalsIgnoreCase("Pikachu")){//if pikachu
                   pokemon2a = "Pikachu";
                   if (pokemonlevel2a <16 && pokemonlevel2a >0){               
                     System.out.println("Added Level " + pokemonlevel2a + " Pikachu for " + trainernamea);
                   }
                   else{
                        System.out.println("Invalid Level!");
                        pokemonlevel2a = 0;          
                        }
               }
               else {
                    if (pokemon2a.equalsIgnoreCase("Charmander")){//if charmander
                        pokemon2a = "Charmander";  
                        if (pokemonlevel2a <16 && pokemonlevel2a >0){
                           System.out.println("Added Level " + pokemonlevel2a + " Charmander for " + trainernamea);
                        }
                        else{
                             System.out.println("Invalid Level!");
                             pokemonlevel2a = 0;
                        }                                                                  
                    }
                    else{
                        if (pokemon2a.equalsIgnoreCase("Squirtle")){//if squirtle
                           pokemon2a = "Squirtle";
                           if (pokemonlevel2a <16 && pokemonlevel2a >0){
                              System.out.println("Added Level " + pokemonlevel2a + " Squirtle for " + trainernamea);
                           }
                           else{
                               System.out.println("Invalid Level!");
                               pokemonlevel2a = 0;
                           }
                        }
                        else{
                            if(pokemon2a.equalsIgnoreCase("Bulbasaur")){//if bulbasaur
                               pokemon2a = "Bulbasaur";
                               if (pokemonlevel2a <16 && pokemonlevel2a >0){
                                 System.out.println("Added Level " + pokemonlevel2a + " Bulbasaur for " + trainernamea);
                               }
                               else{
                                   System.out.println("Invalid Level!");
                                   pokemonlevel2a = 0; 
                               }
                             }
                             else{
                                  System.out.println("Invalid Pokemon!");//if not then ask again
                                  pokemon2a = "n";
                                  if (pokemonlevel2a <16 && pokemonlevel2a >0){
                                    pokemonlevel2a = 0;
                                  }
                                  else{
                                      System.out.println("Invalid Level!");
                                      pokemonlevel2a = 0;
                                      
                                  }
                                  
                             }
                        }
                    }
               }   
            } 
         }
         pokemon3a = "Pokemon";
         pokemonlevel3a = 0;
             
         while(!pokemon3a.equalsIgnoreCase("Pikachu")&& !pokemon3a.equalsIgnoreCase("Charmander")&& !pokemon3a.equalsIgnoreCase("Squirtle")&& !pokemon3a.equalsIgnoreCase("Bulbasaur")){//run as long as not equal to valid pokemon
            while(pokemonlevel3a >15 || pokemonlevel3a <1){//run as long as pokemon level invalid
               System.out.println("\nPlease input Pokemon for " + trainernamea + "(Pikachu/Charmander/Squirtle/Bulbasaur) and level (1-15)");
               pokemon3a = keyboard.next();// ask for data from keyboard
               pokemonlevel3a = keyboard.nextInt();                   
               if (pokemon3a.equalsIgnoreCase("Pikachu")){//if pikachu
                   pokemon3a = "Pikachu";
                   if (pokemonlevel3a <16 && pokemonlevel3a >0){               
                     System.out.println("Added Level " + pokemonlevel3a + " Pikachu for " + trainernamea);
                   }
                   else{
                        System.out.println("Invalid Level!");
                        pokemonlevel3a = 0;          
                        }
               }
               else {
                    if (pokemon3a.equalsIgnoreCase("Charmander")){//if charmander
                        pokemon3a = "Charmander";  
                        if (pokemonlevel3a <16 && pokemonlevel3a >0){
                           System.out.println("Added Level " + pokemonlevel3a + " Charmander for " + trainernamea);
                        }
                        else{
                             System.out.println("Invalid Level!");
                             pokemonlevel3a = 0;
                        }                                                                  
                    }
                    else{
                        if (pokemon3a.equalsIgnoreCase("Squirtle")){//if squirtle
                           pokemon3a = "Squirtle";
                           if (pokemonlevel3a <16 && pokemonlevel3a >0){
                              System.out.println("Added Level " + pokemonlevel3a + " Squirtle for " + trainernamea);
                           }
                           else{
                               System.out.println("Invalid Level!");
                               pokemonlevel3a = 0;
                           }
                        }
                        else{
                            if(pokemon3a.equalsIgnoreCase("Bulbasaur")){//if bulbasaur
                               pokemon3a = "Bulbasaur";
                               if (pokemonlevel3a <16 && pokemonlevel3a >0){
                                 System.out.println("Added Level " + pokemonlevel3a + " Bulbasaur for " + trainernamea);
                               }
                               else{
                                   System.out.println("Invalid Level!");
                                   pokemonlevel3a= 0; 
                               }
                             }
                             else{
                                  System.out.println("Invalid Pokemon!");//if not then ask again
                                  pokemon3a = "n";
                                  if (pokemonlevel3a <16 && pokemonlevel3a >0){
                                    pokemonlevel3a = 0;
                                  }
                                  else{
                                      System.out.println("Invalid Level!");
                                      pokemonlevel3a = 0;
                                      
                                  }
                                  
                             }
                        }
                    }
               }   
            } 
         }
         pokemon4a = "Pokemon";
         pokemonlevel4a = 0;
             
         while(!pokemon4a.equalsIgnoreCase("Pikachu")&& !pokemon4a.equalsIgnoreCase("Charmander")&& !pokemon4a.equalsIgnoreCase("Squirtle")&& !pokemon4a.equalsIgnoreCase("Bulbasaur")){//run as long as not equal to valid pokemon
            while(pokemonlevel4a >15 || pokemonlevel4a <1){//run as long as pokemon level invalid
               System.out.println("\nPlease input Pokemon for " + trainernamea + "(Pikachu/Charmander/Squirtle/Bulbasaur) and level (1-15)");
               pokemon4a = keyboard.next();// ask for data from keyboard
               pokemonlevel4a = keyboard.nextInt();                   
               if (pokemon4a.equalsIgnoreCase("Pikachu")){//if pikachu
                   pokemon4a = "Pikachu";
                   if (pokemonlevel4a <16 && pokemonlevel4a >0){               
                     System.out.println("Added Level " + pokemonlevel4a + " Pikachu for " + trainernamea);
                     menu = 0;
                   }
                   else{
                        System.out.println("Invalid Level!");
                        pokemonlevel4a = 0;          
                   }
               }
               else {
                    if (pokemon4a.equalsIgnoreCase("Charmander")){//if charmander
                        pokemon4a = "Charmander";  
                        if (pokemonlevel4a <16 && pokemonlevel4a >0){
                           System.out.println("Added Level " + pokemonlevel4a + " Charmander for " + trainernamea);
                           menu = 0;
                        }
                        else{
                             System.out.println("Invalid Level!");
                             pokemonlevel4a = 0;
                        }                                                                  
                    }
                    else{
                        if (pokemon4a.equalsIgnoreCase("Squirtle")){//if squirtle
                           pokemon4a = "Squirtle";
                           if (pokemonlevel4a <16 && pokemonlevel4a >0){
                              System.out.println("Added Level " + pokemonlevel4a + " Squirtle for " + trainernamea);
                              menu = 0;
                           }
                           else{
                               System.out.println("Invalid Level!");
                               pokemonlevel4a = 0;
                           }
                        }
                        else{
                            if(pokemon4a.equalsIgnoreCase("Bulbasaur")){//if bulbasaur
                               pokemon4a = "Bulbasaur";
                               if (pokemonlevel4a <16 && pokemonlevel4a >0){
                                 System.out.println("Added Level " + pokemonlevel4a + " Bulbasaur for " + trainernamea);
                                 menu = 0;
                               }
                               else{
                                   System.out.println("Invalid Level!");
                                   pokemonlevel4a= 0; 
                               }
                             }
                             else{
                                  System.out.println("Invalid Pokemon!");//if not then ask again
                                  pokemon4a = "n";
                                  if (pokemonlevel4a <16 && pokemonlevel4a >0){
                                    pokemonlevel4a = 0;
                                  }
                                  else{
                                      System.out.println("Invalid Level!");
                                      pokemonlevel4a = 0;
                                      
                                  }
                                  
                             }
                        }
                    }
               }   
            } 
         }
      }
//--------------------------------------------------------------------------------------------------trainer 2 pokemon
      while (menu == 4){
         
         pokemon1b = "Pokemon";
         pokemonlevel1b = 0;
             
         while(!pokemon1b.equalsIgnoreCase("Pikachu")&& !pokemon1b.equalsIgnoreCase("Charmander")&& !pokemon1b.equalsIgnoreCase("Squirtle")&& !pokemon1b.equalsIgnoreCase("Bulbasaur")){//run as long as not equal to valid pokemon
            while(pokemonlevel1b >15 || pokemonlevel1b <1){//run as long as pokemon level invalid
               System.out.println("\nPlease input Pokemon for " + trainernameb + "(Pikachu/Charmander/Squirtle/Bulbasaur) and level (1-15)");
               pokemon1b = keyboard.next();// ask for data from keyboard
               pokemonlevel1b = keyboard.nextInt();                   
               if (pokemon1b.equalsIgnoreCase("Pikachu")){//if pikachu
                   pokemon1b = "Pikachu";
                   if (pokemonlevel1b <16 && pokemonlevel1b >0){               
                     System.out.println("Added Level " + pokemonlevel1b + " Pikachu for " + trainernameb);
                   }
                   else{
                        System.out.println("Invalid Level!");
                        pokemonlevel1b = 0;          
                        }
               }
               else {
                    if (pokemon1b.equalsIgnoreCase("Charmander")){//if charmander
                        pokemon1b = "Charmander";  
                        if (pokemonlevel1b <16 && pokemonlevel1b >0){
                           System.out.println("Added Level " + pokemonlevel1b + " Charmander for " + trainernameb);
                        }
                        else{
                             System.out.println("Invalid Level!");
                             pokemonlevel1b = 0;
                        }                                                                  
                    }
                    else{
                        if (pokemon1b.equalsIgnoreCase("Squirtle")){//if squirtle
                           pokemon1b = "Squirtle";
                           if (pokemonlevel1b <16 && pokemonlevel1b >0){
                              System.out.println("Added Level " + pokemonlevel1b + " Squirtle for " + trainernameb);
                           }
                           else{
                               System.out.println("Invalid Level!");
                               pokemonlevel1b = 0;
                           }
                        }
                        else{
                            if(pokemon1b.equalsIgnoreCase("Bulbasaur")){//if bulbasaur
                               pokemon1b = "Bulbasaur";
                               if (pokemonlevel1b <16 && pokemonlevel1b >0){
                                 System.out.println("Added Level " + pokemonlevel1b + " Bulbasaur for " + trainernameb);
                               }
                               else{
                                   System.out.println("Invalid Level!");
                                   pokemonlevel1b= 0; 
                               }
                             }
                             else{
                                  System.out.println("Invalid Pokemon!");//if not then ask again
                                  pokemon1b = "n";
                                  if (pokemonlevel1b <16 && pokemonlevel1b >0){
                                    pokemonlevel1b = 0;
                                  }
                                  else{
                                      System.out.println("Invalid Level!");
                                      pokemonlevel1b = 0;
                                      
                                  }
                                  
                             }
                        }
                    }
               }   
            } 
         }
         pokemon2b = "Pokemon";
         pokemonlevel2b = 0;
         
         while(!pokemon2b.equalsIgnoreCase("Pikachu")&& !pokemon2b.equalsIgnoreCase("Charmander")&& !pokemon2b.equalsIgnoreCase("Squirtle")&& !pokemon2b.equalsIgnoreCase("Bulbasaur")){//run as long as not equal to valid pokemon
            while(pokemonlevel2b >15 || pokemonlevel2b <1){//run as long as pokemon level invalid
               System.out.println("\nPlease input Pokemon for " + trainernameb + "(Pikachu/Charmander/Squirtle/Bulbasaur) and level (1-15)");
               pokemon2b = keyboard.next();// ask for data from keyboard
               pokemonlevel2b = keyboard.nextInt();                   
               if (pokemon2b.equalsIgnoreCase("Pikachu")){//if pikachu
                   pokemon2b = "Pikachu";
                   if (pokemonlevel2b <16 && pokemonlevel2b >0){               
                     System.out.println("Added Level " + pokemonlevel2b + " Pikachu for " + trainernameb);
                   }
                   else{
                        System.out.println("Invalid Level!");
                        pokemonlevel2b = 0;          
                        }
               }
               else {
                    if (pokemon2b.equalsIgnoreCase("Charmander")){//if charmander
                        pokemon2b = "Charmander";  
                        if (pokemonlevel2b <16 && pokemonlevel2b >0){
                           System.out.println("Added Level " + pokemonlevel2b + " Charmander for " + trainernameb);
                        }
                        else{
                             System.out.println("Invalid Level!");
                             pokemonlevel2b = 0;
                        }                                                                  
                    }
                    else{
                        if (pokemon2b.equalsIgnoreCase("Squirtle")){//if squirtle
                           pokemon2b = "Squirtle";
                           if (pokemonlevel2b <16 && pokemonlevel2b >0){
                              System.out.println("Added Level " + pokemonlevel2b + " Squirtle for " + trainernameb);
                           }
                           else{
                               System.out.println("Invalid Level!");
                               pokemonlevel2b = 0;
                           }
                        }
                        else{
                            if(pokemon2b.equalsIgnoreCase("Bulbasaur")){//if bulbasaur
                               pokemon2b = "Bulbasaur";
                               if (pokemonlevel2b <16 && pokemonlevel2b >0){
                                 System.out.println("Added Level " + pokemonlevel2b + " Bulbasaur for " + trainernameb);
                               }
                               else{
                                   System.out.println("Invalid Level!");
                                   pokemonlevel2b = 0; 
                               }
                             }
                             else{
                                  System.out.println("Invalid Pokemon!");//if not then ask again
                                  pokemon2b = "n";
                                  if (pokemonlevel2b <16 && pokemonlevel2b >0){
                                    pokemonlevel2b = 0;
                                  }
                                  else{
                                      System.out.println("Invalid Level!");
                                      pokemonlevel2b = 0;
                                      
                                  }
                                  
                             }
                        }
                    }
               }   
            } 
         }
         pokemon3b = "Pokemon";
         pokemonlevel3b = 0;
             
         while(!pokemon3b.equalsIgnoreCase("Pikachu")&& !pokemon3b.equalsIgnoreCase("Charmander")&& !pokemon3b.equalsIgnoreCase("Squirtle")&& !pokemon3b.equalsIgnoreCase("Bulbasaur")){//run as long as not equal to valid pokemon
            while(pokemonlevel3b >15 || pokemonlevel3b <1){//run as long as pokemon level invalid
               System.out.println("\nPlease input Pokemon for " + trainernameb + "(Pikachu/Charmander/Squirtle/Bulbasaur) and level (1-15)");
               pokemon3b = keyboard.next();// ask for data from keyboard
               pokemonlevel3b = keyboard.nextInt();                   
               if (pokemon3b.equalsIgnoreCase("Pikachu")){//if pikachu
                   pokemon3b = "Pikachu";
                   if (pokemonlevel3b <16 && pokemonlevel3b >0){               
                     System.out.println("Added Level " + pokemonlevel3b + " Pikachu for " + trainernameb);
                   }
                   else{
                        System.out.println("Invalid Level!");
                        pokemonlevel3b = 0;          
                        }
               }
               else {
                    if (pokemon3b.equalsIgnoreCase("Charmander")){//if charmander
                        pokemon3b = "Charmander";  
                        if (pokemonlevel3b <16 && pokemonlevel3b >0){
                           System.out.println("Added Level " + pokemonlevel3b + " Charmander for " + trainernameb);
                        }
                        else{
                             System.out.println("Invalid Level!");
                             pokemonlevel3b = 0;
                        }                                                                  
                    }
                    else{
                        if (pokemon3b.equalsIgnoreCase("Squirtle")){//if squirtle
                           pokemon3b = "Squirtle";
                           if (pokemonlevel3b <16 && pokemonlevel3b >0){
                              System.out.println("Added Level " + pokemonlevel3b + " Squirtle for " + trainernameb);
                           }
                           else{
                               System.out.println("Invalid Level!");
                               pokemonlevel3b = 0;
                           }
                        }
                        else{
                            if(pokemon3b.equalsIgnoreCase("Bulbasaur")){//if bulbasaur
                               pokemon3b = "Bulbasaur";
                               if (pokemonlevel3b <16 && pokemonlevel3b >0){
                                 System.out.println("Added Level " + pokemonlevel3b + " Bulbasaur for " + trainernameb);
                               }
                               else{
                                   System.out.println("Invalid Level!");
                                   pokemonlevel3b= 0; 
                               }
                             }
                             else{
                                  System.out.println("Invalid Pokemon!");//if not then ask again
                                  pokemon3b = "n";
                                  if (pokemonlevel3b <16 && pokemonlevel3b >0){
                                    pokemonlevel3b = 0;
                                  }
                                  else{
                                      System.out.println("Invalid Level!");
                                      pokemonlevel3b = 0;
                                      
                                  }
                                  
                             }
                        }
                    }
               }   
            } 
         }
         pokemon4b = "Pokemon";
         pokemonlevel4b = 0;
             
         while(!pokemon4b.equalsIgnoreCase("Pikachu")&& !pokemon4b.equalsIgnoreCase("Charmander")&& !pokemon4b.equalsIgnoreCase("Squirtle")&& !pokemon4b.equalsIgnoreCase("Bulbasaur")){//run as long as not equal to valid pokemon
            while(pokemonlevel4b >15 || pokemonlevel4b <1){//run as long as pokemon level invalid
               System.out.println("\nPlease input Pokemon for " + trainernameb + "(Pikachu/Charmander/Squirtle/Bulbasaur) and level (1-15)");
               pokemon4b = keyboard.next();// ask for data from keyboard
               pokemonlevel4b = keyboard.nextInt();                   
               if (pokemon4b.equalsIgnoreCase("Pikachu")){//if pikachu
                   pokemon4b = "Pikachu";
                   if (pokemonlevel4b <16 && pokemonlevel4b >0){               
                     System.out.println("Added Level " + pokemonlevel4b + " Pikachu for " + trainernameb);
                     menu = 0;
                   }
                   else{
                        System.out.println("Invalid Level!");
                        pokemonlevel4b = 0;          
                        }
               }
               else {
                    if (pokemon4b.equalsIgnoreCase("Charmander")){//if charmander
                        pokemon4b = "Charmander";  
                        if (pokemonlevel4b <16 && pokemonlevel4b >0){
                           System.out.println("Added Level " + pokemonlevel4b + " Charmander for " + trainernameb);
                        menu = 0;
                        }
                        else{
                             System.out.println("Invalid Level!");
                             pokemonlevel4b = 0;
                        }                                                                  
                    }
                    else{
                        if (pokemon4b.equalsIgnoreCase("Squirtle")){//if squirtle
                           pokemon4b = "Squirtle";
                           if (pokemonlevel4b <16 && pokemonlevel4b >0){
                              System.out.println("Added Level " + pokemonlevel4b + " Squirtle for " + trainernameb);
                              menu = 0;
                           }
                           else{
                               System.out.println("Invalid Level!");
                               pokemonlevel4b = 0;
                           }
                        }
                        else{
                            if(pokemon4b.equalsIgnoreCase("Bulbasaur")){//if bulbasaur
                               pokemon4b = "Bulbasaur";
                               if (pokemonlevel4b <16 && pokemonlevel4b >0){
                                 System.out.println("Added Level " + pokemonlevel4b + " Bulbasaur for " + trainernameb);
                                 menu = 0;
                               }
                               else{
                                   System.out.println("Invalid Level!");
                                   pokemonlevel4b= 0; 
                               }
                             }
                             else{
                                  System.out.println("Invalid Pokemon!");//if not then ask again
                                  pokemon4b = "n";
                                  if (pokemonlevel4b <16 && pokemonlevel4b >0){
                                    pokemonlevel4b = 0;
                                  }
                                  else{
                                    System.out.println("Invalid Level!");
                                    pokemonlevel4b = 0;
                                      
                                  }
                                  
                             }
                        }
                    }
               }   
            } 
         }
      }  
        
        
      //-------------------------------------------------------------------------------------------------End Result
      while (menu == 5){
         System.out.println("\n" + trainernamea);
         System.out.println("\nLevel " + pokemonlevel1a + " " + pokemon1a);
         System.out.println("Level " + pokemonlevel2a + " " + pokemon2a);
         System.out.println("Level " + pokemonlevel3a + " " + pokemon3a);
         System.out.println("Level " + pokemonlevel4a + " " + pokemon4a);
          
         System.out.println("\n" + trainernameb);
         System.out.println("\nLevel " + pokemonlevel1b + " " + pokemon1b);
         System.out.println("Level " + pokemonlevel2b + " " + pokemon2b);
         System.out.println("Level " + pokemonlevel3b + " " + pokemon3b);
         System.out.println("Level " + pokemonlevel4b + " " + pokemon4b);
         
         menu = 0;
      }
      //-------------------------------------------------------------------------------------------------Highest pokemon
      while (menu == 6){
         highestpokemonlevela = 0;
         highestpokemonlevelb = 0;
         highestpokemona = "n";
         highestpokemonb = "n";
         
         
         if (pokemonlevel1a >= pokemonlevel2a && pokemonlevel1a >= pokemonlevel3a && pokemonlevel1a >= pokemonlevel4a){
            highestpokemonlevela = pokemonlevel1a;
            highestpokemona = pokemon1a;
         }
         else {
            if (pokemonlevel2a >= pokemonlevel1a && pokemonlevel2a >= pokemonlevel3a && pokemonlevel2a >= pokemonlevel4a){
               highestpokemonlevela = pokemonlevel2a;
               highestpokemona = pokemon2a;
            }
            else {
               if (pokemonlevel3a >= pokemonlevel1a && pokemonlevel3a >= pokemonlevel2a && pokemonlevel3a >= pokemonlevel4a){
                  highestpokemonlevela = pokemonlevel3a;   
                  highestpokemona = pokemon3a;
               }
               else {
                  if (pokemonlevel4a >= pokemonlevel1a && pokemonlevel4a >= pokemonlevel2a && pokemonlevel4a >= pokemonlevel3a){
                     highestpokemonlevela = pokemonlevel4a;
                     highestpokemona = pokemon4a;
                  }
                  else {
                  }
               }
            }
         }   
         if (pokemonlevel1b >= pokemonlevel2b && pokemonlevel1b >= pokemonlevel3b && pokemonlevel1b >= pokemonlevel4b){
            highestpokemonlevelb = pokemonlevel1b;
            highestpokemonb = pokemon1b;
         }
         else {
            if (pokemonlevel2b >= pokemonlevel1b && pokemonlevel2b >= pokemonlevel3b && pokemonlevel2b >= pokemonlevel4b){
               highestpokemonlevelb = pokemonlevel2b;
               highestpokemonb = pokemon2b;
            }
            else {
               if (pokemonlevel3b >= pokemonlevel1b && pokemonlevel3b > pokemonlevel2b && pokemonlevel3b >= pokemonlevel4b){
                  highestpokemonlevelb = pokemonlevel3b;   
                  highestpokemonb = pokemon3b;
               }
               else {
                  if (pokemonlevel4b >= pokemonlevel1b && pokemonlevel4b >= pokemonlevel2b && pokemonlevel4b >= pokemonlevel3b){
                     highestpokemonlevelb = pokemonlevel4b;
                     highestpokemonb = pokemon4b;
                  }
                  else {
                  }
               }
            }
         }     
         if (highestpokemonlevela > highestpokemonlevelb){
            System.out.println("\n" + trainernamea + " has the highest level Pokemon! With a level " + highestpokemonlevela + " " + highestpokemona + ".");
         }  
         else {
            if (highestpokemonlevelb > highestpokemonlevela){
               System.out.println("\n" + trainernameb + " has the highest level Pokemon! With a level " + highestpokemonlevelb + " " + highestpokemonb + ".");
            }
            if (highestpokemonlevela == highestpokemonlevelb){
               System.out.println("\n" + trainernamea + " and " + trainernameb + " tied for highest level pokemon!");
            }
         }
        menu = 0;   
      }   
    }     
  }
}
