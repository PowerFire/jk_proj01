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
        System.out.print(name+"\t"+math+"\t"+english+
                "\t"+ getAverage()+ "\t"+((getAverage() > 60) ? "PASS" :"Failed"));

        char grading='F';
        switch (getAverage()/10) {
            case 10:
            case 9:
                grading='A';
                break;
            case 8:
                grading='B';
                break;
            case 7:
                grading='C';
                break;
            case 6:
                grading='D';
                break;
            default:
                break;

        }
        System.out.println("\t"+ grading);
        /*
        if (getAverage()>=60){
            System.out.println("\tPASS");
        }
        else {
            System.out.println("\tFailed");
        }
         */
    }

    public int highest(){
        /*
        int max=0;
        if (english > math) {
            max=english;
        }
        else {
            max= math;
        }
        return max;
         */
        return (english > math) ? english : math ;
    }

    public int getAverage() {
        return (english+math)/2;
    }
}
