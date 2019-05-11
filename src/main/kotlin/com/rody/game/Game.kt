package com.rody.game

import java.util.*

fun main() {
    val scanner= Scanner(System.`in`);
    val secrer_number=Random().nextInt(10)+1;
    var number=0;

    println(secrer_number)
    while(number!=secrer_number) {
        print("Please enter a number:")
//        number= scanner.nextInt()
        number= readLine()!!.toInt()
        if(number > secrer_number){
            println("lower")
        }
        else if(number < secrer_number){
            println("higher")
        }
        else {
            println("Great $number")
        }

    }


}