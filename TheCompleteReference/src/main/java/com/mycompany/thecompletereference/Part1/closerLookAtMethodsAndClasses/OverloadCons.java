package Part1.closerLookAtMethodsAndClasses;

/*
 * Here, Box defines three constructors to initialize
 * the dimensions of a box various ways
 */
class Box {
	double length;
	double width;
	double depth;
	
	// constructor used when all dimensions specified
	Box(double l, double w, double d) {
		length = l;
		width = w;
		depth = d;
	}
	
	// constructor used when no dimensions specified
	Box() {
		length = -1;    // use -1 to indicate
		width = -1;     // an uninitialized
		depth = -1;     // box
	}
	
	// constructor used when cube is created
	Box(double len) {
		length = width = depth = len;
	}
	
	// compute and return volume
	double volume() {
		return length * width * depth;
	}
}
class OverloadCons {

	public static void main(String[] args) {
		// create boxes using the various constructors
		Box mybox1 = new Box(20, 15, 10);
		Box mybox2 = new Box();
		Box mycube = new Box(7);
		
		double vol;
		
		// get volume of first box
		vol = mybox1.volume();
		System.out.println("Volume of mybox1 is " + vol);
		
		// get volume of second box
		vol = mybox2.volume();
		System.out.println("Volume of mybox2 is " + vol);
		
		// get volume of cube
		vol = mycube.volume();
		System.out.println("Volume of mycube is " + vol);

	}

}
