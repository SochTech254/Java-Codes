package generics.broCode;

class MyGeneClass <Thing>{
    Thing x;

    MyGeneClass(Thing x) {this.x = x;}

    public Thing getValue() {
        return x;
    }
}
public class GenericClass {
    public static void main(String[] args) {
        MyGeneClass<Integer> myInt = new MyGeneClass<>(1);
        MyGeneClass<Double> myDouble = new MyGeneClass<>(3.14);
        MyGeneClass<Character> myChar = new MyGeneClass<>('@');
        MyGeneClass<String> myString = new MyGeneClass<>("Bro");

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());
    }
}
