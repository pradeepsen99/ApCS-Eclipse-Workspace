//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

public class HistogramRunner
{
	public static void main(String args[])
	{
		int[] one = {1, 5, 3, 4, 5, 5, 5, 4, 3, 2, 5, 5, 5, 3};
		Histogram test = new Histogram(one);
		test.hi();
		System.out.println(test);
		
		
		int[] two = {2, 3,4, 5, 6, 7, 8, 9, 0, 2, 3, 5, 6, 8, 8, 8, 9, 4, 5};
		test = new Histogram(two);
		test.hi();
		System.out.println(test);
		
		int[] three = {2, 3, 4, 5, 6, 7, 8, 2, 0, 2, 3, 5, 6, 8, 8, 8, 9, 4, 5};
		test = new Histogram(three);
		test.hi();
		System.out.println(test);
	}
}