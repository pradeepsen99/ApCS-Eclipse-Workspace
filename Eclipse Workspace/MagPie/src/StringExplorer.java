/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer
{
	public static void main(String[] args)
	{
		String sample = "The quick brown fox jumped over the lazy dog.";
		
		
		 
		int pos = sample.indexOf("slow");
		if (pos != -1)
			System.out.println("slow is found ar position " + pos);
		else
			System.out.println("slow is not found");
		
		
		int position = sample.indexOf("quick");
		System.out.println ("sample.indexOf(\"quick\") = " + position);
		
		//  Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println ("sample.toLowerCase() = " + lowerCase);
		System.out.println ("After toLowerCase(), sample = " + sample);
		String statement = "Computer Science is the best, the greatest and the most wonderful subject to study!";
		
		
		
		statement = statement.toLowerCase();
		int index1 = 0;
		
		String output = "The word 'the' is located in IndexLocations....";
		index1 = statement.indexOf("the", position);
		while (index1 < statement.length()){
			if (index1 > 0){
				output += "\n" +index1;
				index1 = statement.indexOf("the", index1 +3);
			}
			
		
		}
		System.out.println(output);	
	}

}
