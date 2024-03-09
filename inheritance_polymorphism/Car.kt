package com.example.kotlin.inheritance_polymorphism

open class Car(color:String,gear:String,var plate:String) : Vehicle(color, gear) {

    fun drive() {
        println("Car is driving")
    }
}
