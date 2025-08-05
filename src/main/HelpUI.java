package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.event.*;

public class HelpUI implements KeyListener {
	
	public boolean started = false;
	GamePanel gp;
	
	public HelpUI() {
		
		this.gp = Main.gp;
		
	}
	
	public void keyTyped(KeyEvent e) {
	}
	public void keyPressed(KeyEvent e) {
		
		if (started) {
			gp.reset();
			return;
		}
		started = true;
		gp.particleH.start();
		
	}
	public void keyReleased(KeyEvent e) {
	}
	
	public void draw(Graphics2D g) {
	
		if (started) return;
		g.setFont(new Font("sans_serif", Font.BOLD, 60));
		g.setColor(Color.white);
		g.drawString("Press any key to begin", 80, 200+60);
		
	}
	
}
