import java.awt.event.*;


public class Controller implements MouseMotionListener,MouseListener{
	// if i update this it updates that
	private Model model;
	private EatingModel eModel;
	private MigratingModel mModel;
	private BreedingModel bModel;
	private View view;
	
	public Controller(){
		eModel = new EatingModel();
		mModel = new MigratingModel();
		bModel = new BreedingModel();
		
		//can switch models later
		model = eModel;
		
		view = new View();
		view.addControllerToMouse(this);
		
	}


	public void start() {}

	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}