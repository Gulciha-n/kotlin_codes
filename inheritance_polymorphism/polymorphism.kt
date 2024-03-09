package com.example.kotlin.inheritance_polymorphism

fun main(){

    val nissan = Nissan("Black","Otomatic","ERT456",2021)

    println(nissan.price(200000))
    println(nissan.model)
    println(nissan.color)
    println(nissan.gear)
    println(nissan.plate)

    //upcasting
    val vehicle:Vehicle = Car("Brown","otomatic","KJH678")
    val vehicle3 : Car = Car("Brown","otomatic","KJH678")
    println(vehicle.price(300000))
    //println(vehicle.drive())   //Vehicle turunde oldugundan drive'a ulasamayız.superclass'lar sub classların ozel ozelliklerine erişemez
    println(vehicle3.drive())    //Car türünde oldugundan erisebiliriz.

    val vehicle2:Vehicle = Nissan("white","otomatic","ASD567",2011)
    println(vehicle2.price(200000))
    println(vehicle2.color)
    println(vehicle2.gear)
    //println(vehicle.model)  //Vehicle turunde oldugundan erisemeyiz.model sadece nissan'a ozgu

}
