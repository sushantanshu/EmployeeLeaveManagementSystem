package ui;

import service.EmployeeService;

import java.io.BufferedReader;
import java.io.IOException;

public class Home {
    private EmployeeService homeService;
    public Home(EmployeeService homeService) {
        this.homeService = homeService;
    }
    public void display(BufferedReader reader) throws IOException{
        System.out.println("Home Menu");
        System.out.println("1.Employee Login");
        System.out.println("2.Employee Signup");
        System.out.println("3.Exit");
        System.out.print("Please Select Your Option to Proceed : ");
        String selectedOption = reader.readLine();
        homeService.doHomeOperation(reader, Integer.parseInt(selectedOption));
    }
}
