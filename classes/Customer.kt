package com.example.kotlin.classes

class Customer (var id : Int , var name : String , var mail : String){

    fun attributes(){
        println("Id : $id")
        println("Name : $name")
        println("Mail : $mail")

    }

    fun add(){
        println("Customer added")

    }

    fun delete(){
        println("Customer deleted")
    }

}