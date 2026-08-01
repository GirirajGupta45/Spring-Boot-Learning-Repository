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
    public String studentValues(@RequestBody Student student) {
        return studentDAOImpl.save(student);
    }

    @GetMapping("/get-student-details/{id}")
    String getStudentDetails(@PathVariable int id){
        return studentDAOImpl.findById(id);
    }

    @PostMapping("/remove-student/{id}")
    public String deleteStudent(@PathVariable int id){
        return studentDAOImpl.deleteById(id);
    }

    @PutMapping("/update-Student-details")
    public String updateStudentDetails(@RequestBody Student student){
      return studentDAOImpl.updateStudent(student);
    }

}

