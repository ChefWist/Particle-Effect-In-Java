package particle;

import java.awt.*;

public class ParticleEffect extends SuperParticle {
	
	public ParticleEffect(Color color, int x, int y, int width, int height){
		
		this.color = color;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		
	}
	
	public void update() {

		if (!running) return;
		
		tick++;
		if (tick > 60 * 5000) tick = 0;
		
		updateTimer();
		updateVelocity();
		updateFade();
		
	}
	
	public void draw(Graphics2D g) {
		
		if (!drawing) return;
		circleRender(g);
		
	}

}
