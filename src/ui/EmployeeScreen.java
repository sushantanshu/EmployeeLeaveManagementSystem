package ui;

import service.EmployeeService;

import java.io.BufferedReader;
import java.io.IOException;

public class EmployeeScreen {
    private EmployeeService employeeService;
    public EmployeeScreen(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    public void displayEmployeeScreen(BufferedReader reader) throws IOException {
        System.out.println("1.Apply for leave");
        System.out.println("2.View Leave report");
        String input = reader.readLine();
        employeeService.doEmployeeScreenOperation(reader, Integer.parseInt(input));
    }
}
