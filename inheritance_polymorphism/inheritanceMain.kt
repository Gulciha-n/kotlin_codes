package com.example.kotlin.inheritance_polymorphism

fun main(){

    val car1 = Car("Red","Otomotic","123ABC")

    println(car1.color)
    println(car1.gear)
    println(car1.plate)

    val nissan1 = Nissan("White","Otomatic","568BND",2023)

    println(nissan1.model)
    println(nissan1.plate)
    println(nissan1.gear)
    println(nissan1.color)
    println(nissan1.model)

}