package com.poc.list;

public class Student {

       private  int rollno;
        private String name;
        private int age;

    public Student() {
    }

    Student(int rollno, String name, int age){
            this.rollno=rollno;
            this.name=name;
            this.age=age;
        }

    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
}
