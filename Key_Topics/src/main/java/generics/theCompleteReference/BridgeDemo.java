package generics;

// A situation that creates a bridge method.
class Gen8<T> {
    T ob;   // declare an object of type T

    // Pass the constructor a reference to
    // an object of type T.
    Gen8(T o) {
        ob = o;
    }

    // Return ob.
    T getob() {
        return ob;
    }
}

// A subclass of Gen8.
class Gen9 extends Gen8<String> {

    Gen9(String o) {
        super(o);
    }

    // A String-specific override of getob().
    String getob() {
        System.out.print("You called String getob(): ");
        return ob;
    }
}

// Demonstrate a situation that requires a bridge method.
class BridgeDemo {
    public static void main(String[] args) {

        // Create a Gen9 object for Strings.
        Gen9 strOb2 = new Gen9("Generics Test");

        System.out.println(strOb2.getob());
    }
}
