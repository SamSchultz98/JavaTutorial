package geometricShapes;

public class Quad {

	private int side1;
	private int side2;
	private int side3;
	private int side4;
	
	public int Perimeter() {
		return getSide1() + getSide2() + getSide3() + getSide4();		//Use the get to obtain the data of each side
	}
	
	public Quad(int s1, int s2, int s3, int s4) {
		setSide1(s1);
		setSide2(s2);
		setSide3(s3);
		setSide4(s4);
	}
	
	
	public int getSide1() {
		return side1;
	}
	public void setSide1(int length) {			//TODO You could add a new exception of if length is below 0 
		this.side1 = length;
	}
	public int getSide2() {
		return side2;
	}
	public void setSide2(int length) {
		this.side2 = length;
	}
	public int getSide3() {
		return side3;
	}
	public void setSide3(int length) {
		this.side3 = length;
	}
	public int getSide4() {
		return side4;
	}
	public void setSide4(int length) {
		this.side4 = length;
	}
	
}
