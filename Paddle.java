import edu.princeton.cs.algs4.*;

public class Paddle {

	private final double height;
	private final double width;
	private final double y;
	private double x;

	public Paddle(double height, double width){
		this.height = height;
		this.width = width;
		this.y = height/2.0;
		this.x = 0.5;
	}

	public void move() {
	  // Position the paddle so that it is centered
	  // at the current x-coordinate of the mouse.
		this.x = StdDraw.mouseX();
		if((this.x - this.width/2.0)<0){
			this.x = this.width/2.0;
		}
		else if((this.x + this.width/2.0)>1){
			this.x = 1.0 - this.width/2.0;
		}
	}
	public void draw() {
	  // Draw the paddle at its current position.
		StdDraw.setPenColor(StdDraw.ORANGE);
		StdDraw.filledRectangle(this.x, this.y, this.width/2.0, this.height/2);
	}
	public double leftEdge() {
	  // Return the x-coordinate of the left edge of the paddle.
		return this.x - this.width/2.0;
	}
	public double rightEdge() {
	  // Return the x-coordinate of the right edge of the paddle.
		return this.x + this.width/2.0;
	}
	
}