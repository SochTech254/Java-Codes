package inheritance;

// Extend BoxWeight to include Shipping costs.
// Start with Box.
class Box2 {
	private double length;
	private double width;
	private double depth;
	
	// construct clone of an object
	Box2(Box2 ob) { // pass object to constructor
		length = ob.length;
		width = ob.width;
		depth = ob.depth;
	}
	
	// constructor used when all dimensions specified
	Box2(double l, double w, double d) {
		length = l;
		width = w;
		depth = d;
	}
	
	// constructor used when no dimensions specified
	Box2() {
		length = -1;	// use -1 to indicate
		width = -1;		// an uninitialized
		depth = -1;		// box
	}
	
	// constructor used when cube is created
	Box2(double len) {
		length = width = depth = len;
	}
	
	// compute and return volume
	double volume() {
		return length * width * depth;
	}
}

// Add weight
class BoxWeight2 extends Box2 {
	double weight;	// weight of box
	
	// construct clone of an object
	BoxWeight2(BoxWeight2 ob) { // pass object to constructor
		super(ob);
		weight = ob.weight;
	}
	
	// constructor when all parameters are specified
	BoxWeight2(double l, double w, double d, double m) {
		super(l, w, d); 	// call superclass constructor
		weight = m;
	}
	
	// default constructor
	BoxWeight2() {
		super();
		weight = -1;
	}
	
	// constructor used when cube is created
	BoxWeight2(double len, double m) {
		super(len);
		weight = m;
	}
}

// Add shipping costs.
class Shipment extends BoxWeight2 {
	double cost;
	
	// construct clone of an object
	Shipment(Shipment ob) { // pass object to constructor
		super(ob);
		cost = ob.cost;
	}
	
	// constructor when all parameters are specified
	Shipment(double l, double w, double d, double m, double c) {
		super(l, w, d, m);	// call superclass constructor
		cost = c;
	}
	
	// default constructor
	Shipment() {
		super();
		cost = -1;
	}
	
	// constructor used when cube is created
	Shipment(double len, double m, double c) {
		super(len, m);
		cost = c;
	}
}
class MultiLevelHierarchicalInheritance {

	public static void main(String[] args) {
		Shipment shipment1 = new Shipment(20, 15, 10, 10, 3.41);
		Shipment shipment2 = new Shipment(4, 3, 2, 0.076, 1.28);
		double vol;
		
		vol = shipment1.volume();
		System.out.println("Volume of shipment1 is " + vol);
		System.out.println("Weight of shipment1 is " + shipment1.weight);
		System.out.println("Shipping cost : $" + shipment1.cost);
		System.out.println();
		
		vol = shipment2.volume();
		System.out.println("Volume of shipment2 is " + vol);
		System.out.println("Weight of shipment2 is " + shipment2.weight);
		System.out.println("Shipping cost : $" + shipment2.cost);

	}

}
