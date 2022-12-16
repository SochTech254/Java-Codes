package Part2.stringHandling;

// Demonstrate indexOf() and lastIndexOf().
/*
indexOf() searches for the first occurrence of a character or substring
lastIndexOf() searches for the last occurrence of a character or substring
These two methods return the index at which the character or substring
was found, or -1 on failure.
 */
class indexOfDemo {
    public static void main(String[] args) {
        String s = "Now is the time for all good men " +
                "to come to the aid of their country.";

        System.out.println(s);
        System.out.println("indexOf(t) = " + s.indexOf('t'));
        System.out.println("lastIndexOf(t) = " + s.lastIndexOf('t'));
        System.out.println("indexOf(the) = " + s.indexOf("the"));
        System.out.println("lastIndexOf(the) = " + s.lastIndexOf("the"));
        System.out.println("indexOf(t, 10) = " + s.indexOf('t', 10));
        System.out.println("lastIndexOf(t, 60) = " + s.lastIndexOf('t', 60));
        System.out.println("indexOf(the, 10) = " + s.indexOf("the", 10));
        System.out.println("lastIndexOf(the, 60) = " + s.lastIndexOf("the", 60));
    }
}
