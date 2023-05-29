package org.skillF;

import org.skillF.student.SortByStudent;
import org.skillF.student.Student;
import org.skillF.student.StudentOption;
import org.skillF.university.University;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<SortByStudent> studentList = new ArrayList<>();
        studentList.add(ComparatorUtils.getStudentComparator(StudentOption.AVGEXAMSCORE));
        studentList.add(ComparatorUtils.getStudentComparator(StudentOption.CURRENTCOURSE));
        studentList.add(ComparatorUtils.getStudentComparator(StudentOption.FULLNAME));
        studentList.add(ComparatorUtils.getStudentComparator(StudentOption.UNIVERSITYID));

        Stream<SortByStudent> stream = studentList.stream();
        stream.forEach(System.out::println);
    }
}