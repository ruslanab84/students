package org.skillF.university;

public enum UniversityOption {
    FULLNAME("UniversityFullNameComparator"),
    ID("UniversityIdComparator"),
    SHORTNAME("UniversityShortNameComparator"),
    YEARFOUNDATION("UniversityYearFoundationComp");
    final String universityComparatorName;

    private UniversityOption(String comparatorName) {
        this.universityComparatorName = comparatorName;
    }

    public String getComparatorName() {
        return universityComparatorName;
    }
}
