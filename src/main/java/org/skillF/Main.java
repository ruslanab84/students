package org.skillF;

public class Main {
    public static void main(String[] args) {
        University university = new University("2","МГИМО","МГИМО",1900,StudyProfile.MATH);
        Student student = new Student("Ruslan Abdulov","2",3,90);
        System.out.println(university.toString());
        System.out.println(student.toString());
    }
}