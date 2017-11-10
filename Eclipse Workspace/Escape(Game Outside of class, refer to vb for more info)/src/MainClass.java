import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame; 
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;


public class MainClass extends JPanel implements ActionListener, KeyListener{
	
	static int xCor = 700, yCor = 350;
	static long Score = 0;
	JFrame frame = new JFrame();
	 static int x[] = new int[50];
	static int y[] = new int[50];
	Timer clock = new Timer(70,this);
	public static void main(String[] args) {
		
		MainClass test = new MainClass();
		for (int i=0; i<50; i++){
			x[i] = (int)(Math.random()* 1300 ) + 1;
			y[i] = 0;
		}
		test.Window();
		
				
	}
	
	public void RandomizeNums(){
		for (int i=0; i<50; i++){
			x[i] = (int)(Math.random()* 1300 ) + 1;
		}
	}
	
	public void keyPressed(KeyEvent e){
		int c = e.getKeyCode();
		
		if (c == KeyEvent.VK_W){
			yCor -=   10;}
		
		if (c == KeyEvent.VK_S){
			yCor +=   10;}
		
		if (c == KeyEvent.VK_A){
			xCor -=   10;}
		
		if (c == KeyEvent.VK_D){
			xCor +=   10;}
	}
			
	public void Window(){
		clock.start();
		frame.setSize(1300, 700);
		frame.add(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.addKeyListener(this);
		//frame.setFocusTraversalKeysEnabled(false);
	}
	
	public void paint(Graphics g){
		
		int h, s, b;
		//h = Integer.parseInt(Math.random() * 100)+1;
		//setBackground(Color.getHSBColor(h, s, b));
		g.setColor(Color.orange);
		g.fillRect(xCor, yCor, 20, 40);	
		for (int i=0; i<50; i++){
			if(y[i] == 700){
				y[i] = 0;
				RandomizeNums();
				Score ++;
				frame.setTitle("The score is " + Score / 50);}
			g.setColor(Color.RED);
			g.fillRect(x[i], y[i], 30, 30);
			y[i] += 2;
			
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		for (int i = 0; i <50; i++)
			//if (y[i] == y)
				//JOptionPane.showMessageDialog(frame, "You Lose", "Pew Pew Pew", xCor);
		
		
		
		frame.repaint();
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
			
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		
	}




}
