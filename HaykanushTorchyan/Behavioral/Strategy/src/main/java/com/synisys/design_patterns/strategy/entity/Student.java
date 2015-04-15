package com.synisys.design_patterns.strategy.entity;

import java.util.List;

/**
 * Created by haykanush.torchyan on 4/15/2015.
 */
public class Student {

    private Integer id;
    private String name;

    public Student(Integer id, String name){
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
