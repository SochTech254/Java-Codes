package annotation.hindiLec;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/*
 * Step 1: Declare a Repeatable annotation type
 *
 * The annotation type must be marked with the
 * @Repeatable meta-annotation
 */
@Repeatable(value = Cars.class)
@interface Manufacturer
{
    String name();
}

/*
 * Step 2: Declare the Containing Annotation Type
 *
 * The containing annotation type must have a value element
 * with an array type. The component type of the array type
 * must be the repeatable annotation type
 */
@Retention(RetentionPolicy.RUNTIME)
@interface Cars
{
    Manufacturer[] value() default {};
}

/*
 * Java 8 introduces the repeating annotation. This means same annotations can be
 * repeated as much as you want at same locations.
 *
 * With Java 8 repeating annotations, it gives us the flexibility to write the same thing
 * without any container annotation.
 *
 * Though the container annotation was not used here, the Java compiler this time around takes responsibility
 * for wrapping the two annotations into a container
 *
 * Prior to Java 8, it was forbidden to declare more than one annotation of the same type
 * to the same location of a code
 *
 * Prior to Java 8, to have a repeated annotation, will have to group them
 * in a container annotation as below
 */
@Manufacturer(name =  "Mercedes Benz")
@Manufacturer(name =  "Toyota")
@Manufacturer(name =  "BMW")
@Manufacturer(name =  "Range Rover")
public interface Car {
}
