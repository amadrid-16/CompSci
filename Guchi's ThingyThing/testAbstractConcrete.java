public class testAbstractConcrete{
   
   public static void main(String[] args){
      Animal ditto = new Dog("stella");
      ditto.walk();
      ditto.play();
      ditto.breathe();
      ditto.sleep();
      ditto.play();
      
      
      
      Animal pigme = new Hippo();
      pigme.sleep();
      pigme.walk();
   }
}