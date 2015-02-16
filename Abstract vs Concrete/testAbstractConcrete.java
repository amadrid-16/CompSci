public class testAbstractConcrete{

   public static void main(String[] args){
   
      Animal ditto = new Dog("stella");
      ditto.walk();
      ditto.breathe();
      ditto.sleep();
      
      Dog fido = (Dog)ditto;
      fido.play();
      
      Animal pygmy = new Hippo();
      pygmy.sleep();
      pygmy.walk();
   
   }

}