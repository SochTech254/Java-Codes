package introducingClasses;

// Now, volume() returns the volume of a box.
class Box3 {
	double length;
	double width;
	double depth;
	
	// compute and return volume
	double volume() {
		return length * width * depth;
	}
}
class BoxDemo3 {

	public static void main(String[] args) {
		Box3 mybox1 = new Box3();
		Box3 mybox2 = new Box3();
		double vol;
		
		// assign values to mybox1's instance variables
		mybox1.length = 20;
		mybox1.width = 15;
		mybox1.depth = 10;
				
		//assign different values to mybox2's instance variables
		mybox2.length = 9;
		mybox2.width = 6;
		mybox2.depth = 3;
		
		// get volume of first box
		vol = mybox1.volume();
		System.out.println("Volume is " + vol);
		
		// get volume of second box
		vol = mybox2.volume();
		System.out.println("Volume is " + vol);

	}

}
