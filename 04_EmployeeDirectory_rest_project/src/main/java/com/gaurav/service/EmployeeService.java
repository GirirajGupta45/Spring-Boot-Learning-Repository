package com.gaurav.service;

import com.gaurav.DAO.EmployeeDAO;
import com.gaurav.DAO.EmployeeDAOImplementation;
import com.gaurav.entity.Employee;
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
}
