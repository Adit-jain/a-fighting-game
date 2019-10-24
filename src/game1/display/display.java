package game1.display;

import java.awt.*;

import javax.swing.*;

public class display {
	
	private static JFrame frame;
	private Canvas canvas;
	private String title;
	private int width,height;
	
	public display(String title, int width,int height)
	{
		this.title = title;
		this.width = width;
		this.height = height;
		  
		createDisplay();
	}

	private void createDisplay()
	{
		frame = new JFrame(title);
		frame.setSize(width,height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setUndecorated(true);
		frame.setVisible(true);
		

		
		
		canvas = new Canvas();
		canvas.setPreferredSize(new Dimension(width,height));
		canvas.setMaximumSize(new Dimension(width,height));
		canvas.setMinimumSize(new Dimension(width,height));
		canvas.setFocusable(false);
		
		frame.add(canvas);
		frame.pack();
	}
	
	public Canvas getCanvas()
	{
		return canvas;
	}
	
	public static JFrame getFrame()
	{
		return frame;
	}
}
