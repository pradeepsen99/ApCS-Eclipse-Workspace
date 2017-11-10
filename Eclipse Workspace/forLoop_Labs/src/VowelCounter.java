//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class VowelCounter
{
	public static String getNumberString( String s)
	{
		
		String final1 = "";
		int counter = 0;
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U' ){
				counter ++;
				
				final1 += counter;
			}
			else 
				final1 += s.charAt(i);
			
			if (counter > 9)
				counter = 0;
			
		}
		return final1;
	}
}


