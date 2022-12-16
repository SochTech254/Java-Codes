package Abstract;

abstract class Human {
    abstract void eat(String food, String drink);
    abstract void walk(int distance);
}

class Man extends Human {

    public void eat(String food, String drink) {
        System.out.println("I ate " + food + " with " + drink);
    }

    public void walk(int distance) {
        System.out.println("Yesterday I jogged " + distance + " kms.");
    }
}
class AbstractDemo {
    public static void main(String[] args) {
        Man Soch = new Man();
        Human h;
        h = Soch;

        h.eat("Ugali", "Milk.");
        h.walk(10);
    }
}



