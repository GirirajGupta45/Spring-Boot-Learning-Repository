package com.gaurav.controllers;

import com.gaurav.entities.Student;
import com.gaurav.student_dao.StudentDAO;
import com.gaurav.student_dao.StudentDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student-tracker")
public class StudentController {
    private StudentDAO studentDAOImpl;

    @Autowired
    public StudentController(StudentDAOImpl studentDAOImpl) {
        this.studentDAOImpl = studentDAOImpl;
    }


    @PostMapping("/save-student")
    public void studentValues(@RequestBody Student student) {
        studentDAOImpl.save(student);
    }

    @GetMapping("/get-student-details/{id}")
    String getStudentDetails(@PathVariable int id){
        return studentDAOImpl.findById(id);
    }
}

