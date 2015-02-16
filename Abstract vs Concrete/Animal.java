/**
* @assignment make_some_animals
* @description Sample class made by guchi. Animal superclass
* 
* @author Andrew Miyaguchi 
* @date 1/29/2015
* 
* @version 1.1
*/

public abstract class Animal {//can have variables but cannot have anything contained in methods
                               //almost like guidlines for any animal. Every type of animal must do 
                               //these things but can do so in their own way.
	public boolean isAlive;
	public String eyeColor;
	public int numLegs;
	public String name = "blank";

	public abstract void walk();//provides a method that must be defined if Animal class is extended
                               // if a class extends Animal class the new class must define what each of the methods
                               //does in its own special way a dog sleeps on a dog bed, a human sleeps on a king size,
                               //a monkey sleeps in the trees, but they all sleep because they are all animals
   
   public abstract void breathe();
   
   public abstract void sleep();
}