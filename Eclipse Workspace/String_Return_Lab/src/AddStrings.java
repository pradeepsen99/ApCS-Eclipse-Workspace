//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class AddStrings
{
   private String first, last;
   private String sum;

   public AddStrings()
   {
	   setStrings("","");
   }

   public AddStrings(String one, String two)
   {
	   first = one;
	   last = two;
   }

   public void setStrings(String one, String two)
   {
	   first = one;
	   last = two;
   }

 	public void add( )
 	{
 		System.out.println("First word = "+first);
 		System.out.println("Second word = " + last);
 		
 		sum = first + " " + last;
 		System.out.println("Sum word = "+sum);
	}

 	public String toString()
 	{
 		String output="";
 		return output;
	}
}