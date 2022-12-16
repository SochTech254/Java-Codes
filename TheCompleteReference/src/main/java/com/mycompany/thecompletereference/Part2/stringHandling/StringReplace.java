package Part2.stringHandling;

// Substring replacement.
/*
You can extract a substring using substring(). It has two forms. The
first is : String substring(int startIndex)
Here, startIndex specifies the index at which the substring will begin.
This form returns a copy of the substring that begins at startIndex and
runs to the end of the invoking string.
The second form of substring() allows you to specify both the beginning
and ending index of the substring : String substring(int startIndex, int endIndex)
Here, startIndex specifies the beginning index, and endIndex specifies the
stopping point. The string returned contains all the characters from the
beginning index, up to, but not including, the ending index.

 */
class StringReplace {
    public static void main(String[] args) {
        String org = "This is a test. This is, too";
        String search = "is";
        String sub = "was";
        String result;
        int i;

        do { // replace all matching substrings
            System.out.println(org);
            i = org.indexOf(search);
            if (i != -1) {
                result = org.substring(0, i);
                result = result + sub;
                result = result + org.substring(i + search.length());
                org = result;
            }


        } while (i != -1);
    }
}
