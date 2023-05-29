package org.skillF;

public enum StudyProfile {
    IT("Информационные технологии"),
    MATH("Математика"),
    CHEMISTRY("Химия"),
    MEDICINE("Медицина");
    final String profileName;
    private StudyProfile(String profileName){
        this.profileName = profileName;
    }
}
