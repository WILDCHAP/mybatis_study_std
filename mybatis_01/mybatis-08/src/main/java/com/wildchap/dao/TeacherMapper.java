package com.wildchap.dao;

import com.wildchap.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeacherMapper {
    @Select("select * from mybatis.teacher")
    List<Teacher> getAllTeacher();

    @Select("select * from mybatis.teacher where tid = #{tid}")
    Teacher getTeacherById(@Param("tid") int tid);
}
