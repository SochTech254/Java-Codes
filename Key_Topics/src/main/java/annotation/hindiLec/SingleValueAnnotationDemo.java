package annotation.hindiLec;

import java.lang.annotation.*;
import java.lang.reflect.Method;

// An annotation that has one method, is called single-value annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MySingleValueAnnotation
{
    int getValue();
}
class Display
{
    // Code to apply the single-value annotation
    @MySingleValueAnnotation(getValue = 20)
    public void displayHi()
    {
        System.out.println("Hi");
    }
}
public class SingleValueAnnotationDemo
{
    public static void main(String[] args) throws NoSuchMethodException, SecurityException
    {
        Display display = new Display();
        Method method = display.getClass().getMethod("displayHi");

        MySingleValueAnnotation msva = method.getAnnotation(MySingleValueAnnotation.class);

        System.out.println("Value is : " + msva.getValue());
    }
}
