package growableStack;

class DynStack implements fixedstack.IntStack {
    private int[] stck;
    private int tos;

    // allocate and initialize stack
    DynStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    // Push an item onto the stack

    @Override
    public void push(int item) {
        // if stack is full, allocate a larger stack
        if (tos == stck.length-1) {
            int[] temp = new int[stck.length * 2];  // double size
            System.arraycopy(stck, 0, temp, 0, stck.length);
            stck = temp;
        }
        stck[++tos] = item;
    }

    // Pop an item from the stack

    @Override
    public int pop() {
        if (tos < 0) {
            System.out.println("Stack underflow.");
            return 0;
        }
        else
            return stck[tos--];
    }
}
