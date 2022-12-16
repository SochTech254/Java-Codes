package generics;

// A non-generic class can be the superclass
// of a generic subclass.

// A non-generic class.
class NonGen {
    int num;

    NonGen(int i) {
        num = i;
    }

    int getnum() {
        return num;
    }
}

// A generic subclass.
class Gen3<T> extends NonGen {
    T ob;   // declare an object of type T

    // Pass the constructor a reference to
    // an object of type T.
    Gen3(T o, int i) {
        super(i);
        ob = o;
    }

    // Return ob.
    T getob() {
        return ob;
    }
}

// Create a Gen object.
class HierDemo1 {
    public static void main(String[] args) {
        // Create a Gen object for String.
        Gen3<String> w = new Gen3<>("Hello", 47);

        System.out.print(w.getob() + " ");
        System.out.println(w.getnum());

    }
}
