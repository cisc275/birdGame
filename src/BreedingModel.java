
class BreedingModel extends Model{
	
	Breedingbird bird;
	List<Predator> predators;
	Nest nest;
	
	void update() {}
	void updateScore() {}
	void updateCollision() {}
	boolean endGame() {return false;}
		
	boolean isQuizTime() {return false;}
	void generatePredators() {}
	
}