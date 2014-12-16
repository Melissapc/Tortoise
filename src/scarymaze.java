import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Robot;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/* A basic version of Aaron's scary ma// Copyright Wintriss Technical Schools 2013
import java.applet.AudioClip;
import java.awt.Dimension;
ze game.
 * http://buildsomethingawesome.org/blog/2012/10/27/scary-maze-game/ */

public class scarymaze extends JPanel implements Runnable, MouseMotionListener, MouseListener {
	
	BufferedImage maze;
	final int frameWidth = 800;
	final int frameHeight = 600;

	scarymaze() throws Exception {
		//1. make a maze image, put it with your Java class http://pixlr.com/editor/
		maze = ImageIO.read(getClass().getResource("scarymaze.png"));
		//2. set the mouse pointer to the start of your maze using:
// new Robot().mouseMove(xPosition, yPosition)
		new Robot().mouseMove(200,500);
		//3. add a mouse motion listener
		addMouseMotionListener(this);
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		int mouseX = e.getX();
		int mouseY = e.getY();
		int mouseColor = maze.getRGB(mouseX, mouseY);
		char[] black = null;
		//4. print the mouse color variable to see what color the mouse is touching
		System.out.println(mouseColor);
		//5. make a variable to hold the background color. (this is the color the mouse is touching they are outside the lines.)
         int  backgroundmaze=-1;
		//6. if the mouse is touching the background color
        if(mouseColor==backgroundmaze)
        	  scare();
				// call the scare method
    
	}

	private void scare() {
		System.out.println("BOO!");
		//7. find a scary sound and put it in your resources folder
		
		
		AudioClip sound = JApplet.newAudioClip(getClass().getResource("halloween.aiff"));
		//8. play the scary sound
		sound.play();
		
		//9. use the showScaryImage method to scare your victim!
		showScaryImage("images2.jpg"); 

	}

	private void showScaryImage(String imageName) {
		try {
			maze = ImageIO.read(getClass().getResource(imageName));
		} catch (Exception e) {
			System.err.println("Couldn't find this image: " + imageName);
		}
		repaint();
	}

	public static void main(String[] args) throws Exception {
		SwingUtilities.invokeLater(new scarymaze());
	}

	@Override
	public void run() {
		JFrame frame = new JFrame("Melissa's Scary Maze");
		frame.add(this);
		setPreferredSize(new Dimension(frameWidth, frameHeight));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(maze, 0, 0, null);
	}

	@Override
	public void mouseDragged(MouseEvent e) {


		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}

