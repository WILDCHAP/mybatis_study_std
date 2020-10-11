package com.wildchap.dao;

import lombok.Data;

//pojo实体类(利用@Data，省略get,set和构造)
@Data
public class User {
    private int id;
    private String name;
    private String pwd;
}
