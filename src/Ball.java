//Name -
//Date -
//Class -
//Lab  - 

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Color color;
	
	public Ball()
	{
		super(200,200,10,10, Color.BLACK);
		xSpeed = 3;
		ySpeed = 1;
	}
	public Ball(int x, int y, int w, int h, Color col, int i, int j)
	{
		xPos = x;
		yPos = y;
		width = w;
		height = h;
		color = col;
		xSpeed = i;
		ySpeed = j;
	}
	
	 public void setYSpeed(int y) 
	 {
		  y = ySpeed;
	 }
	   
	 public void setXSpeed(int x) 
	 {
		  x = xSpeed;	
	 }
	 
   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	   window.setColor(Color.WHITE);
	      window.drawOval(xPos, yPos, width, height);   

      setX(getX()+xSpeed);
      setX(getY()+ySpeed);
      

		//draw the ball at its new location
      window.setColor(color);
      window.fillOval(xPos, yPos, width, height);
   }
   
	public boolean equals(Object obj)
	{




		return false;
	}   

	public int getXSpeed()
	   {
		   return xSpeed;
	   }
	   
	 public int getYSpeed()
	   {
		   return ySpeed;
	   }

	public String toString()
	   {
		   return xPos + " " + yPos + " " + width + " " + height + " " + color + " ";
	   }
	
}