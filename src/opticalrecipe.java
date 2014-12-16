// Copyright Wintriss Technical Schools 2013
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class opticalrecipe extends MouseAdapter {

/* We’re going to make a slideshow of cool optical illusions. */

	// 1. Make a Frame variable and initialize it using "new Frame()"
    Frame me = new Frame();
	private void makeAlbum() {
		// 2. Make the frame visible
		me.setVisible(true);
		// 3. Set the size of the frame
		me.setSize(500,800);
		// 4. find 2 images and save them to your disk
		// 5. make a variable. make it hold the location of your image. e.g. “/Users/illusion.jpg”
		String f = "/Users/melissa/Desktop/images-1.jpg";
		// 6. create a variable of type "JLabel" but don’t initialize it
		 JLabel j; 
		// 7. use the "loadImage()" method below to initialize your JLabel
		 j = loadImage(f);
		// 8. add the JLabel to the frame
		 me.add(j);
		// 9. call the pack() method on the frame
		 me.pack();
		// 10. add a mouse listener (“this”) to your frame	
		 me.addMouseListener(this);
		 
	}

	public void mousePressed(MouseEvent e) {
		// 11. Print to the console when the mouse is pressed
		System.out.println("meow");
		// 12. remove everything from the frame (the image will not disappear until step 14)
		me.removeAll();
		// 13. load a new image like before (this is more than one line of code)
		String n = "/Users/melissa/Desktop/images.jpg";
		JLabel j =loadImage(n);
		me.add(j);
		// 14. pack the frame
		me.pack();
		JOptionPane.showMessageDialog(null,"what do you call a nosy pepper");
		JOptionPane.showMessageDialog(null,"jalapeno bussines");
		JOptionPane.showMessageDialog(null,"what do you call a iterrupting spagetti");
		JOptionPane.showMessageDialog(null,"an impasta!");
	}
	
	// [OPTIONAL] 15. goad your users with some annoying or witty pop-ups
	
	// [ADVANCED] 16. Store the images in an ArrayList and pick a random one each time the mouse is pressed

	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel image = new JLabel(icon);
		return image;
	}

	public static void main(String[] args) throws Exception {
		new opticalrecipe().makeAlbum();
	}
}


