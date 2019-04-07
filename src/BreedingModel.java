import java.util.List;

class BreedingModel extends Model{
	
	BreedingModel(int w, int h) {
		super(w, h);
	}
	
	BreedingBird bird;
	List<Predator> predators;
	Nest nest;
	
	void update() {}
	void updateCollision() {}
	boolean endGame() {return false;}
		
	//checks when to create pop-up quiz
	boolean isQuizTime() {return false;}
	
	//
	void generatePredators() {}
	void updatePredatorCollision() {}
	
}