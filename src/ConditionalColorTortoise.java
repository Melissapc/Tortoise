		//1. make the tortoise draw a shape (this will take more than one line of code)
		// Copyright Wintriss Technical Schools 2013
import java.awt.Color;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;


public class ConditionalColorTortoise {

	public static void main(String[] args) {
		int length = 50;
		
		for (int i = 0; i < 10; i++) {

		
		//3. ask the user what color they would like the tortoise to draw
		String color=JOptionPane.showInputDialog("what Color would you like?");
		
		//4. use an if/else statement to set the pen color that the user requested
		if(color.equals("blue"))
			Tortoise.setPenColor(Color.blue);
		else if(color.equals("red"))
			Tortoise.setPenColor(Color.RED);
		else if(color.equals("pink"))
			Tortoise.setPenColor(Color.pink);
		else if(color.equals("green"))
			Tortoise.setPenColor(Color.green);
		else if(color.equals("black"))
				Tortoise.setPenColor(Color.black);
		else if(color.equals("magenta"))
			Tortoise.setPenColor(Color.magenta);
		else if(color.equals("orange"))
			Tortoise.setPenColor(Color.orange);

//5. if the user doesnÕt enter anything, choose a random color
		else
			Tortoise.setPenColor(Colors.getRandomColor());
		

//6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		
		//2. set the pen width to 10 
		Tortoise.setPenWidth(10);
		Tortoise.setSpeed(10);
		
		Tortoise.move(length);
		Tortoise.turn(120);
		Tortoise.move(length);
		Tortoise.turn(120);
		Tortoise.move(length);
		
		length += 20;
		
		}
	}
}





