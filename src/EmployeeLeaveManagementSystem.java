import repository.EmployeeRepository;
import service.EmployeeService;
import ui.Home;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmployeeLeaveManagementSystem {
    public static void main(String[] args) {
        try(InputStreamReader in = new InputStreamReader(System.in) ; BufferedReader reader = new BufferedReader(in)){
            EmployeeRepository employeeRepository = new EmployeeRepository();
            EmployeeService employeeService = new EmployeeService(employeeRepository);
            Home home = new Home(employeeService);
            home.display(reader);
        }
        catch (IOException ioe ) {
            ioe.printStackTrace();
        }

    }
}
