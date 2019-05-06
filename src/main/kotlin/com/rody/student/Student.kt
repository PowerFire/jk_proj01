package com.rody.student

import java.util.*

fun main() {
    val scanner= Scanner(System.`in`)
    print("Please sudent's name:")
    var name=scanner.next()

    print("Please sudent's enlish:")
    var english=scanner.nextInt();

    print("Please sudent's math:")
    var math=scanner.nextInt();

    val stu= Student_kt(name,english,math)
    stu.print()
}

class Student_kt(var name: String, var english:Int, var math:Int) {
    fun print() {
        println(name+"\t"+english+"\t"+math+"" +
                "\t"+ (english+math)/2)
    }

}