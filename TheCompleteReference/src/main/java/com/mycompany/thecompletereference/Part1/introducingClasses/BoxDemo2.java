package introducingClasses;

// This program includes a method inside the box class.
class Box2 {
	double length;
	double width;
	double depth;
	
	// display volume of a box
	void volume() {
		System.out.print("Volume is ");
		System.out.println(length * width * depth);
	}
}
class BoxDemo2 {

	public static void main(String[] args) {
		Box2 mybox1 = new Box2();
		Box2 mybox2 = new Box2();
		
		// assign values to mybox1's instance variables
		mybox1.length = 20;
		mybox1.width = 15;
		mybox1.depth = 10;
		
		//assign different values to mybox2's instance variables
		mybox2.length = 9;
		mybox2.width = 6;
		mybox2.depth = 3;
		
		// display volume of first box
		mybox1.volume();
		
		// display volume of second bbox
		mybox2.volume();

	}

}
