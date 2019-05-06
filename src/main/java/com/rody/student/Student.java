package com.rody.student;

public class Student {
    String id;
    String name;
    int math;
    int english;


    public Student(String name, int math, int english) {
        this.name   = name;
        this.math   = math;
        this.english= english;
    }

    // alt +insert
    public Student(String id, String name, int math, int english) {
        this.id = id;
        this.name = name;
        this.math = math;
        this.english = english;
    }

    public void print() {
        System.out.println(name+"\t"+math+"\t"+english+
                "\t"+(english+math)/2);
    }


}
