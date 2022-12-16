package Part2.stringHandling;

// equals() vs ==
/*
It is important to understand that the equals() method and the ==
operator perform two different operations. The equals() method
compares the characters inside a String object. The == operator
compares two object references to see whether they refer to the
same instance.
The variable s1 refers to the String instance created by "Hello".
The object referred to by s2 is created with s1 as an initializer.
Thus, the contents of the two String objects are identical, but
they are distinct objects. This means that s1 and s2 do not refer
to the same objects and are, therefore, not ==
 */
class EqualsNotEqualTo {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String(s1);

        System.out.println(s1 + " equals " + s2 + " -> " +
                s1.equals(s2));

        System.out.println(s1 + " == " + s2 + " -> " + (s1 == s2));
    }
}
