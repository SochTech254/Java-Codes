package generics;

//  A subclass can add its own type parameters
class Gen2<T> {
    T ob;   // declare an object of type T

    // Pass the constructor a reference to
    // an object of type T
    Gen2(T o) {
        ob = o;
    }

    // Return ob.
    T getob() {
        return ob;
    }
}

// A subclass of Gen that defines a second
// type parameter, called V
class Gen3<T, V> extends Gen2<T> {
    V ob2;

    Gen3(T o, V o2) {
        super(o);
        ob2 = o2;
    }

    V getob2() {
        return ob2;
    }
}
// Create an object of type Gen3
class GenHierDemo {
    public static void main(String[] args) {
        // Create a Gen3 object for String and Integer.
        Gen3<String, Integer> x = new Gen3<String, Integer>("Value is: ", 99);

        System.out.print(x.getob());
        System.out.println(x.getob2());
    }
}
