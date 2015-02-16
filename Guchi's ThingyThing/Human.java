/**
* @assignment make_some_animals
* @description Sample class made by guchi. Animal superclass
* 
* @author Angel Madrid 
* @date 1/30/2015
* 
* @version 1.2
*/

public class Human extends Animal {
	

	public Human(String inputName){
		name = inputName;
		numLegs = 2;
	}

	public void speak(){
		String cry = "Hello! I'm " + name + ". Nice to meet you.";
      System.out.println(cry);
	}

	public void run(){
		System.out.println("Huff huff, that was a good run.");
	}

	public void code(){
		System.out.println("Sorry dun't know how to do that, lel");
	}
}