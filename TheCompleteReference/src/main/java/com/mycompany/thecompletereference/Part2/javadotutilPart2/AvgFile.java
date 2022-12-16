package Part2.javadotutilPart2;
import java.util.*;
import java.io.*;

// Use Scanner to compute an average of the values in a file
class AvgFile {
    public static void main(String[] args)
        throws IOException {

        int count = 0;
        double sum = 0.0;

        // write output to a file.
        FileWriter fout  = new FileWriter("test.txt");
        fout.write("2 3.4 5 6 7.4 9.1 10.5 done");
        fout.close();

        FileReader fin = new FileReader("Test.txt");

        Scanner src = new Scanner(fin);

        // Read and sum numbers.
        while (src.hasNext()) {
            if (src.hasNextDouble()) {
                count++;
            }

            else {
                String str = src.next();
                if (str.equals("done")) break;
                else {
                    System.out.println("File format error.");
                    return;
                }
            }
        }

        src.close();
        System.out.println("Average is " + sum / count);
    }
}
