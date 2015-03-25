package checkout;

public class Sundae extends IceCream{
   
   int cost, toppingCost;
   String name, topping;
   
   public Sundae(String name, int cost, String topping, int toppingCost ){
      super(name, cost);
      this.topping = topping;
      this.toppingCost = toppingCost;      
   }

}