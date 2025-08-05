package particle;

import java.awt.*;

public class ParticleDrawer extends ParticleUpdater {
	
	public void defaultRender(Graphics2D g) {
		rectRender(g);
	}
	
	public void rectRender(Graphics2D g) {
		
		g.setColor(getColor());
		g.fillRect(x, y, width, height);
		
	}
	
	public void circleRender(Graphics2D g) {
		
		g.setColor(getColor());
		g.fillArc(x, y, width, height, 0, 360);
		
	}
	
	public Color getColor() {
		return 	new Color(color.getRed(), color.getGreen(), color.getBlue(), fadeNow);
	}
	
}
