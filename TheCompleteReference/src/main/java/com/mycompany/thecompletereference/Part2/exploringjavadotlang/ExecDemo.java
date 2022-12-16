package Part2.exploringjavadotlang;

import java.io.IOException;

// Demonstrate exec()
class ExecDemo {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        Process p = null;

        try {
            p = r.exec("Text Editor");
        } catch (UnsupportedClassVersionError | IOException e) {
            System.out.println("Error executing Text Editor.");
        }
    }
}
