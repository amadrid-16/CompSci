package checkout;

public class Candy extends DessertItem{
   int cost, pricePerPound;
   double numPounds;
   String name;
   
   public Candy(String name, double numPounds, int pricePerPound){
      this.name = name;
      this.numPounds = numPounds;
      this.pricePerPound = pricePerPound;
   }
   public int getCost(){
      this.cost = (int)this.numPounds * this.pricePerPound;
      return this.cost;
   }
}