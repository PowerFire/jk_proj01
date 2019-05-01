package com.rody

fun main() {
//    println("Hellow Kotlin")
//    Human().hello()

    val human= Human()
    human.hello()
    // Kotlin 沒有 基本資料型態, 只有物件的相關型態
    // val --> 定義完物件後不能再改變
    // var \--> 定義完後可以在改變
    // val 名稱:型態=值
    val age : Int =19; //ot val age=19 <==Kotlin 會自己推斷型態
    var name:String
    name="Rody"
}

class Human {
    fun hello(){
        println("Hello Kotlin by Human")
    }
}