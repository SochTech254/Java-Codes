package Part2.stringHandling;

// Demonstrate delete() and deleteCharAt()
class deleteDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("This is a test.");

        sb.delete(4, 7);
        System.out.println("After delete: " + sb);

        sb.deleteCharAt(0);
        System.out.println("After deleteCharAt: " + sb);
    }
}
