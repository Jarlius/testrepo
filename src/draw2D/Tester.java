package draw2D;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 * Swing verkar vara bättre än AWT
 * 
 * @author jarl
 *
 */
public class Tester {

	private JFrame frame;
	private JPanel panel;
	private Graphics2D graphic;
	private Image image;
	
	public static void main(String args[]) {
		new Tester();
	}
	
	public Tester() {
		frame = new JFrame();
		panel = new JPanel();
		frame.setContentPane(panel);
		frame.setTitle("bagool");
		panel.setPreferredSize(new Dimension(100, 100));
		frame.pack();
		frame.setVisible(true);
		//setVisible(true);
	}
	
	/**
     * Set the canvas visibility and brings canvas to the front of screen
     * when made visible. This method can also be used to bring an already
     * visible canvas to the front of other windows.
     * @param visible  boolean value representing the desired visibility of
     * the canvas (true or false) 
     */
    public void setVisible(boolean visible)
    {
        if(graphic == null) {
            // first time: instantiate the offscreen image and fill it with
            // the background color
            Dimension size = panel.getSize();
            image = panel.createImage(size.width, size.height);
            graphic = (Graphics2D)image.getGraphics();
            graphic.setColor(Color.WHITE);
            graphic.fillRect(0, 0, size.width, size.height);
            graphic.setColor(Color.black);
        }
        frame.setVisible(true);
    }
	
}
