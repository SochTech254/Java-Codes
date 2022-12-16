package annotation.hindiLec;
import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)     // This is how we can specify RetentionPolicy.
@Target(ElementType.METHOD)     // This is how we can specify annotation for class, method or fields.
@interface MyMultiValueAnnotation1
{
    int getValue() default 2;

    String getMessage() default "hello";

    double getDoubleValue() default 5.5;
}

class Message1
{
    @MyMultiValueAnnotation1
    public void displayHi()
    {
        System.out.println("Hi");
    }
}
public class MultiValueAnnotationDemo1
{
    public static void main(String[] args) throws NoSuchMethodException, SecurityException
    {
        Message1 message = new Message1();
        Method method = message.getClass().getMethod("displayHi");

        MyMultiValueAnnotation1 mmva = method.getAnnotation(MyMultiValueAnnotation1.class);

        System.out.println("Value is: " + mmva.getValue());
        System.out.println("Message is: " + mmva.getMessage());
        System.out.println("DoubleValue is: " + mmva.getDoubleValue());
    }
}
