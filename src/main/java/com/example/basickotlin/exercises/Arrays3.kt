package com.example.basickotlin.exercises

fun main(){
    var num = intArrayOf(3, 7, 1, 9)
    var i: Int = 0
    var sum: Int = 0;
    while(i<4){
        sum = sum + num[i]
        i++
    }
    println(sum)
}