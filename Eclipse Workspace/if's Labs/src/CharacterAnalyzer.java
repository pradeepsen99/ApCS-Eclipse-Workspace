//� A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer
{
	private char theChar;

	public CharacterAnalyzer()
	{
		theChar = ' ';
	}

	public CharacterAnalyzer(char c)
	{
		theChar = c;
	}

	public void setChar(char c)
	{
		theChar = c;
	}

	public char getChar()
	{
		return theChar;
	}

	public boolean isUpper( )
	{
		if(getASCII() > 64){
		 if(getASCII() < 91)
		return true;}
		return false;
	}

	public boolean isLower( )
	{
		
		if(getASCII() > 96){
			 if(getASCII() < 123)
			return true;}
		
		return false;
	}
	
	public boolean isNumber( )
	{
		if(getASCII() > 48){
			 if(getASCII() < 58)
			return true;}
		
		return false;
	}	

	public int getASCII( )
	{
		
		return (int) theChar;
	}

	public String toString()
	{
		if (isLower() == true){
		return ""+getChar() + " is a lowercase character. ASCII == " + getASCII() + "\n";	  }
		
		if (isUpper() == true){
			return ""+getChar() + " is a UpperCase character. ASCII == " + getASCII() + "\n";	}
		
		if (isNumber() == true){
			return ""+getChar() + " is a Number character. ASCII == " + getASCII() + "\n";	  }
		
		return "none";
	}
}