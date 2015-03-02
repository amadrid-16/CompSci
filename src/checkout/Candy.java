package checkout;

public class Candy extends DessertItem{
   int cost, centsPerPound;
   double numPounds;
   String name;
   
   public Candy(String name, double numPounds, int centsPerPound){
      this.name = name;
      this.numPounds = numPounds;
      this.centsPerPound = centsPerPound;
   }
   public int getCost(){
      this.cost = (int)this.numPounds * this.centsPerPound;
      return this.cost;
   }
}