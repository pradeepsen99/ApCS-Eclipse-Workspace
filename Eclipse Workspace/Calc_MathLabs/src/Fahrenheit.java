//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

public class Fahrenheit
{
	private double fahrenheit;
	
	public void setFahrenheit(double fahren)
	{
		fahrenheit = fahren;
	}

	public double getCelsius()
	{
		
		double celsius = 0.0;
		celsius = fahrenheit - 32;
		celsius = celsius * 5/9;
		
		return celsius;
	}

	public void print()
	{
		
		System.out.println(fahrenheit + "degrees Fahrenheit == "+ String.format("%.2f",  getCelsius()) + " degrees Celsius");
		
	}
}
