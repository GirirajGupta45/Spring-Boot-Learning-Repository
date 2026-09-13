package com.gaurav.service;

import com.gaurav.DAO.EmployeeDAO;
import com.gaurav.DAO.EmployeeDAOImplementation;
import com.gaurav.entity.Employee;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private EmployeeDAO employeeDAO;

    @Autowired
    public void setEmployeeDAO(EmployeeDAOImplementation employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    public List<Employee> findAllEmployees(){
        return employeeDAO.finaAllEmployees();
    }

    @Transactional
    public String saveEmployee(Employee employee){
       return  employeeDAO.save(employee);
    }

    public Employee findEmployeeById(int id){
        return employeeDAO.findEmployeeById(id);
    }

    @Transactional
    public Employee updateEmployee(Employee employee){
        return employeeDAO.updateEmployee(employee);
    }

    @Transactional
    public void deleteEmployeeById(int id){
        employeeDAO.deleteEmployeeById(id);
    }

}
