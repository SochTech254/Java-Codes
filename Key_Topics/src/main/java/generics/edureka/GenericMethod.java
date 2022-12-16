package generics.edureka;

public class GenericMethod {

    // A Generic method example
    static <T> void genericDisplay(T element)
    {
        System.out.println(element.getClass().getName() + " = " + element);
    }

    // Driver method
    public static void main(String[] args)
    {
        // Calling generic method with Integer argument
        genericDisplay(3456);

        // Calling generic method with String argument
        genericDisplay("Edureka");

        // Calling generic method with double argument
        genericDisplay(2.0);
    }
}
