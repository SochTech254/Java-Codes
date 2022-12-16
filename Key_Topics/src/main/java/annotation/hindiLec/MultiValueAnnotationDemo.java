package annotation.hindiLec;
import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyMultiValueAnnotation
{
    int getValue();
    String getMessage();
}

class Message
{
    @MyMultiValueAnnotation(getValue = 500, getMessage = "welcome")
    public void displayHi()
    {
        System.out.println("Hi");
    }
}
public class MultiValueAnnotationDemo
{
    public static void main(String[] args) throws NoSuchMethodException, SecurityException
    {
        Message message = new Message();
        Method method = message.getClass().getMethod("displayHi");

        MyMultiValueAnnotation mmva = method.getAnnotation(MyMultiValueAnnotation.class);

        System.out.println("Value is : " + mmva.getValue());
        System.out.println("Message is : " + mmva.getMessage());
    }
}
