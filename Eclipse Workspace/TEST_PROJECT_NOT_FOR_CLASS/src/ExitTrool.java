import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class ExitTrool extends JFrame{

	JPanel pane  = new JPanel();
	JLabel label1 = new JLabel("Hi, I'm Java. STOP LOOKING AT ME", SwingConstants.CENTER);
	
	ExitTrool()
	{
	super("ExitTrool"); 
	setBounds(200,30, 400, 400);
	//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container con = this.getContentPane();
	con.add(pane);
	con.add(label1);
	label1.setPreferredSize(new Dimension(300, 100));
	label1.setFont(new Font("Serif", Font.PLAIN, 70));
	label1.requestFocusInWindow();
	setVisible(true);
	}
	
	public static void main(String[] args){new ExitTrool();} {
		//JOptionPane.showInputDialog("Pls Enter UR NAME");
		//System.exit(0);
		//for int i = 1 to 100
				
		int x = 10;

	      while( x < 10 ) {
	    	  Runtime runTime = Runtime.getRuntime();
	    	  try {
				Process process = runTime.exec("notepad");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	         x++;
	      }

	}

}
