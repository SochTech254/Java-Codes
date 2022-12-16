package annotation.kodySimpson;

@EmptyAnnotation
public class Main {

    @FilledAnnotation(name = "Soch", value = 12)
    private static final int THING = 3;

    @EmptyAnnotation
    public static void main(String[] args) {
        // Write your code here
    }

    @FilledAnnotation(name = "SourchCode", value = 13)
    public static void doSomething() {
        System.out.println("Hey there, What's your name?");
    }
}
