/**
* @assignment make_some_animals
* @description Sample class made by guchi. Animal superclass
* 
* @author Angel Madrid 
* @date 1/30/2015
* 
* @version 1.2
*/
public abstract class Animal {
	public boolean isAlive;
	public String eyeColor;
	public int numLegs;
	public String name = "blank";

	abstract public void walk();
   abstract public void breathe();
   abstract public void sleep();
}