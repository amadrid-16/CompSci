/**
 * Angel Madrid
 * Period 2
 * Eno
 * 12/20/14
 * pg4a_madrid
 * 310.413.7615
 * amadrid_16@esusdstudents.org
 */

import java.util.Random; //For Random class

import java.io.*;   // Input Output Package 
import java.util.Scanner; // For the Scanner class  
import java.text.DecimalFormat; // Decimal Format Class

public class pg4a_madrid{

      
      //these are for general usage
      
      //these are for the stat inputs
      int pokemonnameint;//for pokemon name. is transfered from int val to string later
      String pokemonname = "n";//for pokemon name after transfered from int val
      double stab = -1;//same-type attack bonus. This is equal to 1.5 if the attack is of the same type as the user, and 1 if otherwise
      double type = -1;//the type effectiveness. This can be either 0, 0.25, 0.5, 1, 2, or 4 depending on the type of attack and the type of the defending Pokemon.
      double random = -1;//a random number from 0.85 to 1.00 inclusive (from the input).
      int critical = -1;//2 for a critical hit, 1 otherwise.
      double base = -1;//the base damage of the attack. It must be greater than zero.
      int level = -1;//the level of the attacking Pokemon. It must be in the range [1, 99] inclusive.
      int attack = -1;//are the working Attack and Defense stats of the attacking and defending Pokemon, respectively
      int defense = -1;
      //these are for the modifier and damage calcutations
      double modifier = -1;
      double damage = -1;
      //these are for the word parts of the input
      String inputtype = "n";
      String inputlevel = "n";
      String inputattack = "n";
      String inputdefense = "n";
      String inputbase = "n";
      String inputstab = "n";
      String inputcritical = "n";
      String inputrandom = "n";    
      
