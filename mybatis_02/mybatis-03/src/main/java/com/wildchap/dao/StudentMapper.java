package com.wildchap.dao;

import com.wildchap.pojo.Student;

import java.util.List;
import java.util.Map;

public interface StudentMapper {
    List<Student> selectStudent(Map map);
    int updateStudent(Map map);
}
