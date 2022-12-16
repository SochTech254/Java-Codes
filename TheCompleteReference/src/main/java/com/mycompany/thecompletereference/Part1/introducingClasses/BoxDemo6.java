package introducingClasses;
/*Here, Box uses a parameterized constructor to
 * initialize the dimensions of a box
 */
class Box6 {
	double length;
	double width;
	double depth;
	
	// This is the constructor for Box
	Box6(double l, double w, double d) {
		length = l;
		width = w;
		depth = d;
	}
	
	// compute and return volume
	double volume() {
		return length * width * depth; 
	}
}
class BoxDemo6 {

	public static void main(String[] args) {
		// declare, allocate, and initialize Box objects
		Box6 mybox1 = new Box6(20, 15, 10);
		Box6 mybox2 = new Box6(9, 6, 3);
		double vol;
		
		// get volume of first box
		vol = mybox1.volume();
		System.out.println("Volume is " + vol);
		
		// get volume of second box
		vol = mybox2.volume();
		System.out.println("Volume is " + vol);
		

	}

}
