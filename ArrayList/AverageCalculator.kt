package com.example.kotlin.ArrayList

fun main(){

    val numbers = ArrayList<Int>()

    numbers.add(10)
    numbers.add(20)
    numbers.add(50)
    numbers.add(80)
    numbers.add(70)
    numbers.add(45)

    var sum =0

    for(i in numbers){
        sum += i
    }
    println("Average : ${sum/(numbers.size)}")
}
