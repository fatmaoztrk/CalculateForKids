// Circle.java Author: Fatma Öztürk ID: 21895770
// e-mail: oztrk21895570@hotmail.com
public class Circle implements Shape{ 
	private int radius;
	
	/*public Circle() {
		radius = 0;
	}	*/
	public Circle(int radius) {
		
		this.radius = radius;
	}	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}	
	public String toString() { // Override Object's toString method
		return "Circle: radius="+radius;			 
	}	
	public int area() {
		return PI*radius*radius;
	}	
	public int circum() {
		return 2* PI*radius; 
	}	
}