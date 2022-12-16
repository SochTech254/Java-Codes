package numberFactorials;

import java.util.InputMismatchException;
import java.util.Scanner;
class Recursion {
    int fact(int n) {
        if (n == 1)
            return 1;
        else
            return fact(n - 1) * n;
    }
}
class Factorial extends java.util.NoSuchElementException {
    public static void main(String[] args) {
        try {
            Scanner read = new Scanner(System.in);
            Recursion r = new Recursion();

            System.out.print("Input number to find its Factorial : ");
            int num = r.fact(read.nextInt());
            System.out.println("The factorial of number is : " + num);

        } catch (InputMismatchException e) {
            System.out.println("This is not an integer! ");
        }

    }
}
