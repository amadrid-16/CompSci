/** 
	Class to define a playing card type object
*/
public class Card
{
//  ---------------------------------------

	private int value;   // face value of the card
	private String suit; // suit of the card
	
//  -------------------------------------------

	public static int ACEVALUE = 14;  // this is bad = could get illegal value
	private static int ACE = 1;    // this is good, can control
	public static final String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};

//  ------------------------------------------------

public Card(String face, String suit)
{
	setValue(face);
	this.suit = suit;
}

public Card(int face, String s)
{
	if (face >= 1 && face <= 14)
		value = face;
	else
		System.err.println("invalid face value: " + face);
	suit = s;
}

//  --------------------------------------------
public String toString()
{ 
	String face = "";
	switch (value) {//switch a value to something else
	case 1: case 14: face = "Ace"; break;//for case 1 or 14 set face equal to Ace
	case 11: face = "Jack"; break;
	case 12: face = "Queen"; break;
	case 13: face = "King"; break;
	default: face += value;
	}
	return face + " of " + suit;
}

private void setValue(String face)
{
	if (face.equalsIgnoreCase("ace"))
		value = ACE;
	else if (face.equalsIgnoreCase("jack"))
		value = 11;
	else if (face.equalsIgnoreCase("queen"))
		value = 12;
	else if (face.equalsIgnoreCase("king"))
		value = 13;
	else
		System.err.println("invalid face value " + face);//prints error message if not within proper input range
}

public int getValue()
{
	if (value == 1 || value == 14)
		return ACE;  // current setting
	return value;
}

public boolean equals(Card other)
{
	return this.getValue() == other.getValue() &&
		suit.equalsIgnoreCase(other.suit);
}

public int compareTo(Card other)
{
	return getValue() - other.getValue();
}


//  -------------------------------
public static void acesHigh()
{
	ACE = 14;
}

public static void acesLow()
{
	ACE = 1;
}

}