//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

public class Cube
{
	private double side;
	private double surfaceArea;

	public void setSide(int s)
	{
		side = s;
	}

	public void calculateSurfaceArea( )
	{
		surfaceArea = 6 * Math.pow(side, 2);
	}

	public void print( )
	{
		System.out.println("The surface Area is = " + surfaceArea);
	}
}