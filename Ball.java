import edu.princeton.cs.algs4.*;

public class Ball {

	//instance variables
	private final int type;
	private final double radius;
	private final double x;
	private double speed;
	private double y;

	public Ball(){

		this.type = StdRandom.uniform(1, 6);
		this.radius = (double)(type)/85;

		this.speed = (double)(type) * 0.002;
		this.x = StdRandom.uniform(this.radius, 1.0 - this.radius);
		this.y = 1.0 - this.radius;

	}

	public void move() {
	  // Change the y-coordinate of the ball, according to its speed.
		this.y -= this.speed;
		if((this.y + this.radius)>=1.0){
			changeDirection();
		}
	}

	public void draw() {
	  // Draws the ball on the StdDraw window, based on its coordinates.
		switch(this.type){
			case 1: StdDraw.setPenColor(StdDraw.RED);
					break;
			case 2: StdDraw.setPenColor(StdDraw.ORANGE);
					break;
			case 3: StdDraw.setPenColor(StdDraw.YELLOW);
					break;
			case 4: StdDraw.setPenColor(StdDraw.GREEN);
					break;
			case 5: StdDraw.setPenColor(StdDraw.BLUE);
		}

		StdDraw.filledCircle(this.x, this.y, this.radius);

	}

	public void changeDirection() {
	  // Toggles the speed between positive and negative
		this.speed = - this.speed;
	}

	public boolean atBottom(double paddleHeight) {
	  // Returns true if the bottom of the ball is
	  // less than or equal to the top of the paddle.
		if(paddleHeight >=(this.y - this.radius)){
			return true;
		}
		return false;
	}

	public boolean isWithin(double leftEdge, double rightEdge) {
	  // Returns true if the bottom of the ball is within
	  // the two given x-coordinates.
		if(rightEdge >= this.x && this.x >= leftEdge){
			return true;
		}
		return false;
	}

}