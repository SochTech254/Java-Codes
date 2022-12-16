package generics;

// Use the instanceof operator with a generic class hierarchy.
class Gen5<T> {
    T ob;

    Gen5(T o) {
        ob = o;
    }

    // Return ob.
    T getob() {
        return ob;
    }
}

// subclass of Gen
class Gen6<T> extends Gen5<T> {
    Gen6(T o) {
        super(o);
    }
}

// Demonstrate run-time type ID implications of generic
// class hierarchy
class GenHierDemo2 {
    public static void main(String[] args) {
        // Create a Gen5 object for Integers.
        Gen5<Integer> iOb = new Gen5<Integer>(88);

        // Create a Gen6 object for Integers
        Gen6<Integer> iOb1 = new Gen6<Integer>(99);

        // Create a Gen6 object for Strings.
        Gen6<String> strOb6 = new Gen6<String>("Generics Test");

        // See if iOb1 is some form of Gen6
        if (iOb1 instanceof Gen6<?>)
            System.out.println("iOb1 is instance of Gen6");

        // See if iOb1 is some form of Gen5
        if(iOb1 instanceof Gen5<?>)
            System.out.println("iOb1 is instance of Gen5");

        System.out.println();

        // See if strOb6 is a Gen6
        if (strOb6 instanceof Gen6<?>)
            System.out.println("strOb6 is instance of Gen6");

        // See if strOb6 is a Gen5
        if (strOb6 instanceof Gen5<?>)
            System.out.println("strOb6 is instance of Gen5");

        System.out.println();

        // See if iOb is an instance of Gen5, which it is
        if (iOb instanceof Gen5<?>)
            System.out.println("iOb is instance of Gen5");
    }
}
