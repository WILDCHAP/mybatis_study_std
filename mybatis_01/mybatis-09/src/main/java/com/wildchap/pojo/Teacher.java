package com.wildchap.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Teacher {
    private int tid;
    private String name;
    private List<Student> students;
}
