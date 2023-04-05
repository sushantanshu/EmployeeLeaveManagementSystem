package ui;

import service.EmployeeService;

public class LeaveReport {
    private EmployeeService employeeService;
    public LeaveReport(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    public void showReport() {
        System.out.println("Sick Leaves Left : ");
        System.out.println("Paid Leaves Left : ");
    }
}
