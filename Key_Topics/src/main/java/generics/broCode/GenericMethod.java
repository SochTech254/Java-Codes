package generics.broCode;

public class GenericMethod
{

    public static void main(String[] args)
    {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {5.5, 4.4, 3.3, 2.2, 1.1};
        Character[] charArray = {'E', 'E', 'L', 'L', 'O'};
        String[] stringArray = {"B", "Y", "E"};

        System.out.println(getFirst(intArray));
        System.out.println(getFirst(doubleArray));
        System.out.println(getFirst(charArray));
        System.out.println(getFirst(stringArray));
    }

    public static <Thing> void displayArray(Thing[] array)
    {
        for (Thing x : array) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static <Thing> Thing getFirst(Thing[] array) {return array[0];}
}
