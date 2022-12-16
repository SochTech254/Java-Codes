package fixedstack;
/*
 An implementation of IntStack that uses fixed storage
 This class defines an integer stack that can hold 10 values
 */
public class FixedStack implements IntStack {
    /*
    Now, both stck and tos are private. This means
    that they cannot be accidentally or maliciously
    altered in a wat that would be harmful to the stack.
     */
    private final int[] stck;
    private int tos;

    // Allocate and Initialize top-of-stack
    public FixedStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    // Push an item onto the stack
    public void push(int item) {
        if (tos == stck.length - 1)     // use length member
            System.out.println("FixedStack is full.");
        else
            stck[++tos] = item;
    }

    // Pop an item from the stack
    public int pop() {
        if (tos < 0) {
            System.out.println("FixedStack underflow.");
            return 0;
        }
        else
            return stck[tos--];
    }
}
