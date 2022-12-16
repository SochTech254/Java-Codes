package generics;

// A non-generic class can be the superclass
// of a generic subclass.

// A non-generic class
class NonGen1 {
    int num;

    NonGen1(int i) {
        num = i;
    }

    int getnum() {
        return num;
    }
}

// A generic subclass.
class Gen4<T> extends NonGen1 {
    T ob;   // declare an object of type T

    // Pass the constructor a reference to
    // an object of type T.
    Gen4(T o, int i) {
        super(i);
        ob = o;
    }

    // Return ob.
    T getob() {
        return ob;
    }
}
class GenHierDemo1 {
    public static void main(String[] args) {
        // Create a Gen object for String.
        Gen4<String> w = new Gen4<String>("Hello", 47);

        System.out.print(w.getob() + " ");
        System.out.println(w.getnum());
    }
}
