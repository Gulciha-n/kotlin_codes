package com.example.kotlin.inheritance_polymorphism

class Nissan (color:String,gear:String,plate:String,var model:Int) : Car (color,gear,plate) {

    override fun price(price: Int) {
        println("Price of Nissan : $price")
    }
}