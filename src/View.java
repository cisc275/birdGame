import java.io.*;
import javax.imageio.*;
import javax.swing.*;
import java.awt.*;
import java.awt.image.*;




class View extends JPanel{
	JFrame frame;
	int frameHeight;
	int frameWidth;
	BufferedImage bird;
	

	void buildFrame() {}
	public void paint(Graphics g) {}
	void addControllerToMouse(MouseMotionListener m) {}
	void update(EatingBird b, List<Food> f) {}
	void update(MigratingBird b, List<Enemy> e, List<Gust> g) {}
	void update(BreedingBird b, List<Predator> p, Nest n) {}
	JPanel generateQuiz() {
		JPanel panel = new JPanel();
		return panel;
	}
	void displayScore(int eScore, int mScore, int bScore) {}
	
	
}