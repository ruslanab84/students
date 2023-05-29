package org.skillF.student;
import org.skillF.student.Student;

import java.util.Comparator;

public class StudentCurrentCourseComparator implements SortByStudent<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getCurrentCourseNumber()==o2.getCurrentCourseNumber()) {
            return 0;
        }
        if(o1.getCurrentCourseNumber() > o2.getCurrentCourseNumber()){
            return 1;
        }
        else
            return -1;
    }
}
