package org.skillF;
import org.skillF.student.*;
import org.skillF.university.*;

public class ComparatorUtils {
    public static SortByUniversity getUniversityComparator(UniversityOption u){
        UniversityOption universityOption = UniversityOption.valueOf(String.valueOf(u));
        SortByUniversity obj = null;
        switch (universityOption){
            case ID:
                obj = new UniversityIdComparator();
                return obj;
            case FULLNAME:
                obj =  new UniversityFullNameComparator();
                return obj;
            case SHORTNAME:
                obj = new UniversityShortNameComparator();
                return obj;
            case YEARFOUNDATION:
                obj = new UniversityYearFoundationComp();
        }
        return obj;
    }

    public static SortByStudent getStudentComparator(StudentOption u){
        StudentOption studentOption = StudentOption.valueOf(String.valueOf(u));
        SortByStudent obj1 = null;
        switch (studentOption){
            case AVGEXAMSCORE:
                obj1 = new StudentAvgExamScoreComparator();
                return obj1;
            case FULLNAME:
                obj1 =  new StudentFullNameComparator();
                return obj1;
            case UNIVERSITYID:
                obj1 = new StudentUniversityIdComparator();
                return obj1;
            case CURRENTCOURSE:
                obj1 = new StudentCurrentCourseComparator();
        }
        return obj1;
    }
}
