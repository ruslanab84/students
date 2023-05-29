package org.skillF.student;

import org.apache.commons.lang3.StringUtils;
import org.skillF.student.Student;

import java.util.Comparator;

public class StudentFullNameComparator implements SortByStudent<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return StringUtils.compare(o1.getFullName(),o2.getFullName());
    }
}
