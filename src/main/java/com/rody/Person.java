package com.rody;

public class Person {
    // === 屬性
    String name;
    float weight;
    float hight;
    public float bim() {
        float bmi= weight/(hight*hight);
        return  bmi;
    }
    public void hello() {
        System.out.println("Hello Wrold By Person");
    }
}
