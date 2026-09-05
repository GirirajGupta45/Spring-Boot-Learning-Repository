package com.gaurav.dao;

import com.gaurav.entity.Student;
import org.springframework.web.bind.annotation.RequestBody;

public interface StudentDAO {
    public String save(Student student);
    public Student findById(int id);
    public String deleteById(int id);
    public String updateStudent(@RequestBody Student student);
}
