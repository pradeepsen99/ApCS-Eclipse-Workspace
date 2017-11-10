//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

public class AverageRunner
{
	public static void main( String[] args )
   {
		Average avg = new Average();
		
		avg.setNums(5,5);
		avg.average();
		avg.print();
		
		avg.setNums(90, 100.0);
		avg.average();
		avg.print();
		
		avg.setNums(100, 85.8);
		avg.average();
		avg.print();
		
		avg.setNums(-100, 55);
		avg.average();
		avg.print();
		
		avg.setNums(15236, 5642);
		avg.average();
		avg.print();
		
		avg.setNums(1000, 555);
		avg.average();
		avg.print();
		
	
	}
}