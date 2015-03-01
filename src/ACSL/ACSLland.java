package ACSL;

import java.util.Scanner;

public class ACSLland{
   
   String startpoint = "A";//all the variables
   String endpoint = "B";
   String cartype = "C";
   String roadtype = "I";
   double costpg = 0.0;
   double totalgas;
   double gallons;
   int mpg;
   int distance;
   int timeInt;
   int timeRem;
   double timeDoub;
   int roadInt;
   
   public static void main (String[] args){
      Scanner keyboard = new Scanner(System.in);
      int a = 0;//more variables
      int b = 450;
      int c = 590;
      int d = 710;
      int e = 1030;
      int f = 1280;
      int g = 1360;
   
      //set types of cars
      int compactC = 28;//mpg
      int midsizeM = 25;//mpg
      int fullsizeF= 22;//mpg
      int vanSUVV  = 20;//mpg
   
      //set types of roads
      int interstateI = 65;//mph
      int highwayH    = 60;//mph
      int mainroadsM  = 55;//mph
      int sideroadsS  = 45;//mph

      //create an ARRAY
      ACSLland map1 = new ACSLland();// create new objects
      ACSLland map2 = new ACSLland();
      ACSLland map3 = new ACSLland();      
      ACSLland map4 = new ACSLland();
      ACSLland map5 = new ACSLland();
            
      ACSLland[] Maps = new ACSLland[5];
      
      Maps[0] = map1; //set objects as array elements
      Maps[1] = map2;
      Maps[2] = map3;
      Maps[3] = map4;
      Maps[4] = map5;
      
      
            
      System.out.println("Please input the values for your 5 Trips");
      System.out.println("(A-F(Initial Position)[space]B-G(End Position)[space]C,M,F,V(Car Type)[space]I,H,M,S(Type of Road)[space]0.00(Cost/Gallon of Gas))");//ask for user input
      
      for(int trip = 0; trip < 5; trip ++){//repeat 5 times. once for each object in the array
 
         System.out.println("Trip " + (trip+1) + ":");
         Maps[trip].startpoint = keyboard.next();//take input for startpoint start a-g
   
         Maps[trip].endpoint = keyboard.next();//take input for endpoint end a-g
    
         Maps[trip].cartype = keyboard.next();//take input for type of car c,m,f,v
    
         Maps[trip].roadtype = keyboard.next();//take input for type of road i,h,m,s
    
         Maps[trip].costpg = keyboard.nextDouble();//take input for gas cost per gallon
 
         //DISTANCE
         
         int start = 0;
         int end = 0;
         
         if ((Maps[trip].startpoint).equalsIgnoreCase("A")){// set the correct start points and end points
            start = a;
         }
         if ((Maps[trip].startpoint).equalsIgnoreCase("B")){
            start = b;
         }
         if ((Maps[trip].startpoint).equalsIgnoreCase("C")){
            start = c;
         }
         if ((Maps[trip].startpoint).equalsIgnoreCase("D")){
            start = d;
         }
         if ((Maps[trip].startpoint).equalsIgnoreCase("E")){
            start = e;
         }
         if ((Maps[trip].startpoint).equalsIgnoreCase("F")){
            start = f;
         }
         //---------------------------------------
         if ((Maps[trip].endpoint).equalsIgnoreCase("B")){
            end = b;
         }
         if ((Maps[trip].endpoint).equalsIgnoreCase("C")){
            end = c;
         }
         if ((Maps[trip].endpoint).equalsIgnoreCase("D")){
            end = d;
         }
         if ((Maps[trip].endpoint).equalsIgnoreCase("E")){
            end = e;
         }
         if ((Maps[trip].endpoint).equalsIgnoreCase("F")){
            end = f;
         }
         if ((Maps[trip].endpoint).equalsIgnoreCase("G")){
            end = g;
         }
         //TIME
         if ((Maps[trip].roadtype).equalsIgnoreCase("I")){//set the proper road inputs to the proper speed values
            Maps[trip].roadInt = interstateI;
         }
         if ((Maps[trip].roadtype).equalsIgnoreCase("H")){
            Maps[trip].roadInt = highwayH;
         }
         if ((Maps[trip].roadtype).equalsIgnoreCase("M")){
            Maps[trip].roadInt = mainroadsM;
         }
         if ((Maps[trip].roadtype).equalsIgnoreCase("S")){
            Maps[trip].roadInt = sideroadsS;
         }
         //TOTAL GAS
         if ((Maps[trip].cartype).equalsIgnoreCase("C")){//set proper car values to proper fuel usage
            Maps[trip].mpg = compactC;
         }
         if ((Maps[trip].cartype).equalsIgnoreCase("M")){
            Maps[trip].mpg = midsizeM;
         }
         if ((Maps[trip].cartype).equalsIgnoreCase("F")){
            Maps[trip].mpg = fullsizeF;
         }
         if ((Maps[trip].cartype).equalsIgnoreCase("V")){
            Maps[trip].mpg = vanSUVV;
         }
   
         //DISTANCE
         Maps[trip].distance = end - start;//distance is final minus inital
         //TIME
         Maps[trip].timeInt = Maps[trip].distance/Maps[trip].roadInt;//distance over speed integer equals hours
         Maps[trip].timeDoub = Maps[trip].distance % Maps[trip].roadInt;//distance over speed modulus equals remainer
         Maps[trip].timeRem = (int)(Maps[trip].timeDoub/Maps[trip].roadInt*60);//remainder over speed multiply by 60 for minutes 
         //TOTAL GAS
         Maps[trip].gallons = ((double)Maps[trip].distance/Maps[trip].mpg);//distance over miles per gallon gets # of gallons
         Maps[trip].totalgas = Math.round((Maps[trip].gallons * Maps[trip].costpg)*100.0)/100.0;//gallons multiply cost per gallon
      }                                                                                        //equals total cost for trip
      for (int trip = 0; trip < 5; trip ++){//repeat this part five times as well for each object in the array
         //PRINT
         System.out.print("Trip " + (trip+1)+ ":" + Maps[trip].distance + " ");//print out and no ln so dont skip a line after 
         if (Maps[trip].timeInt<10){
            System.out.print("0" + Maps[trip].timeInt + ":");//add a zero if time is less than 10
         }
         else{
            System.out.print(Maps[trip].timeInt + ":");
         }
         if(Maps[trip].timeRem<10){
            System.out.print("0" + Maps[trip].timeRem);//add a zero if time is less than ten
         }
         else{
            System.out.print(Maps[trip].timeRem);//
         }
         
         System.out.println(" $" + Maps[trip].totalgas);//print out the total gas cost
      }   
       
   }
}