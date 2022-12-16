package annotation.codingWithJohn;
import java.lang.reflect.Method;

public class CreatingAnnotations
{
    public static <stringValue> void main(String[] args) throws Exception
    {
        Cat myCat = new Cat("Stella");
        Dog myDog = new Dog("Jerry");

        if (myCat.getClass().isAnnotationPresent(VeryImportant.class))
        {
            System.out.println("This thing is very important");
        } else
        {
            System.out.println("This thing is not very important");
        }

        if (myDog.getClass().isAnnotationPresent(VeryImportant.class))
        {
            System.out.println("This thing is very important");
        } else
        {
            System.out.println("This thing is not very important");
        }

        for (Method method : myCat.getClass().getDeclaredMethods())
        {
            if (method.isAnnotationPresent(RunImmediately.class))
            {
                RunImmediately annotation = method.getAnnotation(RunImmediately.class);
                    for (int i = 0; i < annotation.times(); i++)
                    {
                        method.invoke(myCat);
                    }
            }
        }


    }

}
