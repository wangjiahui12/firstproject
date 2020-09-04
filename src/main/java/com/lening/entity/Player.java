package com.lening.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Player implements Serializable {
    private Long id;
    private String name;
    private Long age;
    private String birthday;
    private Long sid;
    private String sname;
    private Long tid;
    private String tname;
}
