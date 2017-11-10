import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.*;


public class ExperimentClass extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel panel;
	JButton btn1;
	JLabel lbl1;
	public ExperimentClass(){
	
		panel = new JPanel();
		btn1 = new JButton();
		lbl1 = new JLabel();
		
		panel.add(btn1);
		panel.add(lbl1);
		this.add(panel);
		
		
	}
	
	
	public static void main(String[] args) {
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		ExperimentClass pnel = new ExperimentClass();
		pnel.setTitle("Experiment");
		pnel.setSize(300,300);
		//pnel.setLocation((int)screenSize.getHeight() / 2 ,(int)screenSize.getWidth() / 2);
		pnel.setLocation(550,250);
		pnel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pnel.setVisible(true);
		
		pnel.btn1.setSize(50,50);
		
	}

}
