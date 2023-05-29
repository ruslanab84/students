package org.skillF.student;

public enum StudentOption {
    AVGEXAMSCORE("StudentAvgExamScoreComparator"),
    CURRENTCOURSE("StudentCurrentCourseComparator"),
    FULLNAME("StudentFullNameComparator"),
    UNIVERSITYID("StudentUniversityIdComparator");
    final String cstudentCmparatorName;

    private StudentOption(String comparatorName) {
        this.cstudentCmparatorName = comparatorName;
    }

    public String getComparatorName() {
        return cstudentCmparatorName;
    }
}
