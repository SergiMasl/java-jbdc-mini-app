import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        System.out.println("Hello world!");

        EmployeeDAO dao = EmployeeDAOFactory.getEmployeeDao();

        //add
        //Employee employee = new Employee("c", "c@gmail.com");
        //dao.addEmployee(employee);

        //get by ID
      //  Employee employee = dao.getEmployeeById(2);
       // System.out.println("Name: " + employee.getName() + ", Email: " + employee.getEmail());

       //delete
        // dao.deleteEmployee(2);

        //update?????
//        Employee employee = new Employee(1, "x", "xxx@gmail.com");
//        dao.updateEmployee(employee);

        //getAll
        List<Employee> employees = dao.getEmployees();
        for (Employee employee : employees) {
            System.out.println("Name: " + employee.getName() + ", Email: " + employee.getEmail());
        }

    }
}