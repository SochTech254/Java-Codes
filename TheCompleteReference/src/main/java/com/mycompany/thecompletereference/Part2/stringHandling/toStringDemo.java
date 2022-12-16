package Part2.stringHandling;

// Override toString() for Box class.
/*
Box's toString() method is automatically invoked when a Box
object is used in a concatenation expression or in a call to
println()
 */
class Box {
    double length;
    double width;
    double depth;

    Box(double l, double w, double d) {
        length = l;
        width = w;
        depth = d;
    }

    public String toString() {
        return "Dimensions are " + length + " by " + width +
                " by " + depth + ".";
    }
}
class toStringDemo {
    public static void main(String[] args) {
        Box b = new Box(14, 12, 10);
        String s = "Box b : " + b;  // concatenate Box object

        System.out.println(b);  // convert Box to string
        System.out.println(s);
    }
}
