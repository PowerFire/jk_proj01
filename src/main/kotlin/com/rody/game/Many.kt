package com.rody.game

fun main(args: Array<String>) {
    val list= listOf(5,1,7,8)
    println(list)

    val scores= listOf(68,88,78,98)
    for(score in scores){
        println(score)
    }
    println(list.get(3))


    var mutable_list= mutableListOf(5,1,7,8)
    mutable_list.add(6)
    println(mutable_list)


}