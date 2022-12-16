class A6 {
    public void show() {
        System.out.println("in A show.");
    }
}
class Anonymous {

    public static void main(String[] args) {
        A6 obj = new A6() {
            @Override
            public void show() {
                super.show();
                System.out.println("I am the Best in code");
            }
        };

        obj.show();

    }
}
