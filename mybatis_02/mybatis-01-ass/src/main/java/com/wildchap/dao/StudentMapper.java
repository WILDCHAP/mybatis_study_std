package com.wildchap.dao;

import com.wildchap.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {
    List<Student> selectAllStudent();
    Student selectStudentById(@Param("sid") int sid);
}
