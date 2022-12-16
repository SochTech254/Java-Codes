package Part2.exploringjavadotlang;

// Demonstrate IS... methods.
class IsDemo {
    public static void main(String[] args) {
        char[] a = {'a', 'b', '5', '?', 'A', ' '};

        for (char c : a) {
            if (Character.isDigit(c))
                System.out.println(c + " is a digit.");
            if (Character.isLetter(c))
                System.out.println(c + " is a letter.");
            if (Character.isWhitespace(c))
                System.out.println(c + " is whitespace.");
            if (Character.isUpperCase(c))
                System.out.println(c + " is uppercase.");
            if (Character.isLowerCase(c))
                System.out.println(c + " is lowercase.");
        }
    }
}
