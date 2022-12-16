package generics.codingWithJohn;

class Printer <T> {
    T thingToPrint;

    public Printer(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.println(thingToPrint);
    }
}
class GenericsExample {
    public static void main(String[] args) {
        Printer<Integer> printer = new Printer<>(23);

        printer.print();

        Printer doublePrinter = new Printer(33.5);

        doublePrinter.print();

        shout("Soch");
    }

    private static <T> void shout (T thingToShout) {
        System.out.println(thingToShout + "!!!");
    }
}
