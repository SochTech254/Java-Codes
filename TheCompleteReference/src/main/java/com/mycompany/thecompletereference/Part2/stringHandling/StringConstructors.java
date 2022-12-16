package Part2.stringHandling;

/*
String is a reference type or Java implements strings
as objects of type String
The below program shows a String initialized by an array of
characters by using the constructor
The values passed in the constructor show where the subrange
begins and specifies the number of characters to use
 */
class StringConstructors {
    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f'};
        String s = new String(chars, 2, 3);
        // chars passes the array of characters
        // 2 specifies the index at which the subrange begins
        // 3 specifies the number of characters to use
        System.out.println(s);

    }
}
