package ui;

import service.EmployeeService;

import java.io.BufferedReader;
import java.io.IOException;

public class Login {
    private EmployeeService employeeService;
    public Login(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    public void collectLoginInfo(BufferedReader reader) throws IOException{
        System.out.print("Enter your bemsid :");
        int bemsid = Integer.parseInt(reader.readLine());
        System.out.print("Enter your password :");
        String password = reader.readLine();
        employeeService.login(reader, bemsid, password);
    }
}
