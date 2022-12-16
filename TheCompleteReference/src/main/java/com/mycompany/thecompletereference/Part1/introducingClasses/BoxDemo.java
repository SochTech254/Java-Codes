package introducingClasses;
/*
 * A program that uses the Box class.
 * call this file "BoxDemo.java"
 */
class Box{
	double length;
	double width;
	double depth;
}

// This class declares an object of type Box.
class BoxDemo {

	public static void main(String[] args) {
		Box mybox = new Box();
		double vol;
		
		// assign values to mybox's instance variables
		mybox.length = 20;
		mybox.width = 15;
		mybox.depth = 10;
		
		// compute volume of box
		vol = mybox.length * mybox.width * mybox.depth;
		
		System.out.println("Volume is " + vol);

	}

}
