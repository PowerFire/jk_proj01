package com.rody;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello world");
//        new Person().hello();
        Person person= new Person();
        person.hello();
        person.hight= 1.7f;
        person.weight= 66.5f;
        System.out.println("person bmi"+person.bim());

        Person person2= new Person(66.5f, 1.7f);
        System.out.println("person2 bmi"+person2.bim());

        Person person3= new Person("Rody",66.5f, 1.7f);
        System.out.println("person3 name:"+person3.name+" bmi"+person3.bim());

        /*
        *   short   16 bits
        *   int     32 bits ==> Integer     ==>Wrapper class
        *   long    64 bits
        *   char    16 bits ==> Character   ==>Wrapper class
        *   byte    8  bits
        *   float   32 bits ==> Float       ==>Wrapper class
        *   double  64 bits ==> Double      ==>Wrapper class
        *   boolean         ==> Boolean     ==>Wrapper class
        *   String  class                    ==> Reference data type
        */
        int age= 19; // <=== zone variable



    }
}
