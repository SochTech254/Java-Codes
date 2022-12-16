package annotation.hindiLec;

/*
 * Java Custom annotation or Java User-defined annotation are easy to create and use.
 * The @interface element is used to declare an annotation.
 * In this example, MyAnnotation is the custom annotation name.
 */
@interface MyAnnotation
{

}
public class CustomAnnotation
{
    @MyAnnotation
    public static void main(String[] args)
    {
        System.out.println("Hi");
    }
}
