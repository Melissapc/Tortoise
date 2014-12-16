import javax.swing.JOptionPane;

import java.util.Random;
// Copyright Wintriss Technical Schools 2013
public class highlowgame {

	public static void main(String[] args) {
		// 2. Randomly select a number between 1 - 100. Print it out to test.
		 int m=new Random().nextInt(100);
		System.out.println(m);
		
		// 10. do the following 10 times
		for (int i = 0; i < 10; i++) {
			
		
		
			// 1. ask for a guess using a pop-up window , and save it 
		String guess=JOptionPane.showInputDialog("guess?");

			// 3. convert the usersÕ answer to an int
		int  p=Integer.parseInt(guess);
		
			
			// 4. if the guess is correct
            if(p==m) {
			JOptionPane.showMessageDialog(null,"guess is correct");
		break;
		}
		
	              // 5. win
		
			// 6. if the guess is high
		else if(p>m)
			JOptionPane.showMessageDialog(null,"guess is too high");
		
				// 7. tell them it's too high
			// 8. if the guess is low
		else if(p<m)
			JOptionPane.showMessageDialog(null,"guess is too low");
				// 9. tell them it's too low
		else
		// 11. lose
		JOptionPane.showMessageDialog(null,"you lose");
	}
	}

}


