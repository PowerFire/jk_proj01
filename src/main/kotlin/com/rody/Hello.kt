package com.rody

fun main() {
//    println("Hellow Kotlin")
//    Human().hello()
    // val --> 定義完物件後不能再改變
    // var --> 定義完後可以在改變
    val human= Human()
    human.hello()
}

class Human {
    fun hello(){
        println("Hello Kotlin by Human")
    }
}