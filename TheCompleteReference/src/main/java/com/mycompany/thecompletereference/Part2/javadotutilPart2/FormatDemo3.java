package Part2.javadotutilPart2;
import java.util.*;

// Demonstrate the %n and %% format specifiers.
class FormatDemo3 {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();

        fmt.format("Copying file%nTransfer is %d%% complete", 88);
        System.out.println(fmt);
        fmt.close();
    }
}
