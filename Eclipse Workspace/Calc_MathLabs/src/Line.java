//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Line
{
	private double xOne,yOne, xTwo, yTwo;
	private double slope;
double xSum, ySum;
	public void Line1(double x1, int y1, int x2, int y2)
	{
		xOne = x1;
		xTwo = x2;
		yOne = y1;
		yTwo = y2;
		
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{

		
		
		
		xSum = xTwo - xOne;
		ySum = yTwo - yOne;
		
		
	}

	public void calculateSlope( )
	{
		
		
		slope = ySum/xSum;


	}

	public void print( )
	{

		System.out.println("the slope is" + slope);
		//System.out.printf("%.2f", slope);

	}
}