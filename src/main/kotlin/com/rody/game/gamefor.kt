package com.rody.game

import java.util.*

fun main(args: Array<String>) {
    val scanner= Scanner(System.`in`)
    var number=0;
    val secret_number= Random().nextInt(10)+1
    println(secret_number)
    for( i in 1..4){
        print("Please enter a number(${i}/4)");
        number= scanner.nextInt()
        println("第${i}次 $number")

        if (number==secret_number){
            println("great")
            break;
        }
        else if(number > secret_number) {
            println("lower")
        }
        else {
            println("higher")
        }
    }
}