package com.gaurav.DAO;

import com.gaurav.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> finaAllEmployees();
    String  save(Employee employee);
    Employee findEmployeeById(int id);

    Employee updateEmployee(Employee employee);

    void deleteEmployeeById(int id);

}
