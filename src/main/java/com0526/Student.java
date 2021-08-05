package com0526;

import com.google.common.base.Objects;

public class Student {
    private String name;
    private int age;
    private String course;


    public Student() {
        // TODO Auto-generated constructor stub
    }

    public Student(String name, int age) {
        super();
        this.name=name;
        this.age=age;

    }

    public Student(String name, int age, String course) {
        //为什么要这么写呢？
        //TODO
        super();
        this.name=name;
        this.age=age;
        this.course=course;
        // TODO Auto-generated constructor stub
    }



    public int getAge() {
        return age;
    }
    public String getCourse() {
        return course;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setCourse(String course) {
        this.course = course;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equal(name, student.name) &&
                Objects.equal(course, student.course);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name, age, course);
    }
}
