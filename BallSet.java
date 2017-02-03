import edu.princeton.cs.algs4.*;

public class BallSet{

	private int num;
	private Ball[] balls;

	public BallSet(int num){

		this.num = num;
		this.balls = new Ball[num];

		for(int i = 0; i < this.num; i++){
			Ball newBall = new Ball();
			balls[i] = newBall;
		}

	}

	public int numBalls() {
	  // Returns the current number of balls.
		return this.num;
	}
	public Ball get(int n) {
	  // Returns the nth ball in the set.
		return this.balls[n];
	}
	public void addBall() {
	  // Adds a new ball to the set. If there are already 10
	  // balls in the set, then the method does nothing.
		if(this.num < 10){

			this.num++;
			Ball[] tempBalls = new Ball[this.num];

			for(int i = 0; i < this.num - 1; i++){
				tempBalls[i] = this.balls[i];
			}

			Ball newBall = new Ball();
			tempBalls[this.num-1] = newBall;

			this.balls = tempBalls;

		}
		

	}
	public void delete(int n) {
	  // Deletes the nth ball in the set by moving the
	  // last ball of the array into slot n of the array.

		this.num--;
		Ball[] tempBalls = new Ball[this.num];

		for(int i = 0; i < n; i++){
			tempBalls[i] = this.balls[i];
		}

		for(int i = n+1; i < this.num + 1; i++){
			tempBalls[i-1] = this.balls[i];
		}

		this.balls = tempBalls;

	}

}