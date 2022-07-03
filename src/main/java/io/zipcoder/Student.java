package io.zipcoder;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Student {
    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores = new ArrayList<>();


    public Student() {

    }

    public Student(String fName, String lName, Double[] testScores) {
        this.firstName = fName;
        this.lastName = lName;
        this.examScores = new ArrayList(Arrays.asList(testScores));
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNumberOfExamsTaken() {
        return 0; //TODO
    }


    public String getExamScores() {
        /* string to store exam score value(s) */
        String examScore = "";
        /* int var to count number of exams */
        int counter = 0;
        DecimalFormat df = new DecimalFormat("#.##");

        /*
        for each to iterate through arraylist &
        access double(type) scores
        */
        for (Double score : examScores) {
            counter++;
            examScore += "\n\tExam " +counter +
                    " -> " + df.format(score);
        }
        return examScore;
    }

    public void addExamScore(double examScore) {
        examScores.add(examScore);
    }

    public void setExamScore(int examNumber, double newScore) {
        examScores.set(examNumber-1, newScore);
    }

    public double getAverageExamScore() {
        double sum = 0.0;
        for (double score : examScores) {
            sum += score;
        }
        return (sum/examScores.size());
    }


    @Override
    public String toString() {
        return "Student Name: " + this.firstName + " " +this.lastName +
                "\nAverage Score: " +
                String.format("%.0f",getAverageExamScore()) +
                "\nExam Scores:" +
                getExamScores();
    }
}
