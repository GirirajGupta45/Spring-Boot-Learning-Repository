package com.gaurav.student_dao;

import com.gaurav.entities.Student;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface StudentDAO {
    public String save(Student student);
    public String findById(int id);
    public String deleteById(int id);
    public String updateStudent(@RequestBody Student student);
}
