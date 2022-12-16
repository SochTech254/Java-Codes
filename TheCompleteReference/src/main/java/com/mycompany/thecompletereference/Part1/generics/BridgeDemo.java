package generics;

// A situation that creates a bridge method.
class Gen9<T> {
    T ob;   // declare an object of type T

    // Pass the constructor a reference to
    // an object of type T.
    Gen9(T o) {
        ob = o;
    }

    // Return ob.
    T getob() {
        return ob;
    }
}

// A subclass of Gen9
class Gen10 extends Gen9<String> {
    Gen10(String o) {
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
        // Create a Gen10 object for Strings.
        Gen10 strOb10 = new Gen10("Generics Test");

        System.out.println(strOb10.getob());
    }
}
