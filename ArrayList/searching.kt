package com.example.kotlin.ArrayList

import java.util.Scanner

fun main(){

    val input = Scanner(System.`in`)

    val names = ArrayList<String>()

    names.add("Cansu")
    names.add("Ahmet")
    names.add("Sedat")
    names.add("Berna")

    println("Enter a name to search : ")
    val name = input.next()

    for (i in names){
        if(i == name){
            println("Name is exist")
            break
        }
    }
}