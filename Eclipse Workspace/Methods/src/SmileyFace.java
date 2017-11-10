//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class SmileyFace extends Canvas
{
   public SmileyFace()    //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      smileyFace(window);
   }

   public void smileyFace( Graphics window )
   {
      window.setColor(Color.BLUE);
      window.drawString("SMILEY FACE LAB ", 35, 35);

      window.setColor(Color.YELLOW);
      window.fillOval( 210, 100, 400, 400 );

		//add more code here
      window.setColor(Color.RED);
      window.fillOval(300, 150, 50, 50);
      window.fillOval(450, 150, 50, 50);
      
      window.setColor(Color.BLACK);
      window.fillOval(300, 150, 25, 25);
      window.fillOval(450, 150, 25, 25);

      
      window.setColor(Color.red);
      window.drawArc(250, 170, 300 ,300, 180,180);
      
      window.setColor(Color.ORANGE);
      window.drawString("I WILL SUCK YOUR SOUL ", 340,550);
      
      window.setColor(Color.BLUE);
      
      
   }
}