//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*; 

public class Grade
{
	private int numGrade;

	public Grade()
	{
		setGrade(0);
	}

	public Grade(int grade)
	{
		numGrade=  grade;
	}

	public void setGrade(int grade)
	{
		numGrade = grade;
	}

	public String getLetterGrade( )
	{
		String letGrade="";
		if (numGrade >= 90)
			letGrade = "A";
		else if (numGrade >= 80 && numGrade <90 )
			letGrade = "B";
		else if (numGrade >= 70 && numGrade <80)
			letGrade = "C";
		else if (numGrade >= 60 && numGrade <70)
			letGrade = "D";
		else if (numGrade <50)
			letGrade = "F";
		return letGrade;
	}

	public String toString()
	{
		return numGrade + " is a " + getLetterGrade() + "\n";
	}
}