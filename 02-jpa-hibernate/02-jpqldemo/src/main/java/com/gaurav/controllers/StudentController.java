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

    @PostMapping("/register-student")
    public String studentValues(@RequestBody Student student) {
        return studentDAOImpl.save(student);
    }

    @GetMapping("/get-student-details/{id}")
    String getStudentDetails(@PathVariable int id){
        return studentDAOImpl.findById(id);
    }

    @DeleteMapping("/remove-student/{id}")
    public String deleteStudent(@PathVariable int id){
        return studentDAOImpl.deleteById(id);
    }

    @PutMapping("/update-student-details")
    public String updateStudentDetails(@RequestBody Student student){
        return studentDAOImpl.updateStudent(student);
    }


    @GetMapping("/get-all-students")
    public List<Student> getAllStudents(){
        return studentDAOImpl.findAll();
    }

    @PostMapping("/register-all-students")
    public String registerAllStudents(@RequestBody List<Student> students){
        return studentDAOImpl.saveAll(students);
    }

    @GetMapping("get-all-students-of-course/{course}")
    public List<Student> getAllStudentsOfCourse(@PathVariable String course){
        return studentDAOImpl.findByCourse(course);
    }

}

