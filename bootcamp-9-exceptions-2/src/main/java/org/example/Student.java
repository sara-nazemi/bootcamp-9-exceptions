package org.example;

public class Student {

    public void averageGrade(Integer grade) throws GradeOutOfRangeException {
        if (!(grade > 0 && grade <= 100)) {
            throw new GradeOutOfRangeException("grade is outside 0-100");
        }
        System.out.println("grade is set");
    }
}
