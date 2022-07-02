package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

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

        /*
        for each to iterate through arraylist &
        access double(type) scores
        */
        for (Double score : examScores) {
            counter++;
            examScore += "Exam " +counter + "-->" +
                    score +"\n";
        }
        return examScore.toString();
    }

    public void addExamScore(double examScore) {
        examScores.add(examScore);
    }


}
