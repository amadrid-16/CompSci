import java.util.*;

public class Dog{

   String name;
   int size;
   
   
   public void bark(int numberOfBarks){//each void is like a new function you can call by using .bark()
                     //^^^this is where you can get input from the main method
                     //you can also access public variables which are in the class but not
                     //in any method
      Scanner keyboard= new Scanner(System.in);
      int dog = 0;
      for(int count = 0; count < numberOfBarks;count++){     
         
         System.out.println("bark");
    
      }
   }
   
   public void eat(){
      System.out.println("om nom nom");
   
   }
   
   public void chasecat(){
     
      System.out.println("come here cat");
   
   }
      
   
   
   public static void main(String [] args){
      
      int dog = 0;
      Scanner keyboard= new Scanner(System.in);
      
      Dog dog1 = new Dog();
      
      Dog dog2 = new Dog();
   
      Dog dog3 = new Dog();
      
      
       
      Dog[] myDogs = new Dog[4];
      
      myDogs[0] = new Dog();
      myDogs[1] = dog1;
      myDogs[2] = dog2;
      myDogs[3] = dog3;
      
      myDogs[0].name = "Ofid"; 
      myDogs[0].size = 0;
      
      myDogs[1].name = "Fido";
      myDogs[1].size = 1;
      
      myDogs[2].name = "Odif";
      myDogs[2].size = 2;
      
      myDogs[3].name = "Difo";
      myDogs[3].size = 3;
      
      while(dog != 1 || dog != 2 ||dog != 3 || dog !=0){
         System.out.println("\nWhich Dog?");
         
         dog = keyboard.nextInt();
         System.out.println("\nName " + myDogs[dog].name);
         myDogs[dog].bark(myDogs[dog].size);
      }
   }
   
}
   
   
   