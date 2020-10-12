package com.wildchap.dao;

import com.wildchap.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //模糊查询某姓名用户
    List<User> searchUserByName(Map<String, Object> map);
}
