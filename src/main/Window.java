package main;

import javax.swing.JFrame;

public class Window extends JFrame {
	
	public Window(String title, int width, int height, int x, int y) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(width, height);
		if(x >= 0 && y >= 0) {
			setLocation(x, y);
		} else setLocationRelativeTo(null);
		setTitle(title);
		
	}
	public Window(String title, int width, int height) {
		this(title, width, height, -1, -1);
	}
	public Window(String title) {
		this(title, 350, 350);
	}
	public Window() {
		this("Untitled");
	}
}
