package areaRunTimePolymorphism;

// Using run-time polymorphism.
abstract class Figure implements Area{
    final double dim1;
    final double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    public abstract double area();
}
