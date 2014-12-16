import java.awt.Color;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class houses {
	public static void main(String[] args) {
		Tortoise.setX(10);
		Tortoise.setY(425);
		Tortoise.show();
		Tortoise.setSpeed(10);
		height("large", "red");
		height("medium", "pink");
		height("small", "blue");
		height("medium", "pink");
		height("small", "blue");
		height("large", "red");
		height("small", "blue");
		height("medium", "pink");
		height("large", "red");
	}

	static void height(String size, String color) {
		int height = 0;
		if (size.equals("small")) {
			height = 60;

		} else if (size.equals("medium")) {

			height = 120;
		}

		else if (size.equals("large")) {
			height = 250;
		}
		if (color.equals("red")) {
			Tortoise.setPenColor(Color.red);
		} else if (color.equals("pink")) {
			Tortoise.setPenColor(Color.pink);
		} else if (color.equals("blue")) {
			Tortoise.setPenColor(Color.blue);
		}

		Tortoise.move(height);
		Tortoise.turn(90);
		Tortoise.move(25);
		Tortoise.turn(90);
		Tortoise.move(height);
		Tortoise.turn(-90);
		Tortoise.setPenColor(Color.green);
		Tortoise.move(25);
		Tortoise.turn(-90);

	}

}
