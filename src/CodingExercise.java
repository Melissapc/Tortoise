/* Level 0 Exam: Coding  Exercise #1 */
// Copyright Wintriss Technical Schools 2013

import java.awt.Color;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

import com.spun.util.database.SQLQuery.FromPart;

public class CodingExercise
{
	public static void main(String[] args)
	{
		// 3. ask the user what color they would like the tortoise to draw
		 String color=JOptionPane.showInputDialog("what color do you want for the tortoise to draw");
		
		// 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
		if(color.equals("blue"))
			Tortoise.setPenColor(Color.blue);
		else if(color.equals("red"))
			Tortoise.setPenColor(Color.RED);
		// 2. set the pen width to 10
		Tortoise.setPenWidth(10);
		
		// 1. make the tortoise draw a shape
		Tortoise.show();
		Tortoise.setSpeed(10);
		for (int i = 0; i < 4; i++) {
			Tortoise.turn(90);
			Tortoise.move(100);
		}
		
		
	}
}






