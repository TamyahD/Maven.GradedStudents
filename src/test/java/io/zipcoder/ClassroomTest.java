package io.zipcoder;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static junit.framework.Assert.assertEquals;

public class ClassroomTest {
    @Test
    public void getAverageExamScore() {
        // : Given
        Double[] s1Scores = { 100.0, 150.0 };
        Double[] s2Scores = { 225.0, 25.0 };

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);

        Student[] students = {s1,s2};
        Classroom classroom = new Classroom(students);

        double expected = 125.0;
        // When
        double actual = classroom.getAverageExamScore();

        // Then
        System.out.println(actual);
        assertEquals(expected, actual);
    }

    @Test
    public void addStudent() {
        // : Given
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student("Leon", "Hunter", examScores);

        // When
        Student[] preEnrollment = classroom.getStudents();
        classroom.addStudent(student);
        Student[] postEnrollment = classroom.getStudents();

        // Then
        String preEnrollmentAsString = Arrays.toString(preEnrollment);
        String postEnrollmentAsString = Arrays.toString(postEnrollment);

        System.out.println("===========================");
        System.out.println(preEnrollmentAsString);
        System.out.println("===========================");
        System.out.println(postEnrollmentAsString);
    }

    @Test
    public void removeStudent() {
        //Given

        //When

        //Then
//        Assert.assertNotEquals(1,count);
    }
}
