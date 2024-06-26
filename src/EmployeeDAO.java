import java.sql.SQLException;
import java.util.List;

public interface EmployeeDAO {
    void addEmployee(Employee employee) throws SQLException;
    void updateEmployee(Employee employee);
    void deleteEmployee(int id);

    List <Employee> getEmployees();
    Employee getEmployeeById(int id);

}
