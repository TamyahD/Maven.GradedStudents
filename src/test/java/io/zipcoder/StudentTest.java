package io.zipcoder;

import junit.framework.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void testGetExamScores() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 95.0, 123.0, 96.0 };
        Student student = new Student(firstName, lastName, examScores);

        String expected= (
                "Exam 1-->100.0\n" +
                "Exam 2-->95.0\n" +
                "Exam 3-->123.0\n" +
                "Exam 4-->96.0\n");
        System.out.println("Student expected score:\n"+expected);
        // When
        String actual = student.getExamScores();

        // Then
        System.out.println("Actual:\n"+actual);
        Assert.assertEquals(expected ,actual);
    }

    @Test
    public void addExamScore() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { };
        Student student = new Student(firstName, lastName, examScores);

        // When
        student.addExamScore(100.0);
        String actual = student.getExamScores();

        // Then
        System.out.println(actual);
    }

    @Test
    public void setExamScore() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0 };
        Student student = new Student(firstName, lastName, examScores);

        // When
        student.setExamScore(1, 150.0);
        String output = student.getExamScores();

        // Then
        System.out.println(output);
    }
}