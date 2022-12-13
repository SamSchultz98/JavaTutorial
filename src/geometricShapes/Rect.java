package geometricShapes;

public class Rect extends Quad {
	
	public int area() {
		return getSide1() * getSide2();
	}

	
	
	
	public Rect(int s1, int s2)  {
		super(s1, s2, s1, s2);			//Super is referring to the parent class. Must be the first statement in the body of the constructor
		
	}
	
	
	
	
	
	
	public Rect() {			//Way to make a default value for a constructor
		this(3,5);			//This sets the sides to 3 and 5
		//this points to the same class just a different constructor
	}

}
