//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StarsAndStripes
{
   public StarsAndStripes()
   {
      out.println("StarsAndStripes");
      printTwoBlankLines();
   }

   public void printTwentyStars()
   {
	  out.println("********************");
   }

   public void prnt20Dsh()
   {
	   out.println("--------------------");
   }

   public void printTwoBlankLines()
   {
	  out.println("");
	  out.println("");
   }
   
   public void printASmallBox()
   {	
	   prnt20Dsh();
	   printTwentyStars();
	   prnt20Dsh();
	   printTwentyStars();
	   prnt20Dsh();
	   printTwentyStars();
	   prnt20Dsh();
   }
 
   public void printABigBox()
   { 	
	   	   printASmallBox();
	   printASmallBox();
   } 
   
   public void hihihi()
   {
	   printASmallBox();
   printTwoBlankLines();
   printABigBox();
   }
}