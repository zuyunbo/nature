package com.example.cms.dao;

import com.example.cms.bean.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentMapper extends CrudRepository<Student,String> {}

