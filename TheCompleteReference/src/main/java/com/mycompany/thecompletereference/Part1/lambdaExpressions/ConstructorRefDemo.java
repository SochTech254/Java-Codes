package Part1.lambdaExpressions;

// Demonstrate a Constructor reference.

// MyFunc is a functional interface whose method returns
// a MyClass reference.
interface MyFunc3 {
    MyClass1 func(int n);
}
class MyClass1 {
    private int val;

    // This constructor takes an argument.
    MyClass1(int v) { val = v; }

    // This is the default constructor.
    MyClass1() { val = 0; }

    // ...

    int getVal() { return val; };
}
class ConstructorRefDemo {
    public static void main(String[] args) {
        // Create a reference to the MyClass1 constructor
        // Because func() in MyFunc3 takes an argument, new
        // refers to the parameterized constructor in MyClass1,
        // not the default constructor.
        MyFunc3 myClassCons = MyClass1::new;

        // Create an instance of MyClass via that constructor reference.
        MyClass1 mc = myClassCons.func(100);

        // Use the instance of MyClass just created.
        System.out.println("val in mc is " + mc.getVal());
    }
}
