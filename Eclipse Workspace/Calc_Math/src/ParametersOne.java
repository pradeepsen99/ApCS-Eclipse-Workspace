//© A+ Computer Science
// www.apluscompsci.com

//parameter example 1

import static java.lang.System.*;

public class ParametersOne
{
	public void times(Object hi, Object hihi)
	{
	   out.println(hi + "\n" +hihi);
	}

   public static void main(String args[])
   {
		ParametersOne test = new ParametersOne();
		test.times("HIHIHI", "NJHFUREHIUWFKJHKJWEF");
   }
}
