public class testCard{
   public static void main(String[]args){
      Card a = new Card("jack", "spades");
      Card b = new Card("queen", "hearts");
      Card c = new Card("king", "diamonds");
      Card d = new Card("ace", "clubs");  
      
      System.out.println("a is " + a.toString());
      System.out.println("b is " + b.toString());
      System.out.println("c is " + c.toString());
      System.out.println("d is " + d.toString());
            
      System.out.println("a is the value " + a.getValue());
      System.out.println("b is the value " + b.getValue());
      System.out.println("c is the value " + c.getValue());
      System.out.println("d is the value " + d.getValue());
      /**a.equals();
      b.equals();
      c.equals();
      d.equals();            
      a.compareTo();
      b.compareTo();
      c.compareTo();
      d.compareTo();
      a.acesHigh();
      b.acesHigh();
      c.acesHigh();
      d.acesHigh();
      a.acesLow();
      b.acesLow();
      c.acesLow();
      d.acesLow();**/
      
   }
}