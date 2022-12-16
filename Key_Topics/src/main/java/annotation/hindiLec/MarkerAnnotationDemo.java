package annotation.hindiLec;

// An annotation that has no method is called marker annotation
// The @Override and @Deprecated are marker annotations.
@interface MyMarkerAnnotation
{

}
public class MarkerAnnotationDemo
{
    @MyMarkerAnnotation
    public void display()
    {
        System.out.println("Hi");
    }

    public static void main(String[] args)
    {
        MarkerAnnotationDemo markerAnnotationDemo = new MarkerAnnotationDemo();
        markerAnnotationDemo.display();
    }

}
