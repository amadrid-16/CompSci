/**
* @assignment make_some_animals
* @description Sample class made by guchi. Human subclass.
* 
* @author Andrew Miyaguchi 
* @date 1/29/2015
* 
* @version 1.0
*/

public class Human extends Animal {
	public String cry = "Hello! I'm " + name + ". Nice to meet you.";

	public Human(String inputName){
		name = inputName;
		numLegs = 2;
	}

	public void speak(){
		System.out.println(cry);
	}

	public void walk(){
		System.out.println("Huff huff, that was a good run.");
	}

	public void code(){
		System.out.println("Sorry dun't know how to do that, lel");
	}
   public void sleep(){
      System.out.println("ZZzzzzz ZZZZzzzz Snorre");
   }
   public void breathe(){
      System.out.println("Huuuuuh Huuuugh Huhhh");
   }
}