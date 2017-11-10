//© A+ Computer Science
// www.apluscompsci.com

//OOP example

public class Triangle1
{
   private int sideA, sideB, sideC;

   public Triangle1()
   {
      setSides(0,0,0);
   }

   public Triangle1(int a, int b, int c)
   {
      setSides(a,b,c);
   }

   public void setSides(int a, int b, int c)
   {
		setSideA(a);

		//add remaining code

   }

   public void setSideA(int a)
   {
   	sideA=a;
   }

   //add set methods for b and c

   public int getSideA()
   {
   	return sideA;
   }

   //add get methods for b and c

   public String toString()
   {
   	return "sides " + getSideA() + " " + sideB + " " + sideC;
   }
}