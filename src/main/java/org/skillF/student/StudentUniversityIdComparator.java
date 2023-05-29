package org.skillF.student;

import org.apache.commons.lang3.StringUtils;

import java.util.Comparator;

public class StudentUniversityIdComparator implements SortByStudent<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return StringUtils.compare(o1.getUniversityId(),o2.getUniversityId());
    }
}
