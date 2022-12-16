package iOtryWithResourcesAndOtherTopics;

// Read a string fromconsole using a BufferedReader.
import java.io.*;
class BRReadLines {
    public static void main(String[] args) {
        // create a BufferedReader using System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'stop' to quit.");
        do {
            try {
                str = br.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println(str);
        } while (!str.equals("stop"));
    }
}
