// Copyright Wintriss Technical Schools 2013
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class pentagoncrazy
{
 public static void main(String[] args)
 {
   new pentagoncrazy().makePrettyThings();
 }
 
 private void makePrettyThings()
 {
     // 5. make the tortoise go at maximum speed
	 Tortoise.setSpeed(10);

     // 8. choose a color that you like for the shape
	 Tortoise.setPenColor(Colors.getRandomColor());
   
     // 2. make a variable for the number of sides you want (can’t test this one)\
	 int sides=5;
	 
 
     // 4. do everything below 200 times
	 for (int i = 0; i < 200; i++) {
		
	
   
     	// 1. move the tortoise 100 pixels
	Tortoise.move(i);
    
     	// 6. make the tortoise move "i" pixels instead of 100 (don’t need new line of code for this, just change previous one)
	
   	 
     	// 3. turn the tortoise 360 degrees divided by the number of sides
	Tortoise.turn(360/5);
    	 
     	// 7. turn the tortoise one more degree
	Tortoise.turn(361);
    

 }

 {
	// TODO Auto-generated method stub
	
}
 //Variations:
 //  *8. make the pattern really huge
 //  	change the color of the pattern
 //  *9. create a method called, "adjustPen()"
 //    	make the pen get increasingly bigger
 //      	stop the pen getting too big (less than 4)
 //  *10. choose 5 colors and change them every time adjustPen() is called
 //  *11. experiment with different shapes
 }
}

