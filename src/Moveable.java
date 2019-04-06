
public abstract class Moveable {
int x;
int y;
int radius;
int xVelocity;
int yVelocity;

void update() {}

void move() {}

boolean collidesWith(Moveable m) {
	return false;
}

boolean exitsFrame(int frameHeight, int frameWidth) {
	return false;
}

}
