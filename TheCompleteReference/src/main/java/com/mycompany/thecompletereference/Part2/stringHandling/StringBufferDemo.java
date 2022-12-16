package Part2.stringHandling;

// StringBuffer length vs capacity
class StringBufferDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        System.out.println("buffer = " + sb);
        System.out.println("length = " + sb.length());
        System.out.println("capacity = " + sb.capacity());
    }
}
