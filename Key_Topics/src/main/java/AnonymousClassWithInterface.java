class AnonymousClassWithInterface {
    public static void main(String[] args) {
        Ab obj = () -> System.out.println("anything");

        /*
         * Without the lambda the above is as follows
         * Ab obj = new Ab() {
         *      public void show() {
         *          System.out.println("anything");
         *      }
         * };
         */
        obj.show();
    }
}
interface Ab {
    void show();
}
