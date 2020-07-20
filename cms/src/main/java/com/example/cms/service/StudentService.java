package com.example.cms.service;



import com.example.cms.bean.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    /**
     * 添加
     */
    void insertStudent(Student student);

    /**
     * 删除
     */
    void deleteStudent(String id);

    /**
     * 修改
     */
    void updateStudent(Student student);

    /**
     * 查询
     */
    List<Student> getStudent();

    /**
     * 查询单个
     */
    Optional<Student> getStudentById(String id);

}
