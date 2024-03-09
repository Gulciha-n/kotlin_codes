package com.example.kotlin.inheritance_polymorphism

open class Vehicle (var color:String , var gear:String) {

    open fun price(price : Int){
        println("Price : $price")
    }
}

