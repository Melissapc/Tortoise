import java.awt.Color;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class slavetortortoise2214 {
	public static void main(String[] args) {
		Tortoise.show();
		Tortoise.setSpeed(10);
		String Question = JOptionPane.showInputDialog("which shape do you want?");
		String Color = JOptionPane.showInputDialog("which color do you want there are red, blue, black?");
		if(Color.equals("red"))
			Tortoise.setPenColor(java.awt.Color.red);
		else if(Color.equals("blue"))
			Tortoise.setPenColor(java.awt.Color.blue);
		else if(Color.equals("black"))
			Tortoise.setPenColor(java.awt.Color.black);
		
		if (Question.equals("square")) {
			drawSquare();
		} else if (Question.equals("triangle"))
			drawTriangle();

		else if (Question.equals("circle"))
			drawCircle();
		else JOptionPane.showMessageDialog(null,"there is none of these shapes");
	}

	public static void drawSquare() {

		
		for (int i = 0; i < 4; i++) {
			Tortoise.turn(90);
			Tortoise.move(100);

		}

	}

	public static void drawTriangle() {
		for (int i = 0; i < 3; i++) {
			Tortoise.turn(360 / 3);
			Tortoise.move(90);
		}

	}

	public static void drawCircle() {
		for (int i = 0; i < 360; i++) {
			Tortoise.move(1);
			Tortoise.turn(1);
		}
	}

	
}
