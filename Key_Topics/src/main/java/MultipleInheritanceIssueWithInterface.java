interface Demon {
    void abc();
    default void show() {
        System.out.println("in Demon show.");
    }
}
interface MyDemon {
    default void show() {
        System.out.println("in MyDemon show.");
    }
}
class DemonImp implements Demon, MyDemon {
    @Override
    public void abc() {
        System.out.println("in abc.");
    }

    @Override
    public void show() {
        MyDemon.super.show();
    }
}

class MultipleInheritanceIssueWithInterface {
    public static void main(String[] args) {
        DemonImp obj = new DemonImp();
        obj.abc();
        obj.show();
    }
}
