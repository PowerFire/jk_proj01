package com.rody

fun main(args: Array<String>) {
//    println("Hellow Kotlin")
//    Human().hello()

    val human= Human(66.5f,1.7f)
    //human.hello()
    println(human.bmi())
    // Kotlin 沒有 基本資料型態, 只有物件的相關型態 Ex: Int, Short, Double, Float, Long
    // val --> 定義完物件後不能再改變
    // var \--> 定義完後可以在改變
    // val 名稱:型態=值
    val age : Int =19; //ot val age=19 <==Kotlin 會自己推斷型態
    var name:String
    name="Rody"

    val score=88
    println(score>60)

    val c:Char='A'
    // error println(c>60)
    println(c.toInt()>60)
}

// 主要建構子
class Human(var weight: Float, var height: Float,var name:String="") {

    init {
        println("test $weight")
    }
    // 次要建構子
    //constructor(name:String, weight: Float,height: Float):this(weight,height)

    fun bmi():Float {
        val bmi=weight/(height*height)
        return bmi
    }
    fun hello(){
        println("Hello Kotlin by Human")
    }
}