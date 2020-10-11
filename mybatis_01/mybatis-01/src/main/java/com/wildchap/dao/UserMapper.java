package com.wildchap.dao;

import java.util.List;

//UserMapper即是以前的Dao
public interface UserMapper {
    //查询所有用户
    List<User> getUserList();
    //查询指定用户
    User getUserById(int id);
}
