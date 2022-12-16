package generics;
class SimpGen<T, V> {
    T ob1;
    V ob2;

    SimpGen(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }

    T getob1() {
        return ob1;
    }

    V getob2() {
        return ob2;
    }

    void ShowType() {
        System.out.println("Type of T is " + ob1.getClass().getName());

        System.out.println("Type of V is " + ob2.getClass().getName());
    }
}
public class TwoGen {
    public static void main(String[] args) {
        SimpGen<Integer, String> tgObj = new SimpGen<>(88, "Generics");

        tgObj.ShowType();

        int v = tgObj.getob1();
        System.out.println("Value : " + v);

        String str = tgObj.getob2();
        System.out.println("Value : " + str);

    }
}
