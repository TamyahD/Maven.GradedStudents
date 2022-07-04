package io.zipcoder;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

/* 1.0 create student class */
public class Student {
    /* 1.1 define instance vars */
    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;


    public Student() {
        new Student();
    }

    /*
    1.2 define student constructor
    takes string, string & double[]
    */
    public Student(String fName, String lName, Double[] testScores) {
        this.firstName = fName;
        this.lastName = lName;
        this.examScores = new ArrayList(Arrays.asList(testScores));
    }


    /*
    1.3 getter/setters for instance vars
    NO setters for ArrayList ->examScores
    */
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
        int examsTaken = 0;
        for (Double score : examScores) {
            examsTaken = examScores.size();
        }
        return examsTaken; //TODO maybe fix
    }



    public String getExamScores() {
        /* string to store exam score value(s) */
        String examScore = "";
        /* int var to count number of exams */
//        int counter = 0;
//        DecimalFormat df = new DecimalFormat("#.##");

        /*
        for each to iterate through arraylist &
        access double(type) scores
        */
//        examScore += "Exam Scores:";
        for (Double score : examScores) {
//            String.valueOf(score).replaceFirst("\\.0+$", "");
            examScore += String.valueOf(score).replaceFirst
                    ("\\.0+$", "") + "\n";
            ;
/*
            counter++;
            examScore += "\n\tExam " +counter +
                    " -> " + df.format(score);
*/
        }
        return examScore;
    }

    public void addExamScore(Double examScore) {
//        String.valueOf(examScore).replaceFirst
//                ("\\.0+$", "");
//        DecimalFormat df = new DecimalFormat("0.#");
//        String score = "";
//        score += df.format(examScore);
//        int counter = 0;
//        String res = "";
//        for (Double score : examScores) {
//            counter++;
        examScores.add(examScore);

//        }
//        res += getExamScores();
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
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.print("Student Name: " + this.firstName + " " + this.lastName +
                "\nAverage Score: " +
                String.format("%.0f", getAverageExamScore()) +
                "\nExam Scores:\n");

        String res = "";
        for (int i = 0; i < examScores.size(); i++) {
            res += ("\tExam " + (i + 1) + " -> " +
                    String.valueOf(examScores.get(i)).replaceFirst
                            ("\\.0+$", "") + "\n");
        }
        return res;
    }
}
