//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.Canvas;

class ColoredBoxes extends Canvas
{
	public ColoredBoxes()
	{
		setBackground(Color.WHITE);
	}

	public void paint( Graphics window )
	{
		window.setColor(Color.RED);
		window.setFont(new Font("TAHOMA",Font.BOLD,12));
	  	window.drawString("Graphics Lab Lab11g ", 20, 40 );
	  	window.drawString("Drawing boxes with nested loops ", 20, 80 );

	  	drawBoxes(window);
	}

	public void drawBoxes(Graphics window)
	{
		//nested loops to draw the pretty boxes
	}
}