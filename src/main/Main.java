package main;

import javax.swing.*;

public class Main {

	public static JFrame frame;
	public static GamePanel gp;
	
	public static void main(String[] args) {
		
		// Particle Effects in java
		
		frame = new JFrame("Particle Effects");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		gp = new GamePanel();
		frame.add(gp);
		
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		gp.reset();
		frame.setVisible(true);
		gp.requestFocus();
		gp.startGameThread();
		
	}

}
