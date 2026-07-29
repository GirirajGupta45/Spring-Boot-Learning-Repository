package com.gaurav.controllers;

import com.gaurav.entities.Student;
import com.gaurav.student_dao.StudentDAO;
import com.gaurav.student_dao.StudentDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student-tracker")
public class StudentController {
    private StudentDAO studentDAOImpl;

    @Autowired
    public StudentController(StudentDAOImpl studentDAOImpl) {
        this.studentDAOImpl = studentDAOImpl;
    }


    @PostMapping("/student-details")
    public void studentValues(@RequestBody Student student) {
        studentDAOImpl.save(student);
    }
}

