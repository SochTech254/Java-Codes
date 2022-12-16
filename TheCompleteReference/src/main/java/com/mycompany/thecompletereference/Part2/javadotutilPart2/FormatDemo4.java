package Part2.javadotutilPart2;
import java.util.*;

// Demonstrate a field-width specifier.
class FormatDemo4 {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();

        fmt.format("|%f|%n|%12f|%n|%012f",
                10.12345, 10.12345, 10.12345);

        System.out.println(fmt);
        fmt.close();
    }
}
