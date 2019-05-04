package com.rody;

public class Person {
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

    // constructor
    public Person() {
    }

    public  Person( float weight, float hight) {
        this.weight=weight;
        this.hight=hight;
    }

    public  Person(String name,  float weight, float hight) {
        this(weight,hight);
        this.name= name;
        /*
        this.weight=weight;
        this.hight=hight;
         */

    }
}
