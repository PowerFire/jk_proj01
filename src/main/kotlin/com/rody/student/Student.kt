package com.rody.student

fun main() {
    val stu= Student_kt("Rody",66,88)
    stu.print()
}

class Student_kt(var name: String, var english:Int, var math:Int) {
    fun print() {
        println(name+"\t"+english+"\t"+math+"" +
                "\t"+ (english+math)/2)
    }

}