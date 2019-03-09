package com.letcode;

/**
 * create by murong
 * create in
 */
public class Teacher {

    private Student student;
    String sayHello(){
        return "hell i'm a teacher";
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }


}
