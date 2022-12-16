package Part2.stringHandling;

/*
The replace() method has two forms. The first replaces all occurrences
of one character in the invoking string with another character. It has
the following general form :
    String replace(char original, char replacement)
Here, original specifies the character to be replaced by the character
specified by replacement. The resulting string is returned as below
 The second form of replace() replaces one character sequence with
 another. It has this general form :
    String replace(CharSequence original, CharSequence replacement)
 */
class replaceMethod {
    public static void main(String[] args) {
        String s = "Hello".replace('l','w');
        System.out.println(s);
    }
}
