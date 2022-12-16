package Part1.enumerationsAutoboxingAndAnnotations;

import java.lang.annotation.*;
import java.lang.reflect.*;

// A single-member annotation.
@Retention(RetentionPolicy.RUNTIME)
@interface MySingle {
    int value();    // this variable name must be value
}
class SingleMemberAnnotation {

    // Annotate a method using a single-member annotation.
    @MySingle(100)
    public static void myMeth() {
        SingleMemberAnnotation ob = new SingleMemberAnnotation();

        try {
            Method m = ob.getClass().getMethod("myMeth");

            MySingle anno = m.getAnnotation(MySingle.class);

            System.out.println(anno.value());  // displays 100
        } catch (NoSuchMethodException exc) {
            System.out.println("Method Not Found.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
