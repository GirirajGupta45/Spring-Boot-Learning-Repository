package com.gaurav.controller;

import com.gaurav.entity.Employee;
import com.gaurav.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    private EmployeeService employeeService;

    @Autowired
    public void setEmployeeDAO(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> finaAllEmployees(){
        List<Employee> employees = employeeService.findAllEmployees();
        return employees;
    }

    @PostMapping("/employees")
    String saveEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("employees/{id}")
    public Employee finaEmployeeById(@PathVariable int id){
       return employeeService.findEmployeeById(id);
    }
    @PatchMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee){
        return employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/employees/{id}")
    public void deleteEmployeeById(@PathVariable int id){
        employeeService.deleteEmployeeById(id);
    }
}
