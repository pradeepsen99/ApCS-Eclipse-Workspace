import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * @author Pradeep
 * @version 10/31/14
 */
public class MagpieRunner2
{

	public static void main(String[] args)
	{
		Magpie2 maggie = new Magpie2();
		JOptionPane.showMessageDialog(null, maggie.getGreeting());
		//System.out.println (maggie.getGreeting());
		//Scanner in = new Scanner (System.in);
		//String statement = in.nextLine();
		String statement = JOptionPane.showInputDialog("Talk to me!");
		
		
		while (!statement.equals("Bye"))  // || !statement.equals("bye"))
		{
			JOptionPane.showMessageDialog(null, maggie.getResponse(statement));
			//System.out.println (maggie.getResponse(statement));
			//statement = in.nextLine();
			statement = JOptionPane.showInputDialog("Talk to me!");
		}
	}

}
