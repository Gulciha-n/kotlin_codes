package com.example.kotlin.hashset

fun main(){

    val fruits = setOf("Banana","cherry","Watermelon")

    val cities = mutableSetOf<String>("İstanbul","Bursa","Ankara")

    val numbers = HashSet<Int>()

    numbers.add(20)
    numbers.add(30)
    numbers.add(40)

    println(numbers.toString())

    println(numbers.elementAt(1))
    println(numbers.size)
    println(numbers.count())
    println(numbers.isEmpty())

    println(numbers.contains(20))


    for (s in numbers){
        println(s)
    }

    println("********************")
    for((index,number) in numbers.withIndex()){
        println("$index -> $number")

    }

    numbers.remove(20)
    println(numbers.toString())

    numbers.clear()
    println(numbers.toString())
}