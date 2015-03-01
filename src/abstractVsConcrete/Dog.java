/**
* @assignment make_some_animals
* @description Sample class made by guchi. Dog subclass.
* 
* @author Andrew Miyaguchi 
* @date 1/29/2015
* 
* @version 1.0
*/
           /* Animal superclass ||
                                ||
                                ||---must contain the traits of an animal
                                ||
                                ||
           Pets interface-------||  
                                ||
            must also contain   ||
           all necessary pets   ||
           traits               ||
                               \--/
                                \/
                           Dog class*/ 
                             
package abstractVsConcrete;
                             
public class Dog extends Animal implements Pets{
	public String cry = "Woof";

	public Dog(String inputName){
		name = inputName;
		numLegs = 4;
	}

	public void bark(){
		System.out.println(cry);
	}
   
   public void walk(){//extends animal class so this must walk(), breathe(), and sleep() methods
      System.out.println("I'm walking on a leash");
   }
   
   public void breathe(){//extends animal class so this must walk(), breathe(), and sleep() methods

      System.out.println("Pant");
   }
   
   public void sleep(){//extends animal class so this must have walk(), breathe(), and sleep() methods

      System.out.println("ZZZZZZ on my doggie bed");
   }
   
   public void play(){//implements pets so requires be beAdorable() method and play() method
      System.out.println("fetch");
   }
   
   public void beAdorable(){//implements pets so requires be beAdorable() method and play() method

      System.out.println("cuddling");
   }
}