
public class Square implements Shape{
	private int SquareZ;
	
	public Square() {
		this.SquareZ=0;
	}
	public Square(int SquareZ) {
		this.SquareZ = SquareZ;
	}
	public String toString() {
		return "Square: x="+SquareZ;
	}
	public int getZ() {
		return SquareZ;
	}
	public void setZ(int SquareZ) {
		this.SquareZ = SquareZ;
	}
	public int area() {
		return SquareZ*SquareZ;
	}	
	public int circum() {
		return 4*SquareZ; 
	}
}
