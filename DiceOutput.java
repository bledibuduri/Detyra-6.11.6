import javax.swing.*;
import java.awt.*;
/**DiceOutput displays dice in the command window.*/
public class DiceOutput extends JPanel 
{
 private int width;//width of the frame
 private int height;//height of the frame 
 
  /** Constructor DiceOutput constructs the window with  a title,
    * x_pos as its x – coordinate and
    * y_pos as its y - coordinate */
	public DiceOutput(String message, int x_pos, int y_pos) 
   {
		width = 300;
		height = 320;
		JFrame frame = new JFrame();
		frame.getContentPane().add(this); 
		frame.setVisible(true);
		frame.setSize(width, height);
		frame.setTitle(message);
		frame.setLocation(x_pos, y_pos);
	}
	
	public void paintComponent(Graphics g) 
   {
		g.setColor(Color.white);
		g.fillRect(0, 0, width, height);
		g.setColor(Color.black);
		g.drawLine(width/3, 0, width/3, height);
		g.drawLine(200, 0, 200, height);
		g.drawLine(0, width/3, width, width/3);
		g.drawLine(0, 200, width, 200);
		
				
		DiceModel obj = new DiceModel();
		int number = obj.throwDice();
		switch (number) 
      {
		case 1: {valueOne(g); break;}
		case 2: {valueTwo(g); break;}
		case 3: {valueThree(g); break;}
		case 4: {valueFour(g); break;}
		case 5: {valueFive(g); break;}
		case 6: {valueSix(g); break;}
		}
	}
	
	/**Draws a circle representing number 1 in a dice*/
	public void valueOne(Graphics g) 
   {
		g.setColor(Color.black);
				g.fillOval(130, 120, 35, 35);
	}
	/** Draws two circles representing number 2 in a dice*/
	public void valueTwo(Graphics g) 
   {
		g.setColor(Color.black);
		g.fillOval(30, 25, 35, 35);
		g.fillOval(230, 225, 35, 35);
	}
	/**Draws three circles representing number 3 in a dice*/
	public void valueThree(Graphics g) 
   {
		g.setColor(Color.black);
		g.fillOval(30, 25, 35, 35);
		g.fillOval(130, 125, 35, 35);
		g.fillOval(230, 225, 35, 35);
	}
	/**Draws four circles representing number 4 in a dice*/
	public void valueFour(Graphics g) 
   {
		g.setColor(Color.black);
		g.fillOval(30, 25, 35, 35);
		g.fillOval(230, 25, 35, 35);
		g.fillOval(30, 225, 35, 35);
		g.fillOval(230, 225, 35, 35);
	}
	/**Draws five circles representing number 5 in a dice*/ 
	public void valueFive(Graphics g) 
   {
		g.setColor(Color.black);
		g.fillOval(30, 25, 35, 35);
		g.fillOval(230, 25, 35, 35);
		g.fillOval(130, 125, 35, 35);
		g.fillOval(30, 225, 35, 35);
		g.fillOval(230, 225, 35, 35);
	}
	/**Draws six circles representing number 6 in a dice*/
	public void valueSix(Graphics g) 
   {
		g.setColor(Color.black);
		g.fillOval(30, 25, 35, 35);
		g.fillOval(230, 25, 35, 35);
		g.fillOval(30, 125, 35, 35);
		g.fillOval(230, 125, 35, 35);
		g.fillOval(30, 225, 35, 35);
		g.fillOval(230, 225, 35, 35);
	}
	
}