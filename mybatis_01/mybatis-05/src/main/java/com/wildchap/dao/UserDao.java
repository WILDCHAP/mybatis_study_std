package com.wildchap.dao;

import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface UserDao {
    //插入数据
    int insertIntoUser(Map<String, Object> map);
    //删除数据
    int deleteFromUser(Map<String, Object> map);
    //修改数据
    int updateUser(Map<String, Object> map);
}
