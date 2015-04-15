package com.synisys.design_patterns.strategy;

import com.synisys.design_patterns.strategy.entity.Student;

import java.util.List;

/**
 * Created by haykanush.torchyan on 4/15/2015.
 */
public class Sorter {

    private static final Sorter instance = new Sorter();

    private Sorter(){
    }

    public static Sorter getInstance(){
        return instance;
    }


    public void sort(List<Student> students, SortStrategy strategy){
        Student studentI;
        Student studentJ;
        Student buffer;
        for(int i = 0; i < students.size(); i++){
            studentI = students.get(i);
            for(int j = i+1; j < students.size(); j++) {
                studentJ = students.get(j);
                if(strategy.compare(studentI, studentJ)>0){
                    buffer = studentI;
                    students.set(i, studentJ);
                    students.set(j, buffer);
                    studentI = studentJ;
                }
            }
        }
    }
}
