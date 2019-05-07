package com.rody.student;

import java.util.Scanner;

public class SchoolRunner {
    public static void main(String[] args) {
        //userInput();

        Student stu= new Student("Rody", 80, 50);
        stu.print();
        System.out.println("High score:"+stu.highest());
    }

    private static void userInput() {
        System.out.print("Please sudent's name:");

        Scanner scanner=new Scanner(System.in);
        String name = scanner.next();

        System.out.print("Please sudent's enlish:");
        int english=scanner.nextInt();

        System.out.print("Please sudent's math:");
        int math=scanner.nextInt();

        Student stu= new Student(name, math, english);
        stu.print();

        System.out.println("High score:"+stu.highest());
    }
}
