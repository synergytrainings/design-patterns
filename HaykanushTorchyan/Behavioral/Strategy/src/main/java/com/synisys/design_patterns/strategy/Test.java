package com.synisys.design_patterns.strategy;

import com.synisys.design_patterns.strategy.entity.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by haykanush.torchyan on 4/15/2015.
 */
public class Test {

    public static void main(String... args){
        // Two contexts following different strategies
        List<Student> students = new ArrayList<Student>();
        students.add(new Student(24, "Mary Blake"));
        students.add(new Student(10, "John Watson"));
        students.add(new Student(16, "Katerine Blunsh"));
        students.add(new Student(9, "Emily Crowford"));
        students.add(new Student(21, "Mikael Jackson"));
        students.add(new Student(8, "Will Smith"));
        Sorter studentRecordsSorter = Sorter.getInstance();

        System.out.println("Sorted by Name");
        studentRecordsSorter.sort(students, SortByName.getInstance());
        printList(students);

        System.out.println("\nSorted by ID");
        studentRecordsSorter.sort(students, SortById.getInstance());
        printList(students);
    }

    public static void printList(List<Student> students){
        for(Student student : students){
            System.out.println(student.getId() + " - " + student.getName());
        }
    }
}
