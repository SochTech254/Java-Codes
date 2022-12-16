package Part2.exploringjavadotlang;

// Override the clone() method.
class TestClone1 implements Cloneable {
    int a;
    double b;

    // clone() is now overridden and is public.
    public Object clone() {
        try {
            // call clone in Object.
            return super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not allowed.");
            return this;
        }
    }
}
public class CloneDemo1 {
    public static void main(String[] args) {
        TestClone1 x1 = new TestClone1();
        TestClone1 x2 = null;

        x1.a = 10;
        x2.b = 20.98;

        // here, clone() is called directly.
        x2 = (TestClone1) x1.clone();

        System.out.println("x1 : " + x1.a + " " + x1.b);
        System.out.println("x2 : " + x2.a + " " + x2.b);
    }
}
