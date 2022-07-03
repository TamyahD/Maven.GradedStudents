package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Classroom {
    Student[] students;



    public Classroom(int maxNumberOfStudents) {
        this.students = new Student[maxNumberOfStudents];
    }

    public Classroom(Student[] student) {
        this.students = student;
    }

    public Classroom() {
        this.students = new Student[30];
    }


    public Student[] getStudents() {
        return this.students;
    }

    public double getAverageExamScore() {
        int sum = 0;
        for (Student stu : students) {
            sum += stu.getAverageExamScore();
//            System.out.println(sum);
        }
        return sum/students.length;
    }

    public void addStudent(Student student) {
        ArrayList<Student> newEnroll = new ArrayList<>();
        int idx = 0;

        for (Student enrolling : students) {
                newEnroll.add(student);
        }
        students = new Student[]{student};
    }

    //TODO ****************************
    public void removeStudent(String firstName, String lastName) {
        int iF = Arrays.asList(students).indexOf(firstName);
        int iL = Arrays.asList(students).indexOf(lastName);
        System.out.print(iF+iL);
//        for (students[idx].getLastName(); i< students.length -1; idx++) {
//            students[idx] = students[idx +1];
//        }
    }


}
