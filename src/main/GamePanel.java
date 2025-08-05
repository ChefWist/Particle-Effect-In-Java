package main;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class GamePanel extends JPanel implements Runnable {
	
	// SCREEN SETTINGS 
	public final int screenWidth = 800;
	public final int screenHeight = 500;
	
	public ParticleHandler particleH;
	public HelpUI helpUI;
	Thread gameThread;
	
	public GamePanel() {
		
		setPreferredSize(new Dimension(screenWidth, screenHeight));
		setBackground(Color.black);
		setFocusable(true);
		setDoubleBuffered(true);
		
	}
	
	public void startGameThread() {
		
		gameThread = new Thread(this);
		gameThread.start();
		
	}
	
	public void run() {
		
		double drawInterval = 1000000000/60;
		double nextDrawTime = drawInterval + System.nanoTime();
		double delta = 0;
		double currentTime;
		
		while (gameThread != null) {
			
			currentTime = System.nanoTime();
			delta += (currentTime - nextDrawTime) / drawInterval;
			
			if (delta > 1) {
				update();
				repaint();
				delta--;
				nextDrawTime += drawInterval;
				
			}
			
		}
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		draw(g2);
		g2.dispose();
	}
	
	public void update() {
		
		particleH.update();
		
	}
	
	public void draw(Graphics2D g) {
		
		helpUI.draw(g);
		particleH.draw(g);
		
	}
	
	public void reset() {
		
		particleH = new ParticleHandler();
		removeKeyListener(helpUI);
		helpUI = new HelpUI();
		addKeyListener(helpUI);
		
	}
	
}
