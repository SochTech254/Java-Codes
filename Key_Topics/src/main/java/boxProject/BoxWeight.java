package boxProject;

// Here, Box is extended to include weight
// BoxWeight uses super to initialize its Box attributes
class BoxWeight extends Box {
    double weight;      // weight of box

    // construct clone of an object
    BoxWeight(BoxWeight ob) { // pass object to constructor
        super(ob);
        weight = ob.weight;
    }

    // constructor for BoxWeight
    // Initialize length, width and depth using super()
    BoxWeight(double l, double w, double d, double m) {
        super(l, w, d);     // call superclass constructor
        weight = m;
    }

    // default constructor
    BoxWeight() {
        super();
        weight = -1;
    }

    // constructor used when cube is created
    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }
}
