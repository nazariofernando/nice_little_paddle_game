import edu.princeton.cs.algs4.*;

public class ScoreBoard {

	private int level;
	private int hit;
	private int lost;

	public ScoreBoard(){
		this.level = 1;
		this.hit = 0;
		this.lost = 0;
	}

	public void zap() {
	  // Increment the number of balls that have been lost.
		this.lost++;
	}
	public boolean gameOver() {
	  // Return true when the number of lost balls
	  // is at least 5, and false otherwise.
		if(this.lost >= 5){
			return true;
		}

		return false;
	}
	public boolean increment() {
	  // Increment the number of hits. If the number of hits
	  // is at least 3*level, then increase the level and
	  // return true; otherwise return false.
		this.hit++;
		if(this.hit>= 3*this.level){
			this.level++;
			return true;
		}

		return false;

	}
	public void draw(boolean gameover) {
	  // Display the current status of the game on the StdDraw window.
		if(gameover){
			StdDraw.setPenColor(StdDraw.RED);
			StdDraw.text(0.5, 0.5, "Game Over");
		}
		else{
			StdDraw.setPenColor(StdDraw.GREEN);
			StdDraw.text(0.5,0.9, "Level: " + Integer.toString(this.level));
			StdDraw.text(0.5,0.8, "Lives left: " + Integer.toString(5 - this.lost));
		}

	}

}