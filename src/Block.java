//Name -
//Date -
//Class -
//Lab  - 

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private int xSpeed;
	private int ySpeed;
	private int speed;
	
	private Color color;

	public Block()
	{

	}

	//add other Block constructors - x , y , width, height, color
	public Block(int x, int y, int w, int h, int c)
	{
		xPos = x;
		yPos = y;
		this.width = w;
		this.height = h;
		this.color = c;
		
	}
	
   //add the other set methods
   public void setPos( int x, int y);
   {
    	x = xPos;
    	y = yPos;
   }

   public void setX( int x );
   {
       x = xPos;	
   }

   public void setY( int y )
   {
       y = yPos;
   }
   
   public void setWidth( int w )
   {
       w = width;
   }
   
   public void setHeight( int h )
   {
       h = height;
   }
   
   public void setColor(Color col)
   {
	   col = color;

   }
   
   public void setYSpeed(int y) 
   {
		y = ySpeed;
   }
   
   public void setXSpeed(int x) 
   {
	    x = xSpeed;	
   }
   
   public int getX()
   {
	   return xPos;
   }
   
   public int getY()
   {
	   return yPos;
   }
   
   public int getWidth()
   {
	   return width;
   }
   
   public int getHeight()
   {
	   return height;
   }

   public void draw(Graphics window)
   {
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {


   }
   
	public boolean equals(Object obj)
	{




		return false;
	}   
 
   public String toString()
   {
	   return xPos + " " + yPos + " " + width + " " + height + " " + color + " ";
   }
}