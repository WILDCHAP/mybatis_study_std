package com.wildchap.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Student {
    private int sid;
    private String name;
    private Teacher teacher;
}
