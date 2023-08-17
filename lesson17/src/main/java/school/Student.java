package school;

//import comparators.SubjectComparatorByHours;
//import comparators.SubjectComparatorByName;

import comparators.SubjectComparatorByHours;
import comparators.SubjectComparatorByName;
import wrapper.IntegerWrapper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student {

    private String name;
    private List<Subject> subjectList;

    public Student(String name, List<Subject> subjectList) {
        this.name = name;
        this.subjectList = subjectList;
    }

    public String getName() {
        return name;
    }


    public List<String> sortSubjectName() {
        List<String> result = new ArrayList<>();
        for (Subject s : subjectList) {
            result.add(s.getName());
        }
        Collections.sort(result);
        return result;
    }

    public List<Subject> sortSubjectbyHours() {
        List<Subject> subjects = new ArrayList<>(subjectList);
        Collections.sort(subjects, new SubjectComparatorByHours());
        return subjects;
    }

    public List<Subject> sortSubjectbyName() {
        List<Subject> subjects = new ArrayList<>(subjectList);
        Collections.sort(subjects, new SubjectComparatorByName());
        return subjects;
    }
    public int getHours(){
        List<IntegerWrapper> hours = new ArrayList();
        for (Subject s : subjectList) {
            hours.add(new IntegerWrapper(s.getHours()));
        }
        int summ = 0;
        for (IntegerWrapper integerWrapper : hours){
            summ += integerWrapper.getValue();
        }
         return summ;

    }
}