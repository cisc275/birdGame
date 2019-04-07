
public abstract class Moveable {
	
	private int x;
	private int y;
	private int radius;
	private int xVelocity;
	private int yVelocity;
	
	Moveable(int xP, int yP, int r, int xV, int yV){
		x = xP;
		y = yP;
		radius = r;
		xVelocity = xV;
		yVelocity = yV;
	}
	
	int getX() {return x;}
	int getY() {return y;}
	int getR() {return radius;}
	int getXV() {return xVelocity;}
	int getYV() {return yVelocity;}
	
	void setLocation(int xP, int yP) {
		x = xP;
		y = yP;
	}
	
	
	//move logic mostly and other updates to Moveable object needed 
	abstract void update();
	
	//logic of how different Moveable objects move
	abstract void move();
	
	void move(int delta) {
		x += xVelocity*delta;
		y += yVelocity*delta;
	}
	
	boolean collidesWith(Moveable m) {
		return false;
	}
	
	boolean exitsFrame(int frameHeight, int frameWidth) {
		return false;
	}

}
