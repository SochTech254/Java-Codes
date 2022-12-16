package annotation.thCompleteReference;

import java.lang.annotation.*;
import java.lang.reflect.*;

// An annotation type declaration that includes defaults.
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno3 {
    String str() default "Testing";
    int val() default 9000;
}
public class Meta3 {

    // Annotate a method using the default values.
    @MyAnno3()
    public static void myMeth() {
        Meta3 ob = new Meta3();

        // Obtain the annotation for this method
        // and display the values of the members.
        try {
            Class<?> c = ob.getClass();

            Method m = c.getMethod("myMeth");

            MyAnno3 anno3 = m.getAnnotation(MyAnno3.class);

            System.out.println(anno3.str() + " " + anno3.val());
        } catch (NoSuchMethodException e) {
            System.out.println("Method Not Found.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
