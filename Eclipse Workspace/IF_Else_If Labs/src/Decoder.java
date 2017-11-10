//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*; 

public class Decoder
{
	private char letter;

	public Decoder()
	{
		setLetter(' ');
		
	}

	public Decoder(char let)
	{
		letter = let;
		
	}

	public void setLetter(char let)
	{
		letter = let;

	}

	public char deCode()
	{
		char result=0;
		
		switch (letter){
		
		case '0' : result = 'A'; break;
		case '1' : result = 'B'; break;
		case '2' : result = 'C'; break;
		case '3' : result = 'D'; break;
		case '4' : result = 'E'; break;
		case '5' : result = 'F'; break;
		case '6' : result = 'G'; break;
		case '7' : result = 'H'; break;
		case '8' : result = 'I'; break;
		case '9' : result = 'J'; break;
		}
		
		boolean hi = Character.isUpperCase(letter);
		
		//if (hi == true)
			//result = Character.toUpperCase(letter);
		//else if (hi == false)
			//result = Character.toLowerCase(letter);
		
		
		
		if ((letter) >= 65 && letter <= 91)
			result = (char)(letter + 32);
		else if (letter >= 97 && letter <= 123)
			result = (char)(letter - 32);
		else
			result = '#';
		
		
		
		return result;
	}

	public String toString()
	{
		return "The code is " + (String.valueOf(deCode()));
	}
}