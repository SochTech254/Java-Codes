package annotation.hindiLec;
/*
 * @Deprecated annotation marks that this method is deprecated so
 * compiler prints warning
 * @Deprecated informs user that it may be removed in the future versions.
 * So, it is better not to use such methods
 */
class Animal1 {
    @Deprecated
    void eatChicken()
    {
        System.out.println("Eating 2 chicken legs.");
    }
}
public class DeprecatedAnnotation
{
    public static void main(String[] args)
    {
        Animal1 animal = new Animal1();
        animal.eatChicken();
    }
}
