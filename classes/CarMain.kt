package com.example.kotlin.classes

fun main(){
    val car1 = Car()
    car1.color = "White"
    car1.execute = false
    car1.speed = 80

    println(car1.color)
    println(car1.execute)
    println(car1.speed)

}