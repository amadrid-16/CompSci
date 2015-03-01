package GuchiThingyThing;

/**

* @assignment make_some_animals
* @description Sample class made by guchi. Animal superclass
* 
* @author Angel Madrid 
* @date 1/30/2015
* 
* @version 1.2
*/

import java.util.*;
public class testClass {
	public static void main(String[] args){
		// Make a new scanner for input
		Scanner userIn = new Scanner(System.in); // FYI, this is a constructor too!

		// Get your name for your program
		System.out.print("What is your name?\n> ");
		String yourName = userIn.nextLine();

		// Make new Dog and Human Objects
		Dog biscuit = new Dog("Biscuit");
		Human eno = new Human("Steve");
      Pig pig = new Pig("Sweg Pig");

		// Make a menu to run all the commands
		while(true){	// Loop the menu 
			clear();
			System.out.println("Welcome to " + yourName + "'s Sample program.");
			System.out.println("What do you want to do?");
			System.out.println("1. Make Eno run");
			System.out.println("2. Make Eno code");
			System.out.println("3. Make Eno speak");
			System.out.println("4. Make Biscuit bark");
         System.out.println("5. Make Biscuit run");
         System.out.println("6. Make Sweg Pig oink");
         System.out.println("7. Make Sweg Pig eat");
			System.out.println("8. Exit");
			System.out.print("> ");

			String userInput = userIn.nextLine(); // Get user selection

			if(userInput.equals("1")){	// Makes eno run
				eno.run();
				pause();
			} else if(userInput.equals("2")){	// Makes eno code
            eno.code();
				pause();

			} else if(userInput.equals("3")){	// Makes eno speak
				eno.speak();
				pause();// NEEDS CODE


			} else if(userInput.equals("4")){	// Makes biscuit bark
				biscuit.bark();
				pause();// NEEDS CODE
            
         } else if(userInput.equals("5")){	// Makes biscuit bark
				biscuit.run();
				pause();// NEEDS CODE
         
         } else if(userInput.equals("6")){	// Makes biscuit bark
				pig.oink();
				pause();
            
         } else if(userInput.equals("7")){	// Makes biscuit bark
				pig.eat();
				pause();

			} else if(userInput.equals("8")){	// exits program
				System.out.println("Cya later " + yourName + "!");
				break;	// Exits the while loop, therefore exiting the program
			} else {	// Default action if none of the if statements match
				System.err.println("That's not a valid option!");
				pause();
			}
		}



	}

	// Clears the console screen
	public static void clear(){
		for(int i = 0; i < 50; i ++)
			System.out.println();
	}

	// waits for the user to press enter
	public static void pause(){
		Scanner userNext = new Scanner(System.in);
		System.out.print("Press enter to continue...");
		userNext.nextLine(); // Dont save the value to a variable
	}
}