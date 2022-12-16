package Part2.javadotutilPart2;
import java.util.*;

// Use automatic resource managament with Formatter.
class FormatDemo6Rpt {
    public static void main(String[] args) {
        try (Formatter fmt = new Formatter()){
            fmt.format("Formatting %s is easy %d %f",
                    "with Java", 10, 98.6);
            System.out.println(fmt);
        }
    }
}
