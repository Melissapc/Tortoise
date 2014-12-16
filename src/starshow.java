


// Copyright Wintriss Technical Schools 2013
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class starshow {

	public static void main(String[] args) {
		Tortoise.show();
		// 13. Set the speed to 8
		Tortoise.setSpeed(8);
		
		
		// 5. Make a variable to hold the X position of the Tortoise and set it to 10
		int x=10;
		
		// 6. Make a variable to hold the Y position of the Tortoise and set it to 440
		int y=440;
		
		// 7. Make a variable to hold the star size and set it to 15
		int star=15;
		
		// 11. Repeat steps 8 through 17, 30 times
		for (int i = 0; i < 30; i++) {
			
		
		
			// 9. Set the X position of the Tortoise to your variable
		Tortoise.setX(x);
			
			// 10. Set the Y position of the Tortoise to your variable
		Tortoise.setY(y);
			
			// 17. Set the pen color to random
		Tortoise.setPenColor(Colors.getRandomColor());
			
			// 8. Call the drawStar() method with your star size variable
		drawStar(star);
			
			// 12. increase the X position by star size
		x=x+star;
			
			// 14. decrease the Y position by star size
		y=y-star;
			
			// 15. increase the star size by 8
		star=star+8;
			
			// 16. Turn the Tortoise 10 degrees
		Tortoise.turn(10);
		
		}
	}

	private static void drawStar(int length) {
		// 3. Repeat those 2 commands 5 times
		for (int i = 0; i < 5; i++) {
			
		
	
			// 1. Move the Tortoise the distance of the starSize parameter
		Tortoise.move(length);
		
			// 2. Turn the Tortoise 144 degrees
		Tortoise.turn(144);
    }
	}
}



