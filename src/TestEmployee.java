import java.util.ArrayList;

class TestEmployee
{
    private static ArrayList<Employee> employees;

    /**
     * calls a EmployeeConsoleView object, reads data for employees into it and
     * then writes out the object containing a ArrayList of those employees.
     * This class acts as a controller for the Employee class (a model) and the
     * EmployeeConsoleView (a view).
     * 
     * @param employees
     */
    public static void main(String[] args)
    {

        EmployeeConsoleView employeeView = new EmployeeConsoleView();

        Employee employee1 = new Employee();
        employeeView.read(employee1);

        Employee employee2 = new Employee();
        employeeView.read(employee2);

        Employee employee3 = new Employee();
        employeeView.read(employee3);

        Employee employee4 = new Employee();
        employeeView.read(employee4);

        employeeView.write(employees);
        System.out.println("The Total Number of Employees: "
                + Employee.getNumEmployees());
    }
}

/***********************
 * * The Run********************************** 1 Please type in new employee's
 * name David Lee Roth Please type in new employee's SSN 123123123 Please type
 * in new employee's Salary 1000000
 * 
 * 
 * 
 * 2 Please type in new employee's name Eddie Van Halen Please type in new
 * employee's SSN 234234234 Please type in new employee's Salary 10000000
 * 
 * 
 * 
 * Name: David Lee Roth SSN: 123123123 Salary: 1000000.0
 * 
 * 
 * Name: Eddie Van Halen SSN: 234234234 Salary: 1.0E7
 */
