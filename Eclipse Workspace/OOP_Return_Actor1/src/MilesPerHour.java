//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
	}

	public void setNums(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
	}

	public void calcMPH()
	{
		System.out.println(hours + "\n"+ minutes + "\n" + distance);
		//minutes = minutes + (hours * 60);
		//hours = minutes / 60;
				
		mph = distance / ((double)(hours * 60 + minutes) / 60);
		
	}

	public void print()
	{
		System.out.println(mph);
		
	}
}
//mines = diatance /time