      public static void main(String[] args)throws IOException{
            
      pg4a_madrid Pokemon1 = new pg4a_madrid();
      pg4a_madrid Pokemon2 = new pg4a_madrid();
      pg4a_madrid Pokemon3 = new pg4a_madrid();
      pg4a_madrid Pokemon4 = new pg4a_madrid();
      pg4a_madrid Pokemon5 = new pg4a_madrid();
      pg4a_madrid Pokemon6 = new pg4a_madrid();
      pg4a_madrid Pokemon7 = new pg4a_madrid();
      pg4a_madrid Pokemon8 = new pg4a_madrid();
      pg4a_madrid Pokemon9 = new pg4a_madrid();
      pg4a_madrid Pokemon10 = new pg4a_madrid();
      pg4a_madrid Pokemon11 = new pg4a_madrid();
      pg4a_madrid Pokemon12 = new pg4a_madrid();
      pg4a_madrid Pokemon13 = new pg4a_madrid();
      pg4a_madrid Pokemon14 = new pg4a_madrid();
      pg4a_madrid Pokemon15 = new pg4a_madrid();
      pg4a_madrid Pokemon16 = new pg4a_madrid();
      pg4a_madrid Pokemon17 = new pg4a_madrid();
      pg4a_madrid Pokemon18 = new pg4a_madrid();
      pg4a_madrid Pokemon19 = new pg4a_madrid();
      pg4a_madrid Pokemon20= new pg4a_madrid();

      pg4a_madrid[] thePokemons = new pg4a_madrid[20];
     
      thePokemons[0] = Pokemon1;
      thePokemons[1] = Pokemon2;
      thePokemons[2] = Pokemon3;
      thePokemons[3] = Pokemon4;
      thePokemons[4] = Pokemon5;
      thePokemons[5] = Pokemon6;
      thePokemons[6] = Pokemon7;
      thePokemons[7] = Pokemon8;
      thePokemons[8] = Pokemon9;
      thePokemons[9] = Pokemon10;
      thePokemons[10] = Pokemon11;
      thePokemons[11] = Pokemon12;
      thePokemons[12] = Pokemon13;
      thePokemons[13] = Pokemon14;
      thePokemons[14] = Pokemon15;
      thePokemons[15] = Pokemon16;
      thePokemons[16] = Pokemon17;
      thePokemons[17] = Pokemon18;
      thePokemons[18] = Pokemon19;
      thePokemons[19] = Pokemon20;
      
      
      //input and formatting
      DecimalFormat df1 = new DecimalFormat("0.00");//to create a new Decimal Format
      String inputfile;//for naming the new input file to be created
      String outputfile;//for naming the new output file
 
      Scanner keyboard= new Scanner(System.in); //for keyboard input
      //---------------code
      
      
      System.out.println("Enter the name of the file you want to read data from:"); //new input file
      inputfile=keyboard.next(); //takes input from keyboard
      
      System.out.println("Enter the name of the file you want to output data to:"); //new output file
      outputfile=keyboard.next(); //takes input from keyboard                                                 
      
      PrintWriter toFile = new PrintWriter(new FileWriter(inputfile));// creates a new text file and names it
      PrintWriter toFile2= new PrintWriter(new FileWriter(outputfile)); // will overwrite anything previously in file
      Scanner fromFile1 = new Scanner(new FileReader(inputfile));    //takes input from inputfile                                           
                                                  //you can use (int)Math.random() * ( Max - Min ) for [0,Max- Min)     you can use (int)Min + (Math.random() * (Max - Min)) for [Min,Max)                                                                         between 0 and 100 then later use that for 85% and 15% of the time probability
      for (int i=1; i <= 20; i++) {//count to 20
         toFile.println((1+(int)(Math.random()*4)) + " Type " +(int)(Math.random()*7) + " Level " +(int)(1+(Math.random()*100)) + " Attack " + (int)(1+(Math.random()*500)) + " Defense " + (int)(1+(Math.random()*500)) + "  Base " + (int)(10+(Math.random()*(250-10))) + " STAB " + (int)(Math.random()*100) + " Critical " + (int)(1 + Math.random()*2) + " Random " + (df1.format((85+(Math.random()*(100-85)))/100)));
      }//create values for input
      toFile.close();//save file here so that it is ready to be used for calculations
      
      toFile2.println("Pokemon Stats"); // write to a file using print, println, printf
       
      System.out.println("output is going to file \"" + outputfile + "\"");//print this out
      
      
      for (int count = 0; count <= 19; count++){ // until end of file 
         thePokemons[count].pokemonnameint = fromFile1.nextInt();//pokemon name
               
         thePokemons[count].inputtype = fromFile1.next();
         thePokemons[count].type = fromFile1.nextFloat();//input type
         thePokemons[count].inputlevel = fromFile1.next();
         thePokemons[count].level = fromFile1.nextInt();//input level
         thePokemons[count].inputattack = fromFile1.next();
         thePokemons[count].attack = fromFile1.nextInt();//input attack
         thePokemons[count].inputdefense = fromFile1.next();
         thePokemons[count].defense = fromFile1.nextInt();//input defense
         thePokemons[count].inputbase = fromFile1.next();
         thePokemons[count].base = fromFile1.nextDouble();//input base damage
         thePokemons[count].inputstab = fromFile1.next();
         thePokemons[count].stab = fromFile1.nextDouble();//input stab       
         thePokemons[count].inputcritical = fromFile1.next();
         thePokemons[count].critical = fromFile1.nextInt();//input critical
         thePokemons[count].inputrandom = fromFile1.next();
         thePokemons[count].random = fromFile1.nextDouble();//input random
         
         if(thePokemons[count].pokemonnameint == 1){//if 1 then change name to pikachu
            thePokemons[count].pokemonname = "Pikachu    ";
         }
         if(thePokemons[count].pokemonnameint == 2){
            thePokemons[count].pokemonname = "Charmander ";
         }
         if(thePokemons[count].pokemonnameint == 3){
            thePokemons[count].pokemonname = "Squirtle   ";
         }
         if(thePokemons[count].pokemonnameint == 4){
            thePokemons[count].pokemonname = "Bulbasaur  ";
         }
         if(thePokemons[count].type == 1){
            thePokemons[count].type = 0;
         }
         if(thePokemons[count].type == 2){
            thePokemons[count].type = 0.25;
         }
         if(thePokemons[count].type == 3){
            thePokemons[count].type = 0.5;
         }
         if(thePokemons[count].type == 4){
            thePokemons[count].type = 1;
         }
         if(thePokemons[count].type == 5){
            thePokemons[count].type = 2;
         }
         if(thePokemons[count].type == 6){
            thePokemons[count].type = 4;
         }
         if(thePokemons[count].stab <= 15){
            thePokemons[count].stab = 1.5;
         }
         if(thePokemons[count].stab > 15){
            thePokemons[count].stab = 1;
         }

         
         thePokemons[count].modifier = (thePokemons[count].stab*thePokemons[count].type*thePokemons[count].critical*(thePokemons[count].random));//for modifier
         thePokemons[count].damage = (int)((((2 * thePokemons[count].level + 10) / 250)*(thePokemons[count].attack / thePokemons[count].defense)*(thePokemons[count].base) + 2)*thePokemons[count].modifier); //for final damage
         toFile2.println("Pokemon #" + (count+1) + ": " + thePokemons[count].pokemonname + "    \tType " + thePokemons[count].type + " \tLevel " + thePokemons[count].level + "  \tAttack " + thePokemons[count].attack + "\tDefense " + thePokemons[count].defense + " "  + "  \tBase " + thePokemons[count].base + "\tSTAB " + thePokemons[count].stab + "\tCritical " + thePokemons[count].critical + "\tRandom " + df1.format(thePokemons[count].random) + "\t= Damage " + thePokemons[count].damage); 
         //print out stats
         
      } 
       
      
           
      fromFile1.close(); //closes input file
      toFile2.close();  // very important: saves output file!!!


   
   }
}