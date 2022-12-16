package generics;

// Generics and arrays.
class Gen10<T extends Number> {
    T ob;

    T[] vals;   // OK

    Gen10(T o, T[] nums) {
        ob = o;

        // This statement is illegal.
        // vals = new T[10];   can't create an array of T

        // But, this statement is Ok.
        vals = nums;    // OK to assign reference to existent array
    }
}
class GenArrays {
    public static void main(String[] args) {
        Integer[] n = {1, 2, 3, 4, 5};

        Gen10<Integer> iOb = new Gen10<>(50, n);

        // Can't create an array of type-specific generic references.
        // Gen10<Integer> gens[] = new Gen10<Integer>[10];  // wrong!

        // This is OK.
        //Gen10<?>[] gens = new Gen10<>[10];  // OK
    }
}
