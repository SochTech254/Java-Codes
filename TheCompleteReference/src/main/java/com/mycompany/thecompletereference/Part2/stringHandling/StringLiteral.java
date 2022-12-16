package Part2.stringHandling;
/*
Because a String object is created for every string literal,
you can use a string literal any place you can use a String
object. You can call methods directly on a quoted string as if
it were an object reference
 */
class StringLiteral {
    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c'};
        String s1 = new String(chars);

        String s2 = "abc"; // use string literal

        System.out.println("abc".length());
    }
}
