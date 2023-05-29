package org.skillF.university;

import org.apache.commons.lang3.StringUtils;

public class UniversityFullNameComparator implements SortByUniversity<University> {
    @Override
    public int compare(University o1, University o2) {
        return StringUtils.compare(o1.getFullName(),o2.getFullName());
    }
}
