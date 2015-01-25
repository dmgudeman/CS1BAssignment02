import java.util.ArrayList;
import java.util.Scanner;

// changes to test github
/**
 * One object of class EmployeeConsoleView takes the personal data input for
 * employees from the console and stores the data in an ArrayList
 */
class EmployeeConsoleView
{

    ArrayList<Employee> employees = new ArrayList<Employee>();

    /**
     * takes input for personal data via the console for each employee created
     * in the TestEmployee class and adds the data to the ArrayList
     */
    public void read(Employee emp)
    {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please type in new employee's name");
        String newName = scanner.nextLine();
        emp.setName(newName);

        System.out.println("Please type in new employee's SSN");
        String newSSN = scanner.nextLine();
        emp.setSsn(newSSN);

        System.out.println("Please type in new employee's Salary");
        Double newSalary = scanner.nextDouble();
        emp.setSalary(newSalary);
        employees.add(emp);

        System.out.println("\n\n");
    }

    /**
     * iterates through the ArrayList and prints out the data
     */
    public void write(ArrayList<Employee> employees)
    {
        for (Employee emp : employees)
        {
            String aString = ("Name: " + emp.getName() + "\n" + "SSN: "
                    + emp.getSsn() + "\n" + "Salary: " + emp.getSalary())
                    + "\n\n";
            System.out.println(aString);
        }

    }
}
