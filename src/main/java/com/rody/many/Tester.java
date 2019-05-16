package com.rody.many;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        //arrayTest();

        ArrayList list= new ArrayList();
        list.add(5);
        list.add(3);
        list.add("add");
        list.add(true);
        System.out.println(list);

        int n1= (int)list.get(0);
        String s= (String) list.get(2);
        // Heterogeneity
        // 限定型態
        ArrayList<Integer> list2= new ArrayList();
        list.add(5);
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(1);

        System.out.println(list2.size());

        List<Integer> scores= Arrays.asList(78,68,90,88,100);
        for (int score: scores) {
            System.out.println(score);
        }
    }

    private static void arrayTest() {
        int[] numbers= new int[5];
        numbers[0]= 5;
        numbers[4]= 3;
        //numbers[5]= 7;

        int[] scores= {68, 88, 77, 99, 50};
        System.out.println("scores:"+scores);
        for (int n: scores) {
            System.out.println(n);
        }
    }
}
