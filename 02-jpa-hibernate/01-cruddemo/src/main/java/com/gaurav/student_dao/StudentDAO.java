package com.gaurav.student_dao;

import com.gaurav.entities.Student;

import java.util.List;

public interface StudentDAO {
    public void save(Student student);
    public String findById(int id);

}
