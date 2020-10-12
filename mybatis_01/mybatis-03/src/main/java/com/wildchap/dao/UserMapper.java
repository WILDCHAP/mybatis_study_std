package com.wildchap.dao;

import com.wildchap.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //根据姓名模糊查询
    List<User> searchUserByName(Map<String, Object> map);
}
