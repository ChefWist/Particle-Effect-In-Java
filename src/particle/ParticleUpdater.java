package particle;

public class ParticleUpdater extends ParticleSetUp {
	
	public void updateVelocity() {
		
		velocityX += gravityX;
		velocityY += gravityY;
		velocityX *= resistence;
		velocityY *= resistence;
		x += velocityX;
		y += velocityY;
		
	}
	
	public void updateTimer() {
		if (tick > duration_frames) stop();
	}
	
	public void updateFade() {
		
		fadeNow -= fadeSpeed;
		if (fadeNow < 0) fadeNow = 0;
		
	}
	
}
