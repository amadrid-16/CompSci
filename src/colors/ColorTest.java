package colors;// test program for the Color class

public class ColorTest
{
   public static void main(String[] args)
   {
   	Color c1 = new Color();			// should be white
   	Color c2 = new Color(20, 20, 0);	
   	Color c3 = new Color(13, 52, 250);
   	Color crazy = new Color(-10, 400, 50);
   
   	System.out.println("c1 is " + c1);
   	System.out.println("crazy color is " + crazy);
   
   	String c2s = c2.toString();
   	System.out.println("c2 is " + c2s);
   
   	System.out.println("c3 html hex code is " + c3.htmlHex());
   	System.out.println("crazy html hex code is " + crazy.htmlHex());
   
   	c2.changeRed(200);
   	c2.changeGreen(-50);
   	c2.changeBlue(300);
   	System.out.println("c2 changed to " + c2.toString());
   
   	Color black = Color.black();
   	String blackcode = black.htmlHex();
   	System.out.println(black + "  " + blackcode);
   
   	System.out.println("black saturation is " + black.saturation());
   	int white = c1.saturation();
   	System.out.println("white saturation is " + white);
   
   
   	if (c1.compareTo(black) < 0)
   		System.out.println(c1 + " lighter than black");
   	else	System.out.println(c1 + " darker than black");
   
   	if (c3.compareTo(c2) > 0)
   		System.out.println("c3 darker than c2");
   	if (c3.compareTo(c2) < 0)
   		System.out.println("c2 darker than c3");
   
   	c2 = new Color(150, 132, 33);
   	if (c2.compareTo(c3) == 0)
   		System.out.println(c2 + " and " + c3  + " same darkness");
   	else	System.out.println("different darkness");
   
   	if (c2.equals(c3))
   		System.out.println("c2 and c3 are the same color");
   	else	System.out.println("c2 and c3 are different colors");
   
   	String code = Color.hexify(13);
   	int v = Color.valid(24);
   	int x = Color.valid(-24);
   	int y = Color.valid(2400);
   	System.out.println(code + " " + v + " " + x + " " + y);
   }
   }
   
   
   /* EXPECTED OUTPUT:
   
   c1 is rgb(255, 255, 255)
   crazy color is rgb(0, 255, 50)
   c2 is rgb(20, 20, 0)
   c3 html hex code is #0D34FA
   crazy html hex code is #00FF32
   c2 changed to rgb(220, 0, 255)
   rgb(0, 0, 0)  #000000
   black saturation is 0
   white saturation is 765
   rgb(255, 255, 255) lighter than black
   c3 darker than c2
   rgb(150, 132, 33) and rgb(13, 52, 250) same darkness
   c2 and c3 are different colors
   0D 24 0 255
   
   */