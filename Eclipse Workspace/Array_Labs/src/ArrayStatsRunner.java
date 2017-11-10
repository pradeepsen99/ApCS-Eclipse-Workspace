//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

public class ArrayStatsRunner
{
	public static void main(String args[])
	{
		int[] one = {3, 3, 3, 3, 3, 9, 4, 4, 4, 5 ,5 ,5 ,5 ,6 ,6 ,7 ,7 ,7 ,8 ,8 ,8 ,8 ,8 ,8 ,8 ,8};
		ArrayStats test = new ArrayStats(one);
		System.out.println(test.getNumGroupsOfSize(8));
		System.out.println(test);
	}
}



