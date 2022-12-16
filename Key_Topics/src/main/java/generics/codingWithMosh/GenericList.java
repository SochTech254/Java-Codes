package generics.codingWithMosh;

class List<T>
{
    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item)
    {
        items[count++] = item;
    }

    public T get(int index)
    {
        return items[index];
    }
}

public class GenericList
{
    public static void main(String[] args)
    {
        var list = new List();
        list.add(1);

        int num = (int) list.get(0);

        System.out.println(num);
    }
}
