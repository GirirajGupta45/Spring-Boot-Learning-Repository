package com.gaurav.controller;

import com.gaurav.dao.StudentDAO;
import com.gaurav.dao.StudentDAOImpl;
import com.gaurav.entity.Student;
import com.gaurav.exception.StudentErrorResponse;
import com.gaurav.exception.StudentNotFoundException;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentControllerDemo {
    private StudentDAO studentDAO;
    public StudentControllerDemo(StudentDAOImpl studentDAO) {
        this.studentDAO = studentDAO;
    }
    @PostConstruct
    public void init() {
        System.out.println("StudentControllerDemo CREATED");
    }

    @GetMapping("/find-student/{id}")
    public Student findStudent(@PathVariable int id) {
        return studentDAO.findById(id);
    }

    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException e){
        StudentErrorResponse error = new StudentErrorResponse();
        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setMessage(e.getMessage());
        error.setTimestamp(System.currentTimeMillis());
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }
}
