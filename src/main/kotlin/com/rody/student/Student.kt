package com.kotlin.rody.student

import java.util.*

fun main() {
    //userInput();
    val stu = Student("Rody", 50, 90)
    stu.print()
    println("High score: ${stu.highest()}")
}

private fun userInput() {
    val scanner = Scanner(System.`in`)
    print("Please sudent's name:")
    var name = scanner.next()

    print("Please sudent's enlish:")
    var english = scanner.nextInt();

    print("Please sudent's math:")
    var math = scanner.nextInt();

    val stu = Student(name, english, math)
    stu.print()
}

class Student(var name: String, var english:Int, var math:Int) {
    fun print() {
        println(name+"\t"+english+"\t"+math+"" +
                "\t"+ (english+math)/2)
    }

    fun highest():Int{
        var max = if(english>math) {
            println("English")
            english
        } else {
            println("Math")
            math
        }
        return max
    }
}