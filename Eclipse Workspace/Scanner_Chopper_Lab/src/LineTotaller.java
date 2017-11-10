//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class LineTotaller
{
   private String line;

	public LineTotaller()
	{
		setLine("");
	}

	public LineTotaller(String s)
	{		
		line = s;
	}

	public void setLine(String s)
	{
		line = s;
	}

	public int getSum()
	{
	
		Scanner line2 = new Scanner(line);
		int count=0;	
		
		while(line2.hasNextInt()){
			line2.nextInt();
			count+=line2.nextInt();
		}
		
		return count;
	}

	public String getLine()
	{
		String bleh = "";
		bleh = line;
		return bleh;
	}

	public String toString()
	{
		return getLine() +"\n" + "Count = "+getSum()+"\n\n\n\n";
	}
}