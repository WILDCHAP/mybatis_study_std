package com.wildchap.dao;

import com.wildchap.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> searchUsersByName(Map<String, Object> map);
}
