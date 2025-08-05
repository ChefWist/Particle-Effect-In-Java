package main;

import java.awt.*;
import particle.*;

public class ParticleHandler {
	
	public ParticleEffect effect1;
	
	public ParticleHandler() {
		
		effect1 = getEffect1();
		
	}
	
	public void start() {
		effect1.start();
	}
	
	public ParticleEffect getEffect1() {
		
		ParticleEffect effect;
		
		effect = new ParticleEffect(
			Color.green,
			375, 225, 
			50, 50
		);
		effect.setUpGravity( // Velocity : Gravity
			0, 0, // Vel X
			-5, 1, // Vel Y
			1 // Resistence
		);
		effect.setUpTimer(0.6);
			
		effect.fadeSpeed = 7;
		
		return effect;
		
	}
	
	public void update() {
		
		effect1.update();
		
	}
	
	public void draw(Graphics2D g) {

		effect1.draw(g);
		
	}
	
}
