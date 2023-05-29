package org.skillF.student;

import org.skillF.student.Student;

import java.util.Comparator;

public class StudentAvgExamScoreComparator implements SortByStudent<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getAvgExamScore()==o2.getAvgExamScore()) {
            return 0;
        }
        if(o1.getAvgExamScore() > o2.getAvgExamScore()){
            return 1;
        }
        else
            return -1;
    }
}
