package boxProject;

/*
Here, Box defines three constructors to initialize
the dimensions of a box in various ways
 */
class Box implements BoxVolume{
    private final double length;
    private final double width;
    private final double depth;

    // constructor used when all dimensions specified
    Box(double l, double w, double d) {
        length = l;
        width = w;
        depth = d;
    }
    /*
    The above constructor can also be re-written using the this keyword
    Box(double length, double width, double depth) {
        this.length = length;
        this.width = width;
        this.depth = depth;
    }
     */

    // constructor used when no dimensions specified
    Box() {
        length = -1;    // use -1 to indicate
        width = -1;     // an uninitialized
        depth = -1;    // box
    }

    // constructor used when cube is created
    Box(double len) {
        length = width = depth = len;
    }

    /*
    Here, Box allows one object to initialize another.
    Notice this constructor. It takes an object of type Box.
    Hence, creates clone of an object
     */
    Box(Box ob) { // pass object to costructor
        length = ob.length;
        width = ob.width;
        depth = ob.depth;
    }
    // compute and return volume
    public double volume() {
        return length * width * depth;
    }
}
