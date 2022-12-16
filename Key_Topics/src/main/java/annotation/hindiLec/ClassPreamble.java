package annotation.hindiLec;
import java.lang.annotation.Documented;

// To make the information in @ClassPreamble appear in Javadoc-generated documentation,
// You must annotate the @ClassPreamble definition with the @Documented annotation
@Documented
@interface ClassPreamble
{
    String author();
    String date();
    int currentRevision() default 1;
    String lastModified() default "N/A";
    String lastModifiedBy() default "N/A";

    // Note use of array
    String[] reviewers();
}
