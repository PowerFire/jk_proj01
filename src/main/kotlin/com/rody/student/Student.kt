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
        print(name+"\t"+english+"\t"+math+"" +
                "\t"+ getAverage() +"\t"+ if (getAverage()>=60) "PASS" else "FAILED")
        println("\t"+grading())
    }

    fun grading()= when(getAverage()){
                    in 90..100 -> 'A'
                    in 80..89  -> 'B'
                    in 70..79  -> 'C'
                    in 60..69  -> 'D'
                    else -> 'F'
                }
    /*
    fun grading():Char {
        var grading: Char ='F'
        grading= when(getAverage()){
                    in 90..100 -> 'A'
                    in 80..89  -> 'B'
                    in 70..79  -> 'C'
                    in 60..69  -> 'D'
                    else -> 'F'
                 }
        return grading;
    }

     */

    fun highest()=if(english>math) {
                    println("English")
                    english
                } else {
                    println("Math")
                    math
                }
    /*
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

     */

    fun getAverage()=(english+math)/2
    /*
    fun getAverage():Int {
        return (english+math)/2

    }

     */

}