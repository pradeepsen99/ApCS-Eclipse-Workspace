//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TriangleTwo
{
   private int size;
   private String letter;

	public TriangleTwo()
	{
		setTriangle(0,"");
	}

	public TriangleTwo( String let, int sz)
	{
		letter = let;
		size = sz;
	}

	public void setTriangle(int count, String let)
	{
		size = count;
		letter = let;
	}

	public String getLetter()
	{
		String output = "";
		
		for(int i = 0;i<size;i++){
			for(int ii = size;ii>i;ii--){
				output += letter;
			}
			output += "\n";
		}
		return output;
	}

	public String toString()
	{
		String output="";


		output = getLetter();

		return output+"\n";
	}
}