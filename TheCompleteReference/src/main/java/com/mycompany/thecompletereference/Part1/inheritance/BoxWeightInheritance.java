package inheritance;

// This program uses inheritance to extend Box.
class Box {
	double length;
	double width;
	double depth;
	
	// construct clone of an object
	Box(Box ob) { // pass object to constructor
		length = ob.length;
		width = ob.width;
		depth = ob.depth;
	}
	
	// constructor used when all dimensions specified
	Box(double l, double w, double d) {
		length = l;
		width = w;
		depth = d;
	}
	
	// constructor used when no dimensions specified
	Box() {
		length = -1;	// use -1 to indicate
		width = -1;		// an uninitialized
		depth = -1;		// box
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

// Here, Box is extended to include weight.
class BoxWeight extends Box {
	double weight; 	// weight of box
	
	// constructor for BoxWeight
	BoxWeight(double l, double w, double d, double m) {
		length = l;
		width = w;
		depth = d;
		weight = m;
	}
}
class BoxWeightInheritance {

	public static void main(String[] args) {
		BoxWeight mybox1 = new BoxWeight(20, 15, 10, 34.3);
		BoxWeight mybox2 = new BoxWeight(4, 3, 2, 0.076);
		double vol;
		
		vol = mybox1.volume();
		System.out.println("Volume of mybox1 is " + vol);
		System.out.println("Weight of mybox1 is " + mybox1.weight);
		System.out.println();
		
		vol = mybox2.volume();
		System.out.println("Volume of mybox2 is " + vol);
		System.out.println("Weight of mybox2 is " + mybox2.weight);

	}

}
