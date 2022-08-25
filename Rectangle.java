// Rectangle.java Author: Fatma Öztürk ID: 21895770
// e-mail: oztrk21895570@hotmail.com
public class Rectangle implements Shape {
	private int RecX;
	private int RecY;
	
	public Rectangle() {
		this.RecX=0;
		this.RecY=0;
	}
	public Rectangle(int RecX, int RecY) {
		this.RecX = RecX;
		this.RecY=RecY;
	}
	public String toString() {
		return "Rectangle: x="+RecX+ "y="+ RecY;
	}
	public int getX() {
		return RecX;
	}
	public void setX(int RecX) {
		this.RecX = RecX;
	}
	
	public int getY() {
		return RecY;
	}
	public void setY(int RecX) {
		this.RecX = RecX;
	}
	public int area() {
		return RecX*RecY;
	}	
	public int circum() {
		return 2*(RecX+RecY); 
	}
}