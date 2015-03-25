package checkout;

import java.util.ArrayList;
public class Checkout{

   public int numberOfItems;
   ArrayList<DessertItem> checkoutList;//must be accessable to all the methods
   
   public Checkout(){
      //ArrayList<variable type> ListName = new ArrayList<variable type>(initial size);
   
      //also import java.util.ArrayList
   
      //name.add(object);
     checkoutList = new ArrayList<DessertItem>(1);//manipulates the given array list
                                                  //because an arraylist has the ability
                                                  //to change size unlike an array.also only for objects      
   }
   public int numberOfItems(){
      Object[] checkoutArray = checkoutList.toArray();//create new array from previously made arraylist
      checkoutArray = checkoutList.toArray(checkoutArray);//
      return numberOfItems;
   }
   public void enterItem(DessertItem item){
      checkoutList.add(item);
   }
   
}