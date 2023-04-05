package service;

import enums.GenderEnum;
import enums.RoleEnum;
import models.Employee;
import models.IndividualContributer;
import models.Manager;
import repository.EmployeeRepository;
import ui.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Date;

public class EmployeeService {
    private EmployeeRepository employeeRepository;
    private Login login = new Login(this);
    private Signup signup = new Signup(this);
    private EmployeeScreen employeeScreen = new EmployeeScreen(this);
    private LeaveReport leaveReport = new LeaveReport(this);
    private LeaveApplication leaveApplication = new LeaveApplication(this);

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    public void doEmployeeScreenOperation(BufferedReader reader, int input) {
        if (input == 1) {
            leaveApplication.applyForLeave();
        }
        else if (input == 2) {
            leaveReport.showReport();
        }
    }
    public void doHomeOperation(BufferedReader reader, int input) throws IOException {
        if (input == 1) {
            login.collectLoginInfo(reader);
        }
        else if (input == 2) {
            signup.collectSignupInfo(reader);
        }
        else if (input == 3) {
            System.exit(0);
        }
    }

    public void doSignUpOperation() {

    }

    public void doLoginOperation() {

    }

    public void signup(BufferedReader reader, int bemsid, String name, String gender, String role, String password) throws IOException{
        Enum currentGender = gender.equals("M") ? GenderEnum.MALE : GenderEnum.FEMALE;
        Enum currentRole = role.equals("Admin") ? RoleEnum.MANAGER : RoleEnum.INDIVIDUAL_CONTRIBUTER;
        Employee employee;
        if (currentRole == RoleEnum.MANAGER) {
            employee = new Manager();
            employee.setBemsid(bemsid);
            employee.setGender(currentGender);
            employee.setName(name);
            employee.setRole(currentRole);
            employee.setPassword(password);
            employee.setDate(new Date());
        }
        else {
            employee = new IndividualContributer();
            employee.setBemsid(bemsid);
            employee.setGender(currentGender);
            employee.setName(name);
            employee.setRole(currentRole);
            employee.setPassword(password);
            employee.setDate(new Date());
        }
        employeeRepository.save(employee);
        login.collectLoginInfo(reader);
    }

    public void login(BufferedReader reader, int bemsid, String password) throws IOException{
        Employee employee = employeeRepository.findById(bemsid);
        if(employee.getPassword().equals(password)) {
            employeeScreen.displayEmployeeScreen(reader);
        }
    }
}
