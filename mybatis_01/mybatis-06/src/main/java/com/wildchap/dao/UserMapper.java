package com.wildchap.dao;

import com.wildchap.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    //插入一个用户
    @Insert("insert into mybatis.user(id, name, pwd) values(#{id}, #{name}, #{pwd})")
    int insertIntoUser(User user);

    //删除一个用户
    @Delete("delete from mybatis.user where id = #{id}")
    int deleteFromUser(@Param("id") int id);
}
