
//Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class bananaquizrecipe
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		String bananas=JOptionPane.showInputDialog("do you like to bananas");

		//2. if they say no, 
		if(bananas.contains("no"))
			JOptionPane.showMessageDialog(null,"you are crazy");
			//tell them they are crazy 
			//and end quiz
		//3. if they say yes
		if (bananas.contains("yes")){
			String hobby=JOptionPane.showInputDialog("what is your favorite hobby");
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"
			JOptionPane.showMessageDialog(null,hobby+ " is much better than bananas!");
		}
	}

}
