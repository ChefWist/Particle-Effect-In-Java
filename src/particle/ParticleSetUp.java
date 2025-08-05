package particle;

public class ParticleSetUp extends ParticleVariables {
	
	public void setUpGravity(
		double velocityX, double gravityX,
		double velocityY, double gravityY,
		double resistence
	) {
			
		this.velocityX = velocityX;
		this.gravityX = gravityX;
		this.velocityY = velocityY;
		this.gravityY = gravityY;
		this.resistence = resistence;
			
	}

	public void setUpTimer(
		double duration
	) {
				
		this.duration = duration;
		this.duration_frames = (long) (duration * FPS);
		starting_from_timer = tick;
			
	}
	
	// Start / Stop
	
	public void start() {
		running = true;
		drawing = true;
	}
		
	public void stop() {
		running = false;
	}
		
	
}
