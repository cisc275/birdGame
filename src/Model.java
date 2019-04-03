


abstract class Model{
	int score;
	int frameHeight;
	int frameWidth;
	

	abstract void update();
	abstract void updateScore();
	abstract void updateCollision();
	abstract boolean endGame();
	
	
	
}