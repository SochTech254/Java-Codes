package introducingClasses;

// This program declares two Box objects.
class Box1 {
	double length;
	double width;
	double depth;
}
class BoxDemo1 {

	public static void main(String[] args) {
		Box1 mybox1 = new Box1();
		Box1 mybox2 = new Box1();
		double vol;
		
		// assign values to mybox1's instance variables
		mybox1.length = 20;
		mybox1.width = 15;
		mybox1.depth = 10;
		
		// compute volume of first box
		vol = mybox1.length * mybox1.width * mybox1.depth;
		System.out.println("The Volume of mybox1 is : " + vol);
		
		//assign different values to mybox2's instance variables
		mybox2.length = 9;
		mybox2.width = 6;
		mybox2.depth = 3;
		
		// compute volume of second box
		vol = mybox2.length * mybox2.width * mybox2.depth;
		System.out.println("The Volume of mybox2 is " + vol);

	}

}
