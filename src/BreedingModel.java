import java.util.List;

class BreedingModel extends Model{
	
	BreedingBird bird;
	List<Predator> predators;
	Nest nest;
	
	void update() {}
	void updateScore() {}
	void updateCollision() {}
	boolean endGame() {return false;}
		
	boolean isQuizTime() {return false;}
	void generatePredators() {}
	
}