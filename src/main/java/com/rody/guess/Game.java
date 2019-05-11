package com.rody.guess;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Random random= new Random();
        int secret_number=random.nextInt(10)+1;
        System.out.println(secret_number);

        Scanner scanner=new Scanner(System.in);
        int number=0;

        while(number != secret_number){
            System.out.println("Please enter a number:");
            number=scanner.nextInt();
            System.out.println(number);
            if (number < secret_number) {
                System.out.println("higher");
            }
            else if (number > secret_number) {
                System.out.println("lower");
            }
            else {
                System.out.println("great\t"+number);
            }
        }

        /*

        int i=0;
        do {
            System.out.println(i);
            i=i+1;
        }while(i<3);

         */

    }
}
