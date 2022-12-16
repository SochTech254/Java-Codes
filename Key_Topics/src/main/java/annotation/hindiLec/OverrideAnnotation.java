package annotation.hindiLec;
/*
* @Override annotation assures that the subclass method is overriding
* the parent class method.
* If not so, compile time error occurs.
*/
class Animal
{
    void eatChicken()
    {
        System.out.println("Eating 2 chicken legs");
    }
}
class Dog extends Animal
{
    @Override
    void eatChicken()
    {
        System.out.println("Eating 5 chicken legs");
    }
}
public class OverrideAnnotation {
    public static void main(String[] args)
    {
        Animal animal = new Dog();
        animal.eatChicken();
    }
}
