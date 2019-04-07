import java.awt.event.*;


public class Controller implements MouseMotionListener,MouseListener{
	// if i update this it updates that
	private Model model;
	private EatingModel eModel;
	private MigratingModel mModel;
	private BreedingModel bModel;
	private View view;
	
	public Controller(){
		view = new View();
		view.addControllerToMouse(this);
		int frameWidth = view.getFrameWidth();
		int frameHeight = view.getFrameHeight();
				
		eModel = new EatingModel(frameWidth, frameHeight);
		mModel = new MigratingModel(frameWidth, frameHeight);
		bModel = new BreedingModel(frameWidth, frameHeight);
		
		//can switch models later
		model = eModel;
		

		
	}

	//handles ticking: update model, update view 
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