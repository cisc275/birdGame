import java.io.*;
import javax.imageio.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseMotionListener;
import java.awt.image.*;




class View extends JPanel{
	JFrame frame;
	int frameHeight;
	int frameWidth;
	BufferedImage bird;
	

	void buildFrame() {}
	public void paint(Graphics g) {}
	void addControllerToMouse(MouseMotionListener m) {}
	void update(EatingBird b, List food) {}
	void update(MigratingBird b, List enemies, List gusts) {}
	void update(BreedingBird b, List predators, Nest n) {}
	JPanel generateQuiz() {
		JPanel panel = new JPanel();
		return panel;
	}
	void displayScore(int eScore, int mScore, int bScore) {}
	
	
	public void addControllerToKeyboard(Controller controller) {
		// TODO Auto-generated method stub
	}
	public void addControllerToButton(Controller controller) {
		// TODO Auto-generated method stub
		
	}
	
	
}