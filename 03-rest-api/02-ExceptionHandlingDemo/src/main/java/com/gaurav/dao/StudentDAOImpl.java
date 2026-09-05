package com.gaurav.dao;

import com.gaurav.entity.Student;
import com.gaurav.exception.StudentErrorResponse;
import com.gaurav.exception.StudentNotFoundException;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Repository
public class StudentDAOImpl implements StudentDAO {
    private EntityManager entityManager;
    @Autowired
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public String save(Student student) {
        entityManager.persist(student);
        return "Student registered successfully!!!";
    }

    @Override
    public Student findById(int id) {
       Student student= entityManager.find(Student.class, id);
        if(student==null){
            throw new StudentNotFoundException("Student not found with id " + id);
        }else{
            return student;
        }
    }

    @Override
    @Transactional
    public String deleteById(int id) {
        Student student = entityManager.find(Student.class, id);
        if(student!=null){
            entityManager.remove(student);
            return "Student deleted successfully!!!";
        }else{
            return "Student not found!!!";
        }
    }

    @Override
    @Transactional
    public String updateStudent(Student student) {
        try{
            entityManager.merge(student);
            return "Student updated successfully!!!";
        }
       catch(Exception e){
        return "Student not found!!!";
       }
    }



}
