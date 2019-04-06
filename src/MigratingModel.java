import java.util.List;

class MigratingModel extends Model{
	
	MigratingBird bird;
	List<Enemy> enemies;
	List <Gust> gusts;
	
	void update() {}
	void updateScore() {}
	void updateCollision() {}
	boolean endGame() {return false;}
	
	void generateEnemies() {}
	void updateEnemyCollision() {}
	void updateGustCollision() {}
	
}