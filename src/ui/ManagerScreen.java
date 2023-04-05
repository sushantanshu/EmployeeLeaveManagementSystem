package ui;

import models.Manager;
import service.EmployeeService;

import java.io.BufferedReader;
import java.io.IOException;

public class ManagerScreen {
    private EmployeeService employeeService;
    public ManagerScreen(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    public void displayManagerScreen(BufferedReader reader) throws IOException {
        System.out.println("1. Apply for leave");
        System.out.println("2. View Leave report");
        System.out.println("3. View Notifications");
        System.out.println("4. Team Signup");
        System.out.println("5. Show Team");
        String input = reader.readLine();
        employeeService.doEmployeeScreenOperation(reader, Integer.parseInt(input));
    }
}
