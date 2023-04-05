package ui;

import service.EmployeeService;

import java.io.BufferedReader;
import java.io.IOException;

public class Signup {
    private EmployeeService employeeService;
    public Signup(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    public void collectSignupInfo(BufferedReader reader) throws IOException{
        System.out.print("Enter your bemsid :");
        int bemsid = Integer.parseInt(reader.readLine());
        System.out.print("Enter your name :");
        String name = reader.readLine();
        System.out.print("Enter your gender [M/F] :");
        String gender = reader.readLine();
        System.out.print("Enter your role [Admin/IC] :");
        String role = reader.readLine();
        System.out.print("Enter your password :");
        String password = reader.readLine();
        System.out.println("Signup Successful !!");

        employeeService.signup(reader, bemsid, name, gender, role, password);
    }

}
