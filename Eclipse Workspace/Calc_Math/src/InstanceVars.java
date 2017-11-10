//© A+ Computer Science
// www.apluscompsci.com

//scope and instance variable example

public class InstanceVars
{
   private int one = 8, two = 3;   	//instance variables
   private int answer;	            //exist throughout the class

   public void add()
   {
      answer = one + two;
   }
   
   public void subtractio()
   {
	answer = one - two;   
   }
   
   public void Multiplication()
   {
	   answer = one * two;
   }

   public void Division()
   {
	   answer = one / two;
   }
   
   public void print()
   {
      System.out.println(answer);
   }

   public static void main(String args[])
   {
      InstanceVars test = new InstanceVars();
      test.add();
      test.print();
      
      test.Multiplication();
      test.print();
      
      test.Division();
      test.print();
      
      test.subtractio();
      test.print();
      
////////////////////\\\\\\\\\\\\\\\\\\\\////////////////////\\\\\\\\\\\\\\\\\\\\////////////////////\\\\\\\\\\\\\\\\\\\\/////////
   }
}