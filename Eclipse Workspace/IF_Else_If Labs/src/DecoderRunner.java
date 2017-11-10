//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*; 
import java.util.Scanner;

public class DecoderRunner
{
	public static void main( String args[] )
	{
		Scanner key = new Scanner(System.in);
		
		
		out.println("Enter a word");
		char ch = key.next().charAt(0);
		Decoder test = new Decoder(ch);
		System.out.println(test);
		
		out.println("Enter a word");
		ch = key.next().charAt(0);
		test = new Decoder(ch);
		System.out.println(test);
		
		out.println("Enter a word");
		ch = key.next().charAt(0);
		test = new Decoder(ch);
		System.out.println(test);
		
		out.println("Enter a word");
		ch = key.next().charAt(0);
		test = new Decoder(ch);
		System.out.println(test);
		
		out.println("Enter a word");
		ch = key.next().charAt(0);
		test = new Decoder(ch);
		System.out.println(test);
		
		out.println("Enter a word");
		ch = key.next().charAt(0);
		test = new Decoder(ch);
		System.out.println(test);
		
		out.println("Enter a word");
		ch = key.next().charAt(0);
		test = new Decoder(ch);
		System.out.println(test);
		
		out.println("Enter a word");
		ch = key.next().charAt(0);
		test = new Decoder(ch);
		System.out.println(test);
	}
}