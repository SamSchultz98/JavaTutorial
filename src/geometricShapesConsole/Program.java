package geometricShapesConsole;

import geometricShapes.Quad;		//Can put multiple import statements for different classes
import geometricShapes.Sqr;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Quad q1 = new Quad(3,4,5,6);			//Need to put the class after new, could replace first quad with var
		//The numbers in the parameter set the sides because of the constructor in the Quad class
		System.out.println("Perimeter is " + q1.Perimeter());
		
		
		
		Sqr s1 = new Sqr();
		System.out.println("Perimeter of the square is" + s1.Perimeter());
	}

}
