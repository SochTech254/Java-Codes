package fixedstack;

class IFTest {
    public static void main(String[] args) {
        FixedStack mystack1 = new FixedStack(5);
        FixedStack mystack2 = new FixedStack(8);

        // push some numbers onto the stack
        for (int i = 0; i < 10; i++) mystack1.push(i);
        for (int i = 10; i < 25; i++) mystack2.push(i);

        // pop those numbers off the stack
        System.out.println("FixedStack in mystack1 : ");
        for (int i = 0; i < 10; i++)
            System.out.println(mystack1.pop());

        System.out.println();

        System.out.println("FixedStack in mystack2 : ");

        for (int i = 0; i < 15; i++)
            System.out.println(mystack2.pop());
    }
}
