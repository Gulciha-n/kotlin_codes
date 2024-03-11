package com.example.kotlin.ArrayList

import kotlinx.coroutines.processNextEventInCurrentThread

fun main(){

    val numbers = ArrayList<Int>()

    numbers.add(1)
    numbers.add(2)
    numbers.add(3)
    numbers.add(4)
    numbers.add(5)

    for ((index,num) in numbers.withIndex()){

        val result = num*2

        numbers[index] = result

    }

    println(numbers)




}