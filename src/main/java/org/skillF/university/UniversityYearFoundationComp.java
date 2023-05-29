package org.skillF.university;

import java.util.Comparator;

public class UniversityYearFoundationComp implements SortByUniversity<University> {
    @Override
    public int compare(University o1, University o2) {
        if (o1.getYearOfFoundation()==o2.getYearOfFoundation()) {
            return 0;
        }
        if(o1.getYearOfFoundation() > o2.getYearOfFoundation()){
            return 1;
        }
        else
            return -1;
    }
}
