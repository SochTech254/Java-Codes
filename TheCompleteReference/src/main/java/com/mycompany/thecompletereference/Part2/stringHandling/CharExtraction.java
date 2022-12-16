package Part2.stringHandling;

class CharExtraction {
    public static void main(String[] args) {
        char ch;
        ch = "abcde".charAt(1); // extracts a single character from the String
        System.out.println(ch);

        String s = "This is a demo of the getChars method.";
        int start = 10;
        int end = 14;
        char[] buf = new char[end - start];
        s.getChars(start, end, buf, 0);
        System.out.println(buf);

        /*
        There is an alternative to getChars() that stores the
        characters in an array of bytes. This method is called
        getBytes(), and it uses the default character-to-byte
        conversions provided by the platform. Here is its simplest
        form : byte[] getBytes()

        If you want to convert all the characters in a String object
        into a character array, the easiest way is to call toCharArray()
        It returns an array of characters for the entire string. it has
        this general form : char[] toCharArray()
        This function is provided as a convenience, since it is
        possible to use getChars() to achieve the same result.
         */
    }
}
