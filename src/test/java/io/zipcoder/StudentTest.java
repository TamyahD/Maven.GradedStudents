package io.zipcoder;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class StudentTest {
    String act = "actual".toUpperCase();

    @Test
    public void testGetExamScores() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 95.0, 123.0, 96.0 };
        Student student = new Student(firstName, lastName, examScores);

        String expected= (
                "Exam 1 -> 100\n" +
                "Exam 2 -> 95\n" +
                "Exam 3 -> 123\n" +
                "Exam 4 -> 96\n");
        System.out.println("Student expected score:\n"+expected);
        // When
        String actual = student.getExamScores();

        // Then
        System.out.println("Actual:\n"+actual);
        assertEquals(expected ,actual);
    }

    @Test
    public void testAddExamScore() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { };
        Student student = new Student(firstName, lastName, examScores);

        String expected = "Exam 1 -> " +100.0;
        // When
        student.addExamScore(100.0);
        String actual = student.getExamScores();

        // Then
        System.out.println(actual);
        assertEquals(expected ,actual);
    }

    @Test
    public void testSetExamScore() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0 };
        Student student = new Student(firstName, lastName, examScores);

        String expected = "Exam 1 -> "+150.0;
        // When
        student.setExamScore(1, 150.0);
        String actual = student.getExamScores();

        // Then
        System.out.println(actual);
        assertEquals(expected ,actual);
    }

    @Test
    public void testGetAverageExamScore() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student(firstName, lastName, examScores);

        Double expected = 125.0;
        // When
        Double actual = student.getAverageExamScore();

        // Then
        System.out.println(act+": " +actual);
        assertEquals(expected ,actual);
    }

    @Test
    public void testToString() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student(firstName, lastName, examScores);

        // When
        String output = student.toString();

        // Then
        System.out.println(output);
    }
}