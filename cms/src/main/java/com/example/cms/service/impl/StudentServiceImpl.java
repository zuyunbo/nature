package com.example.cms.service.impl;



import com.example.cms.bean.Student;
import com.example.cms.dao.StudentMapper;
import com.example.cms.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentMapper studentMapper;

    @Override
    public void insertStudent(Student student) {
        studentMapper.save(student);
    }

    @Override
    public void deleteStudent(String id) {
        studentMapper.deleteById(id);
    }

    @Override
    public void updateStudent(Student student) {
        studentMapper.save(student);
    }

    @Override
    public List<Student> getStudent() {
        return (List<Student>) studentMapper.findAll();
    }

    @Override
    public Optional<Student> getStudentById(String id) {
        return studentMapper.findById(id);
    }
}
