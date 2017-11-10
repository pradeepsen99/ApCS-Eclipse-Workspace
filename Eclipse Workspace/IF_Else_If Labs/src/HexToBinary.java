//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*; 

public class HexToBinary
{
	private char hex;

	public HexToBinary()
	{
		setHex(' ');

	}

	public HexToBinary(char hexNum)
	{
		hex = hexNum;

	}

	public void setHex(char hexNum)
	{
		hex = hexNum;

	}

	public String getBinary()
	{
		String return1 = "";
		switch (hex)
		{
		case 'A' : return1 = "1010";
		break;
		case 'B' : return1 = "1011";
		break;
		case 'C' : return1 = "1100"; 
		break;
		case 'D' : return1 = "1101" ;
		break;
		case 'E' : return1 = "1110"; 
		break;
		case 'F' : return1 = "1111"; 
		
		default : return1 = "THERE IS NO BINARY";
		}

		return "";
	}

	public String toString()
	{
		return "The binary code is " + getBinary();
	}
}