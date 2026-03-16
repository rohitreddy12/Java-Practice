package StudentMarks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Subject{
    String subject;
    int marks;
    
    public Subject(String subject, int marks) {
        this.subject = subject;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Subject [subject=" + subject + ", marks=" + marks + "]";
    }

    
    
}

interface StudentMethods{
    public List<Subject> sortSubjectByMarksDesc();
    public List<Subject> updateMarksBySubject(String sub, int marks);
}

public class Students implements StudentMethods {
    private String name;
    private int id;
    private List<Subject> studentMarks = new ArrayList<Subject>();

    Students(){}
    public Students(String name, int id, List<Subject> studentMarks) {
        this.name = name;
        this.id = id;
        this.studentMarks = studentMarks;
    }
    

    public List<Subject> getStudentMarks() {
        return studentMarks;
    }

    @Override
    public List<Subject> sortSubjectByMarksDesc() {
        Comparator sortByMarks = new Comparator<Subject>() {

            @Override
            public int compare(Subject o1, Subject o2) {
                return o1.marks > o2.marks ? -1 : 1; 
            }
            
        };

       Collections.sort(this.studentMarks, sortByMarks);
       return this.studentMarks;
    }

    @Override
    public List<Subject> updateMarksBySubject(String sub, int marks) {
        // this.studentMarks.forEach(subject -> {
        //     if(subject.subject.equals(sub)) subject.marks = marks;
        // });
        // return this.studentMarks.stream().map(subject -> {
        //     if(subject.subject.equals(sub)){
        //         subject.marks = marks;
        //     }
        // }).collect(Collectors.toList());
        this.studentMarks = this.studentMarks.stream()
            .peek(subject -> {
                if(subject.subject.equals(sub)) subject.marks = marks;
            })
            .collect(Collectors.toList());
        return this.studentMarks;
    }
    }
    

