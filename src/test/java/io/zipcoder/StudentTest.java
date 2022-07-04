package io.zipcoder;

import org.junit.Test;

import java.text.DecimalFormat;

import static junit.framework.Assert.assertEquals;

public class StudentTest {
    String act = "actual".toUpperCase();
    String expectedHeader = "Exam Scores:\n";

    @Test
    public void testGetExamScores() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 95.0, 123.0, 96.0 };
        Student student = new Student(firstName, lastName, examScores);

        String expected= (
                "Exam Scores:\n" +
                "\tExam 1 -> 100\n" +
                "\tExam 2 -> 95\n" +
                "\tExam 3 -> 123\n" +
                "\tExam 4 -> 96");
        // When
        String actual = student.getExamScores();

        // Then
        System.out.println(actual);
        assertEquals(expected ,actual);
    }

    @Test
    public void testAddExamScore() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { };
        Student student = new Student(firstName, lastName, examScores);
        DecimalFormat df = new DecimalFormat("#.##");

        String expectedHeader = ("Exam Scores:\n\tExam 1 -> ");
        Double expectedVal = 100.0;
        String expected = expectedHeader+expectedVal;
        // When
        student.addExamScore(expectedVal);
        String actual = student.getExamScores();

        // Then
        System.out.println(actual); //TODO: ONLY ISSUE IS DECIMAL 0
        System.out.println(expected);
        assertEquals(expected.toString(), actual);
    }

    @Test
    public void testSetExamScore() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0 };
        Student student = new Student(firstName, lastName, examScores);

        // When
        student.setExamScore(1, 150.0);
        String expected = expectedHeader +
                "\tExam "+student.getNumberOfExamsTaken() + " -> " +
                student.getExamScores();
        String actual = expectedHeader +
                "\tExam "+student.getNumberOfExamsTaken() + " -> " +
                student.getExamScores();

        // Then
        System.out.println(expected);
        assertEquals(expected,actual);
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
        System.out.println(actual);
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