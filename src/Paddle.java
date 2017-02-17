//Name -
//Date -
//Class -
//Lab  - 

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   private int speed;
   private int xPos;
   private int yPos;
   private int width;
   private int height;
   
   private Color color;
   
   public Paddle()
   {
		super(10,10,10,10, Color.DARK_GRAY);
      speed =5;
   }

   public Paddle(int x, int y, int w, int h, Color col, int i)
   {
	   xPos = x;
	   yPos = y;
	   width = w;
	   height = h;
	   color = col;
	   speed = i;
   }

   public void moveUpAndDraw(Graphics window)
   {


   }

   public void moveDownAndDraw(Graphics window)
   {


   }

   public int getX()
   {
	   return xPos;
   }
   
   public int getY()
   {
	   return yPos;
   }
   
   
   public String toString()
   {
	   return xPos + " " + yPos + " " + width + " " + height + " " + color + " ";
   }
}