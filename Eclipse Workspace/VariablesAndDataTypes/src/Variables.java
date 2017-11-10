//Name - Pradeep Kumar
//Date - 9/3914
//Class - AP Computer Science

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Variables extends JFrame{

	JPanel pane  = new JPanel();
	JLabel label1 = new JLabel("hihihi", SwingConstants.CENTER);
	
	Variables()
	{
	super("Variables"); setBounds(200,30, 400, 400);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container con = this.getContentPane();
	con.add(pane);
	con.add(label1);
	label1.setPreferredSize(new Dimension(300, 100));
	label1.setFont(new Font("Serif", Font.PLAIN, 12));
	label1.requestFocusInWindow();
	setVisible(true);
	}
	
	public static void main ( String[] args ) {new Variables();}
	{
		
		
				//integer variables
		byte byteOne = 127;


		//decimal variables

		float floatOne = 38.5678f;    
		double  doubleOne = 923.234;   

		//other integer types

	    short  shortOne = -32123;
		int intOne = 90877;
		long longOne = 999999999;   

		//other types

		char charOne = 'A'; 
		boolean booleanOne = true;
		String stringOne = "hello world";  
		
		label1.setText("Pradeep                 09/3/14\n                               \n        Integer types          \n"
				+ "                               \n8 bit - byteOne = "+byteOne+"\t\t\n16 bit - shortOne = "+shortOne+"\t\t\n"
				+ "32 bit - intOne = "+intOne+"\t\t\n64 bit - longOne = "+longOne+"\t\t"
						+ "                               \n        Decimal types          "
						+ "                               \n32 bit - floatOne = "+floatOne+"\n"
						+ "64 bit - doubleOne = "+doubleOne+"                               \n       Other Integer types     "
						+ "                               \nN/A bit - booleanOne = "+booleanOne+"\n"
					    + "64 bit - stringOne = "+stringOne+"\t\t");
		
		//JOptionPane.showMessageDialog(pane,"Pradeep                 09/3/14\n                               \n        Integer types          \n"
				//+ "                               \n8 bit - byteOne = "+byteOne+"\t\t\n16 bit - shortOne = "+shortOne+"\t\t\n"
						//+ "32 bit - intOne = "+intOne+"\t\t\n64 bit - longOne = "+longOne+"\t\t"
								//+ "                               \n        Decimal types          "
								//+ "                               \n32 bit - floatOne = "+floatOne+"\n"
								//+ "64 bit - doubleOne = "+doubleOne+"                               \n       Other Integer types     "
								//+ "                               \nN/A bit - booleanOne = "+booleanOne+"\n"
							    //+ "64 bit - stringOne = "+stringOne+"\t\t");
      

		//output your information here
		System.out.println("/////////////////////////////////");
		System.out.println("*Pradeep                 09/3/14*");
		System.out.println("*                               *");
		System.out.println("*        Integer types          *");
		System.out.println("*                               *");
		System.out.println("*8 bit - byteOne = "+byteOne+"\t\t*");
		System.out.println("*16 bit - shortOne = "+shortOne+"\t\t*");
		System.out.println("*32 bit - intOne = "+intOne+"\t\t*");
		System.out.println("*64 bit - longOne = "+longOne+"\t\t*");
		System.out.println("*                               *");
		System.out.println("*        Decimal types          *");
		System.out.println("*                               *");
		System.out.println("*32 bit - floatOne = "+floatOne+"\t\t*");
		System.out.println("*64 bit - doubleOne = "+doubleOne+"\t\t*");
		System.out.println("*                               *");
		System.out.println("*       Other Integer types     *");
		System.out.println("*                               *");
		System.out.println("*16 bit - charOne = "+charOne+"\t\t*");
		System.out.println("*                               *");
		System.out.println("*         Other types           *");
		System.out.println("*                               *");
		System.out.println("*N/A bit - booleanOne = "+booleanOne+"\t\t*");
		System.out.println("*64 bit - stringOne = "+stringOne+"\t\t*");
	}
}