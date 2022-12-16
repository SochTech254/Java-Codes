package Part1.enumerationsAutoboxingAndAnnotations;

// Use the built-in enumeration methods

// Check the enum Apples for Apple varieties

class EnumValueAndValueOfMethods {
    public static void main(String[] args) {
        Apple ap;

        System.out.println("Here are all Apple constants : ");

        // use values()
        Apple allapples[] = Apple.values();
        for (Apple a : allapples)   // for(Apple a : Apple.values()) is still valid
            System.out.println(a);

        System.out.println();

        // use valueof()
        ap = Apple.valueOf("Winesap");
        System.out.println("ap contains " + ap);
    }
}
