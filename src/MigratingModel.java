import java.util.List;

class MigratingModel extends Model{
	
	MigratingModel(int w, int h) {
		super(w, h);
	}
	
	MigratingBird bird;
	List<Enemy> enemies;
	List <Gust> gusts;
	
	//also update score based on time completion
	void update() {}
	void updateCollision() {}
	boolean endGame() {return false;}
	
	//adds new Moveable objects when they disappear or at time intervals
	void generateEnemies() {}
	void generateGusts() {}
	
	//if bird collides with Moveable, update lists and bird
	void updateEnemyCollision() {}
	void updateGustCollision() {}
	
}