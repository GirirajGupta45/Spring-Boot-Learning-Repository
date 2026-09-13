package com.gaurav.DAO;

import com.gaurav.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeDAOImplementation implements EmployeeDAO {

    private EntityManager entityManager;

    @Autowired
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> finaAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        TypedQuery<Employee> query = entityManager.createQuery("from Employee", Employee.class);
        employees.addAll(query.getResultList());
        return employees;
    }

    @Override
    public String  save(Employee employee) {
        entityManager.persist(employee);
        return "Employee has been saved successfully!!!";
    }

    @Override
    public Employee findEmployeeById(int id) {
        return entityManager.find(Employee.class, id);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        Employee updatedEmployee = entityManager.merge(employee);
        return updatedEmployee;
    }

    @Override
    public void deleteEmployeeById(int id) {
          entityManager.remove(entityManager.find(Employee.class, id));
    }
}
