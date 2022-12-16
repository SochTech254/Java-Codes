package generics;

// Overriding a generic method in a generic class.
class Gen7<T> {
    T ob;   // declare an object of type T

    // Pass the constructor a reference to
    // an object of type T.
    Gen7(T o) {
        ob = o;
    }

    // Return ob.
    T getob() {
        System.out.print("Gen7's getob(): ");
        return ob;
    }
}

// A subclass of Gen7 that overrides getob().
class Gen8<T> extends Gen7<T> {
    Gen8(T o) {
        super(o);
    }

    // Override getob().
    T getob() {
        System.out.print("Gen8's getob(): ");
        return ob;
    }
}
class MethOverrideDemo {
    public static void main(String[] args) {
        // Create a Gen7 object for Integers.
        Gen7<Integer> iOb = new Gen7<Integer>(88);

        // Create a Gen8 object for Integers
        Gen8<Integer> iOb1 = new Gen8<Integer>(99);

        // Create a Gen8 object for Strings.
        Gen8<String> strOb8 = new Gen8<String>("Generics Test");

        System.out.println(iOb.getob());
        System.out.println(iOb1.getob());
        System.out.println(strOb8.getob());
    }
}
