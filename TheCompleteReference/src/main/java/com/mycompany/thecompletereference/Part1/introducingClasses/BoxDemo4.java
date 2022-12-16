package introducingClasses;
// This program uses a parameterized method
class Box4 {
	double length;
	double width;
	double depth;
	
	// compute and return volume
	double volume() {
		return length * width * depth;
	}
	
	// sets dimensions of box
	void setDim(double l, double w, double d) {
		length = l;
		width = w;
		depth = d;
	}
}
class BoxDemo4 {

	public static void main(String[] args) {
		Box4 mybox1 = new Box4();
		Box4 mybox2 = new Box4();
		double vol;
		
		// initialize each box
		mybox1.setDim(20, 15, 10);
		mybox2.setDim(9, 6, 3);
		
		// get volume of fist box
		vol = mybox1.volume();
		System.out.println("Volume is " + vol);
		
		// get volume of second box
		vol = mybox2.volume();
		System.out.println("Volume is " + vol);
		

	}

}
