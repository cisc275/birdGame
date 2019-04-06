import java.awt.event.*;


public class Controller implements ActionListener,KeyListener{
	// if i update this it updates that
	private Model model;
	private View view;
	
	public Controller(){
		view = new View();
		//model = new Model();
		view.addControllerToButton(this);
		view.addControllerToKeyboard(this);
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}  