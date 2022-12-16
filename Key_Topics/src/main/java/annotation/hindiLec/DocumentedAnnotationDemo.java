package annotation.hindiLec;
import java.lang.annotation.Documented;
/*
 * The @Documented annotation is used to signal to the JavaDoc tool that your
 * custom annotation should be visible in the JavaDoc for classes using your custom annotation.
 *
 * When generating JavaDoc for the DocumentedAnnotationDemo class, the @MyAnnotation3 is now included in the JavaDoc
 *
 * You will not use the @Documented annotation often, but now you know it exists, if you should need it.
 */
@Documented
@interface MyAnnotation3
{

}
@MyAnnotation3
public class DocumentedAnnotationDemo
{
    public static void main(String[] args)
    {
        // javadoc MyClass.java
    }
}
