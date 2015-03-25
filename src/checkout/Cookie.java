package checkout;

public class Cookie extends DessertItem{
   String name;
   int number, pricePerDozen, cost;
   
   public Cookie(String name, int number, int pricePerDozen){
      this.name = name;
      this.number = number;
      this.pricePerDozen = pricePerDozen;  
   }
   public int getCost(){
      this.cost = (int)this.number * (this.pricePerDozen/12);
      return this.cost;
   }
}