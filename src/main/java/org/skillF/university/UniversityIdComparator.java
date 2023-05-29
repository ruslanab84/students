package org.skillF.university;

import org.apache.commons.lang3.StringUtils;

import java.util.Comparator;

public class UniversityIdComparator implements SortByUniversity<University> {
    @Override
    public int compare(University o1, University o2) {

        return StringUtils.compare(o1.getId(),o2.getId());
    }
}
