package com.gaurav.student_dao;

import com.gaurav.entities.Student;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

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
    public String findById(int id) {
       Student student= entityManager.find(Student.class, id);
       if(student!=null){
           return student.toString();
       }
       else {
           return "Student not found!!!";
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
