/**
* @assignment make_some_animals
* @description Sample class made by guchi. Animal superclass
* 
* @author Angel Madrid 
* @date 1/30/2015
* 
* @version 1.2
*/

public class Dog extends Animal implements Pets {
	public String cry = "Woof";

	public Dog(String inputName){
		name = inputName;
		numLegs = 4;
	}

	public void bark(){
		System.out.println(cry);
	}
   public void run(){
		System.out.println("Huff huff, that was a good run.");
	}
   public void walk(){
      System.out.println("pant");
   }
   public void sleep(){
      System.out.println("ZZZZZ on my doggy bed");
   }

}