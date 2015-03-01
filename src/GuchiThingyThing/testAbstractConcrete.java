package GuchiThingyThing;

public class testAbstractConcrete{
   
   public static void main(String[] args){
      Animal ditto = new Dog("stella");
      ditto.walk();
      ditto.breathe();
      ditto.breathe();
      ditto.sleep();
      ditto.sleep();
      
      
      
      Animal pigme = new Hippo();
      pigme.sleep();
      pigme.walk();
   }
}