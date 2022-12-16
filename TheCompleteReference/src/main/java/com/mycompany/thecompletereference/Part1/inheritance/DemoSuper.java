package inheritance;

// A complete implementation  of BoxWeight.
class Box1 {
	private double length;
	private double width;
	private double depth;
	
	// construct clone of an object
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
// BoxWeight now fully implements all constructors
class BoxWeight1 extends Box1 {
	double weight;		// weight of box
	
	// constructor clone of an object
	BoxWeight1(BoxWeight1 ob) { // pass object to constructor
		super(ob);
		weight = ob.weight;
	}
	
	// constructor when all parameters are specified
	BoxWeight1(double l, double w, double d, double m) {
		super(l, w, d); 	// call superclass constructor
		weight = m;
	}
	
	// default constructor
	BoxWeight1() {
		super();
		weight = -1;
	}
	
	// constructor used when cube is created
	BoxWeight1(double len, double m) {
		super(len);
		weight = m;
	}
}
class DemoSuper {

	public static void main(String[] args) {
		BoxWeight1 mybox1 = new BoxWeight1(20, 15, 10, 34.3);
		BoxWeight1 mybox2 = new BoxWeight1(4, 3, 2, 0.076);
		BoxWeight1 mybox3 = new BoxWeight1();	// default
		BoxWeight1 mycube = new BoxWeight1(3, 2);
		BoxWeight1 myclone = new BoxWeight1(mybox1);
		double vol;
		
		vol = mybox1.volume();
		System.out.println("Volume of mybox1 is " + vol);
		System.out.println("Weight of mybox1 is " + mybox1.weight);
		System.out.println("");
		
		vol = mybox2.volume();
		System.out.println("Volume of mybox2 is " + vol);
		System.out.println("Weight of mybox2 is " + mybox2.weight);
		System.out.println("");
		
		vol = mybox3.volume();
		System.out.println("Volume of mybox3 is " + vol);
		System.out.println("Weight of mybox3 is " + mybox3.weight);
		System.out.println("");
		
		vol = myclone.volume();
		System.out.println("Volume of myclone is " + vol);
		System.out.println("Weight of myclone is " + myclone.weight);
		System.out.println("");
		
		vol = mycube.volume();
		System.out.println("Volume of mycube is " + vol);
		System.out.println("Weight of mycube is " + mycube.weight);
		System.out.println("");

	}

}
