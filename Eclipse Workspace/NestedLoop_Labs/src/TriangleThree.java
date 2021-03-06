//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TriangleThree
{
   private int size;
   private String letter;

	public TriangleThree()
	{
		this(0,"");
	}

	public TriangleThree(int count, String let)
	{
		size = count;
		letter = let;
	}

	public void setTriangle( String let, int sz )
	{
		size = sz;
		letter = let;
	}

	public String getLetter() 
	{
		String output = "";
		for(int i = 0; i<size;i++){
			
			for(int ii = size;i> i;i--){
				output += " ";
				
			}
			
			for(int iii = 0; i< size; i++){
				
				output += letter;
				
			}
			output += "\n";
			
		}
		return output;
	}

	public String toString()
	{
		String output="";
		output = getLetter() + "\n";
		return output+"\n";
	}
}