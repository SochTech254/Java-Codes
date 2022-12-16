package closerLookAtMethodsAndClasses;

// Here, Box allows one object to initialize another.
class Box1 {
	double length;
	double width;
	double depth;
	
	// Notice this constructor. It takes an object of type Box.
	Box1(Box1 ob) { // pass object to constructor
		length = ob.length;
		width = ob.width;
		depth = ob.depth;
	}
	
	// constructor used when all dimensions specified
	Box1(double l, double w, double d) {
		length = l;
		width = w;
		depth = d;
	}
	
	// constructor used when no dimensions specified
	Box1() {
		length = -1;	// use -1 to indicate
		width = -1;		// an uninitialized
		depth = -1;		// box
	}
	
	// constructor used when cube is created
	Box1(double len) {
		length = width = depth = len;
	}
	
	// compute and return volume
	double volume() {
		return length * width * depth;
	}
}
class OverloadConstructorWithObject {

	public static void main(String[] args) {
		// create boxes using the various constructors
		Box1 mybox1 = new Box1(20, 15, 10);
		Box1 mybox2 = new Box1();
		Box1 mycube = new Box1(7);
		
		Box1 myclone = new Box1(mybox1); // create copy of mybox1
		
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
		
		// get volume of clone
		vol = myclone.volume();
		System.out.println("Volume of myclone is " + vol);
	}

}
