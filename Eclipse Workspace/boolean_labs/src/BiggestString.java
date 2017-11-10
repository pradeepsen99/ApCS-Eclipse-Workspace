//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -  
//Class -
//Lab  -

import static java.lang.System.*;

public class BiggestString
{
	private String one,two,three;

	public BiggestString()
	{
		this("","","");
	}

	public BiggestString(String a, String b, String c)
	{
		setStrings(a,b,c);
	}

	public void setStrings(String a, String b, String c)
	{
		one = a;
		two = b;
		three = c;
	}

	public String getBiggest()
	{
		//if(one.length()==two.length()&&two.length() == three.length() && three.length() == one.length()){
			if(one.compareTo(two)>two.compareTo(one)&&one.compareTo(three)>three.compareTo(one)){
				return one;
			}
			if(two.compareTo(one)>one.compareTo(two)&&two.compareTo(three)>three.compareTo(two)){
				return two;
			}
			if(three.compareTo(one)>one.compareTo(three)&&three.compareTo(two)>two.compareTo(three)){
				return three;
			}
			
		//}
		//else{
			//if(one.length() < two.length()&&two.length()<three.length()){
				//return two;}
			//if(one.length()>two.length()&&one.length()>three.length()){
				//return one;}
			//if(three.length()>one.length()&&three.length()>two.length()){
				//return three;}
			
		//}
		
		
		return "BLEH";
	}

	public String toString()
	{
	   return one + " " + two + " " + three + " \n" + "Biggest = " + getBiggest()+"\n\n\n\n\n";
	}
}