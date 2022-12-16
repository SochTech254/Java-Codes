package Part2.javadotutilPart2;
import java.util.*;

// Demonstrate several Optional<T> methods
class OptionalDemo {
    public static void main(String[] args) {

        Optional<String> noVal = Optional.empty();

        Optional<String> hasVal = Optional.of("ABCDEFG");

        System.out.println("noVal has no value");

        hasVal.ifPresent(s -> System.out.println("The string in hasVal is : "
                + s));

        String defStr = noVal.orElse("Default String");
        System.out.println(defStr);
    }
}
