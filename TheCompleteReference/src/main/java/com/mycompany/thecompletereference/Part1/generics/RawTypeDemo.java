package generics;

// Demonstrate a raw type.
class Gen1<T> {
    T ob;   // declare an object of type T

    // Pass the constructor a reference to
    // an object of type T.
    Gen1(T o) {
        ob = o;
    }

    // Return ob.
    T getOb() {
        return ob;
    }
}
// Demonstrate raw type.
class RawTypeDemo {
    public static void main(String[] args) {
        // Create a Gen object for Integers.
        Gen1<Integer> iOb = new Gen1<Integer>(88);

        // Create a Gen object for Strings
        Gen1<String> strOb = new Gen1<String>("Generics Test");

        // Create a raw-type Gen object and give it
        // a Double value.
        Gen1 raw = new Gen1(Double.valueOf(98.6));

        // Cast here is necessary because type is unknown.
        double d = (Double) raw.getOb();
        System.out.println("value: " + d);

        // Te use of a raw type can lead to run-time
        // exceptions. Here are some examples.

        // The following cast causes a run-time error!
        // int i = (Integer) raw.getob();   // run-time error

        // This assignment overrides type safety.
        strOb = raw;    // OK, but potentially wrong
        // String str = strOb.getob();  // run-time error

        // This assignmentalso overrides type safety.
        raw = iOb;     // OK, but potentially wrong
        // d = (Double) raw.getob();    // run-time error
    }
}
