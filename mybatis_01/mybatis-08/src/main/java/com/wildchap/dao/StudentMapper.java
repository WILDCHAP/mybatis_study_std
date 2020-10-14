package com.wildchap.dao;

import com.wildchap.pojo.Student;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentMapper {

    @Select("select * from mybatis.student")
    List<Student> getAllStudent();

    @Select("select * from mybatis.student where sid = #{id}")
    Student getStudentById(@Param("id") int id);

    List<Student> getStudentAndTeacher();
}
