package com.rody.student;

import java.util.Scanner;

public class SchoolRunner {
    public static void main(String[] args) {
        System.out.print("Please sudent's name:");

        Scanner scanner=new Scanner(System.in);
        String name = scanner.next();

        System.out.print("Please sudent's enlish:");
        int english=scanner.nextInt();

        System.out.print("Please sudent's math:");
        int math=scanner.nextInt();

        Student stu= new Student(name, math, english);
        stu.print();
    }
}
