package main;

import school.Student;
import school.Subject;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Subject> subjectList = new ArrayList<>(); //
        subjectList.add(new Subject(12,"Math"));
        subjectList.add(new Subject(14,"History"));
        Student student = new Student("Володька",subjectList);

        System.out.println("Comparator Sort By Name: " + student.sortSubjectbyName());
        System.out.println("Comparator Sort By Hours: " + student.sortSubjectbyHours());
        System.out.println("---------------------------");
        System.out.println(student.getHours());
    }
}
