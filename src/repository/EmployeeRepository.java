package repository;

import models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeRepository {
    private List<Employee> employeeData = new ArrayList<>();

    public void save(Employee employee) {
        employeeData.add(employee);
    }
    public Employee findById(int bemsid) {
        return employeeData.stream().filter(emp -> bemsid == emp.getBemsid()).collect(Collectors.toList()).get(0);
    }
    public List<Employee> findAll() {
        return employeeData;
    }
    public void delete(int bemsid) {
        employeeData.removeIf(emp -> bemsid == emp.getBemsid());
    }
}
