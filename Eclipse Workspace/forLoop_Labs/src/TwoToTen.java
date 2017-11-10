//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TwoToTen
{
	private String binary;

	public TwoToTen()
	{
		binary="";
	}

	public TwoToTen(String bin)
	{
		binary = bin;
	}

	public void setTwo(String bin)
	{
		binary = bin;
	}

	public long getBaseTen( )
	{
		long ten=0;
		for(int i = binary.length()-1;i>-1;i--){
			if(binary.charAt(i)=='0')
			{
				//System.out.println("  ds");
				
			}
			else if (binary.charAt(i)=='1'){
			ten+=Math.pow(2, i);	}
			
		}
		
		return ten;
	}

	public String toString()
	{
		return binary + "  ==  " + getBaseTen();
	}
}