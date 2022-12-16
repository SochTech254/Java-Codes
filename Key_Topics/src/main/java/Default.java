class Gen<T> {
    T ob;

    Gen(T o) {
        ob = o;
    }

    T getob() {
        return ob;
    }

    void ShowType() {
        System.out.println("Type of T is " + ob.getClass().getName());
    }
}
class Default {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<>(88);

        iOb.ShowType();
        int v = iOb.getob();
        System.out.println("Value :" + v);

        Gen<String> strOb = new Gen<>("Generics Test");
        strOb.ShowType();
        String str = strOb.getob();
        System.out.println("Value : " + str);
    }
}
