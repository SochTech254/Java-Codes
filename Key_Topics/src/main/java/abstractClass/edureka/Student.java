package Abstract.edureka;

abstract class Person {
    private final String name;
    private final String gender;

    public Person(String nm, String gen) {
        this.name = nm;
        this.gender = gen;
    }


    public  abstract void Studying();

    @Override
    public String toString() {
        return "Name" + this.name + " Gender" + this.gender;
    }
}
public class Student extends Person {
    private final int StudentID;

    public Student(String nm, String gen, int id) {
        super(nm, gen);
        this.StudentID = id;
    }

    @Override
    public void Studying() {
        if (StudentID == 0) {
            System.out.println("Not Studying");
        } else {
            System.out.println("Pursuing a Degree in Bachelor of Engineering");
        }
    }

    public static void main(String[] args) {
        Person student = new Student("Priya", "Female", 0);
        Person student1 = new Student("Karen", "Male", 201021);
        Person student2 = new Student("Kumari", "Female", 101021);
        Person student3 = new Student("John", "Male", 201661);

        student.Studying();
        student1.Studying();
        student2.Studying();
        student3.Studying();
    }
}
