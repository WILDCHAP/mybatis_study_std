package com.wildchap.dao;

import com.wildchap.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherMapper {
    List<Teacher> getAllTeacher();
    List<Teacher> getTeacherById(@Param("tid") int tid);
}
