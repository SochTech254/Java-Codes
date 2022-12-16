package Part2.javadotutilPart2;
import java.util.*;

// Use relative indexes to simplify the creation of a custom
// time and date format.
class FormatDemo6 {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();
        Calendar cal = Calendar.getInstance();

        fmt.format("Today is day %te of %<tB, %<tY", cal);
        System.out.println(fmt);
        fmt.close();
    }
}
