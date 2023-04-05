package ui;

import service.EmployeeService;

public class LeaveApplication {
    private EmployeeService employeeService;
    public LeaveApplication(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    public void applyForLeave() {
        System.out.println("Enter no of days : ");
    }
}
