package particle;

import java.awt.*;

public class ParticleVariables {
	
	public static int FPS = 60;
	
	// Velocity Particle
	public double velocityY = 0;
	public double velocityX = 0;
	public double gravityX = 0;
	public double gravityY = 0;
	public double resistence = 1;
	
	// Timer Particle
	public double duration = 10000000;
	public long duration_frames = 10000000;
	public long starting_from_timer = 0;
	
	// Effect Particles
	public int fadeNow = 255;
	public int fadeSpeed = 0;
	
	// Normal Particle
	public int x, y, width, height;
	public Color color;
	public boolean running = false;
	public boolean drawing = false;
	public long tick;
	
}
