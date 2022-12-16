package areaRunTimePolymorphism;

class Rectangle extends  Figure{
    Rectangle(double a, double b) {
        super(a, b);
    }

    // override area for rectangle
    public double area() {
        System.out.println("Inside area for Rectangle");
        return dim1 * dim2;
    }
}
