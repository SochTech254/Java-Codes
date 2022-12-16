package annotation.hindiLec;
import java.lang.annotation.*;
/*
 * By default, annotations are not inherited to subclasses
 * The @Inherited annotation marks the annotation to be inherited to subclasses
 * @Inherited annotation means that subclasses of annotated classes are considered having the same annotations as their superclass
 */
@Inherited      // This is how we can specify @Inherited annotation
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation2
{

}
@MyAnnotation2
class A
{

}

class B extends A
{

}
public class InheritedAnnotationDemo
{
    public static void main(String[] args)
    {
        System.out.println("Super class Annotation = " + A.class.getAnnotation(MyAnnotation2.class));

        System.out.println("Sub class Annotation = " + B.class.getAnnotation(MyAnnotation2.class));
    }
}
