package com.setter;

public class Student {

    private String studentName;
    private String studentCourse;
    private int studentAge;  

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentCourse() {
        return studentCourse;
    }

    public void setStudentCourse(String studentCourse) {
        this.studentCourse = studentCourse;
    }

    public int getStudentAge() {   
        return studentAge;
    }

    public void setStudentAge(int studentAge) {  
        this.studentAge = studentAge;
    }

    @Override
    public String toString() {
        return "Student [studentName=" + studentName + ", studentCourse=" + studentCourse + ", studentAge=" + studentAge + "]";
    }
}
