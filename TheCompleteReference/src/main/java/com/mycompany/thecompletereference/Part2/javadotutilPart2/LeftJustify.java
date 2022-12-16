package Part2.javadotutilPart2;
import java.util.*;

// Demonstrate left justification
class LeftJustify {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();

        // Right justify by default
        fmt.format("|%10.2f|", 123.123);
        System.out.println(fmt);

        // Now, left justify.
        fmt = new Formatter();
        fmt.format("|%-10.2f|", 123.123);
        System.out.println(fmt);
        fmt.close();
    }

}
