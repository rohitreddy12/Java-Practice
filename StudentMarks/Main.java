package StudentMarks;

import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Students s1 = new Students("Rohit",1,Arrays.asList(new Subject("Maths",7),new Subject("Science",8),new Subject("Social",9)));
        
        System.out.println(s1.updateMarksBySubject("Maths",15 ));;
        
        s1.sortSubjectByMarksDesc();
        System.out.println(s1.getStudentMarks().toString());
    }
}
