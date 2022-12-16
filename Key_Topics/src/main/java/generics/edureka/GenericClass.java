package generics.edureka;

class Test1<T, V>
{
    T o1;   // An object of type T
    V o2;   // An object of type V

    // constructor
    Test1(T o1, V o2)
    {
        this.o1 = o1;
        this.o2 = o2;
    }

    // To print objects of T and V
    public void print()
    {
        System.out.println(o1);
        System.out.println(o2);
    }
}
// Driver class to test above
public class GenericClass {
    public static void main(String[] args) {
        Test1 <String, Integer> obj = new Test1<>("Edureka", 10);
        obj.print();
    }
}
