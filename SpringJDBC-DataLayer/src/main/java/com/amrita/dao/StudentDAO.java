package com.amrita.dao;

import com.amrita.Entity.Student;
import java.util.List;

public interface StudentDAO {
    int insert(Student student);
    List<Student> getAllStudents();
}