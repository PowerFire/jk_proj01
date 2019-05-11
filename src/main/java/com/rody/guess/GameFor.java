package com.rody.guess;

import java.util.Scanner;

public class GameFor {
    public static void main(String[] args) {
        for(int i=0; i<=3; i++){
            System.out.println(i);
        }
        Scanner scanner= new Scanner(System.in);
        int number= 0;
        for (int i=0; i<=5; i++){
            System.out.println("Please enter a number");
            number= scanner.nextInt();
            System.out.println("Number:"+i+number);
            if(number==-1){
                break;
            }
        }

        System.out.println("End");

    }
}
