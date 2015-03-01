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
public class Pig extends Animal {
   public String cry = "Oink";
   
   public Pig(String inputName){
		name = inputName;
		numLegs = 4;
	}
   public void oink(){
      System.out.println(cry);
   }
   public void eat(){
		System.out.println("Om Nom Nom. Slop is life");
	}
   public void walk() {	
   }
   public void breathe() {	
   }
   public void sleep() {	
   }
}