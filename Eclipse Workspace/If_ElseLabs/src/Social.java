//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class Social
{
   private String socialNum;
   private int sum;

	public Social()
	{
		setWord("");
	}

	public Social(String soc)
	{
		socialNum = soc;
	}


	public void setWord(String w)
	{
		socialNum = w;
	}

	public void chopAndAdd()
	{
		String sub = socialNum;
		int a, b;
		int a1, b1, c1;
		a = sub.indexOf("-");
		b = sub.lastIndexOf("-");
		
		a1 = Integer.parseInt(sub.substring(0, a));
		b1 = Integer.parseInt(sub.substring(a+1, b));
		c1 = Integer.parseInt(sub.substring(b+1, sub.length()));
		
		sum = a1+b1+c1;
	}

	public String toString()
	{
		chopAndAdd();
		return "SS# " + socialNum + " has a total of " + sum + "\n";
	}
}