package Abstract.edureka;

interface Shape {
    void draw();
    double area();
}

class Rectangle implements Shape {
    int length, width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle has been drawn.");
    }

    @Override
    public double area() {
        return (double) length * width;
    }
}
class Circle implements Shape {
    double pi = 3.14;
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle has been drawn.");
    }

    @Override
    public double area() {
        return pi * radius * radius;
    }
}
class Area {
    public static void main(String[] args) {
        Shape rect = new Rectangle(20, 10);
        rect.draw();
        System.out.println("Area of Rectangle is : " + rect.area());

        Shape circle = new Circle(21);
        circle.draw();
        System.out.println("Area of circle is : " + circle.area());
    }
}