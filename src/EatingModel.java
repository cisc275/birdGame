import java.util.List;

class EatingModel extends Model{
	
	EatingModel(int w, int h) {
		super(w, h);
	}
	EatingBird bird;
	List<Food> food;
	
	void update() {}
	void updateCollision() {}
	boolean endGame() {return false;}
	
	boolean foodEaten() {
		return false;
	}
	
	//for randomly generating food
	void generateFood() {}
	
	//if bird collides with food, update list, bird, and score
	void updateFoodCollision() {}
	
	
	
	
	
}