package pg1b_madrid;
/**

 * Angel Madrid
 * Period 2
 * Eno
 * 9/24/14
 * pg1b_madrid
 * 310.413.7615
 * amadrid_16@esusdstudents.org
 */

import java.util.Scanner;

public class pg1b_madrid{
    
   public static void main(String[] args){
    
       /**
        * variable declarations
        */ 
        
        //decimal form inputs
        int decform1;
        int decform2;
        int decform3;
        //rgb values
        int redval1;
        int redval2;
        int redval3;
        int greenval1;        
        int greenval2;
        int greenval3;
        int blueval1;
        int blueval2;
        int blueval3;
        //rgb values in rgb format
        String rgbform1;
        String rgbform2;
        String rgbform3;
        //hex conversions from decimal format
        String hexform1;
        String hexform2;
        String hexform3;
        //final formats
        String rgbformfinal;
        String hexformfinal;
         
      /**
       * start of actual program
       */   
        
        /**
         * for Input #1
         */ 
      
         // for getting input from the keyboard
          Scanner keyboard = new Scanner(System.in);
         //for asking user for decimal input number one
          System.out.println("Welcome to the color program");
          System.out.print("Input Color Value #1 in Decimal Form" + "(" + "000000" + ")" + "then hit enter"  + ":");
          decform1 = keyboard.nextInt();
         //the actual converting from decimal to rgb
          redval1 = (decform1 >> 16) & 0xff;
          greenval1 = (decform1 >> 8) & 0xff;
          blueval1 = decform1 & 0xff;
         //setting up rgb format
          rgbform1 = (redval1 + "," + greenval1 + "," + blueval1);
         //printing out rgb format
          System.out.println ("RGB Form 1:" + "(" + rgbform1 + ")" );       
         //for converting to hex format from decimal form
          hexform1 = Integer.toHexString (decform1);
         //for printing out to hex format
          System.out.println("Hexadecimal Form of #1: #" + hexform1 );
          
         /**
         * for Input #2
         */ 
      
         //for asking user for decimal input number two
          System.out.println("Now For the Next Color");
          System.out.print("Input Color Value #2 in Decimal Form" + "(" + "000000" + ")" + "then hit enter"  + ":");
          decform2 = keyboard.nextInt();
         //the actual converting from decimal to rgb
          redval2 = (decform2 >> 16) & 0xff;
          greenval2 = (decform2 >> 8) & 0xff;
          blueval2 = decform2 & 0xff;
         //setting up rgb format
          rgbform2 = (redval2 + "," + greenval2 + "," + blueval2);
         //printing out rgb format
          System.out.println ("RGB Form of #2:" + "(" + rgbform2 + ")" );       
         //for converting to hex format from decimal form
          hexform2 = Integer.toHexString (decform2);
         //for printing out to hex format
          System.out.println("Hexadecimal Form of #2: #" + hexform2 );
            
         /**
         * for Input #3
         */ 
      
         //for asking user for decimal input number three
          System.out.println("Now For the Next Color");
          System.out.print("Input Color Value #3 in Decimal Form" + "(" + "000000" + ")" + "then hit enter"  + ":");
          decform3 = keyboard.nextInt();
         //the actual converting from decimal to rgb
          redval3 = (decform3 >> 16) & 0xff;
          greenval3 = (decform3 >> 8) & 0xff;
          blueval3 = decform3 & 0xff;
         //setting up rgb format
          rgbform3 = (redval3 + "," + greenval3 + "," + blueval3);
         //printing out rgb format
          System.out.println ("RGB Form of #3:" + "(" + rgbform3 + ")" );       
         //for converting to hex format from decimal form
          hexform3 = Integer.toHexString (decform3);
         //for printing out to hex format
          System.out.println("Hexadecimal Form of #3: #" + hexform3 );
          
         /**
         * for New Color
         */ 
      
         //telling user there will be another color
          System.out.println("Now For a New Color");
         //setting up rgb format
          rgbformfinal = (redval1 + "," + greenval2 + "," + blueval3);
         //printing out rgb format
          System.out.println ("RGB Form of New Color:" + "(" + rgbformfinal + ")" );       
         //for converting to hex format from rgb form
          hexformfinal = String.format("#%02x%02x%02x", redval1, greenval2, blueval3);
         //for printing out to hex format
          System.out.println("Hexadecimal Form of New Color:" + hexformfinal );
           
          
          
          
    }
    
    } 
    
    
  /**
   * Reflection
   * 
   * This was very useful for learning printing out, converting, using 
   * google to help get where you need to be, organizing, and using integers 
   * and strings. This program was fairly difficult if not very difficult 
   * because we had no idea what to do but after a little deeper reading and 
   * looking things up it became much easier to comprehend the problem and 
   * how to solve it. This problem took a few hours to complete. The best part
   * getting the first color to convert then I knew exactly what to do from
   * there. I would not redesign this assignment it had the right amount of 
   * prior knowledge and thinking. 
   */  
   