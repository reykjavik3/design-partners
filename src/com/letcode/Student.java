package com.letcode;

/**
 * create by murong
 * create in 2019-3-8
 */
public class Student {
    private Teacher teacher;

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Student{" +
                "teacher=" + teacher.toString() +
                '}';
    }
}
