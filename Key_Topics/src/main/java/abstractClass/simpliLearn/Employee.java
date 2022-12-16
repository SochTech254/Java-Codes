package Abstract.simpliLearn;

public class Employee extends Person{
    private final int EmpId;

    public Employee(String EmployeeName, String gen, int EmployeeID) {
        super(EmployeeName, gen);
        this.EmpId = EmployeeID;
    }

    @Override
    public void work() {
        if (EmpId == 0) {
            System.out.println("Employee logged out");
        } else {
            System.out.println("Employee logged in");
        }
    }

    public static void main(String[] args) {
        Person engineer = new Employee("Steve Soch", "Male", 6737);
        engineer.work();
        System.out.println(engineer);
    }
}
