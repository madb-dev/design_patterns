import com.example.Employee;
import com.example.composite.SuperIntendent;
import com.example.leaf.Principal;
import com.example.leaf.Secretary;
import com.example.leaf.Teacher;

public class School {
    public static void main(String[] args) {
        SuperIntendent superIntendent = new SuperIntendent(1, "Gary", "Chalmers", "Superintendent");
        Employee principal = new Principal(2, "Seymour", "Skinner", "Principal");
        Employee teacher = new Teacher(3, "Edna", "Krabappel", "4th grade teacher");
        Employee secretary = new Secretary(4, "Marge", "Simpson", "Secretary");

        superIntendent.addEmployee(principal);
        superIntendent.addEmployee(teacher);
        superIntendent.addEmployee(secretary);

        System.out.println("Welcome to the school... our organization chart is:");
        superIntendent.showEmployeeDetails();
    }
}