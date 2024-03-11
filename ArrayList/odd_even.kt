package com.example.kotlin.ArrayList

fun main(){

    val numbers = ArrayList<Int>()

    numbers.add(1)
    numbers.add(15)
    numbers.add(20)
    numbers.add(45)
    numbers.add(78)
    numbers.add(4)

    val oddNumber = ArrayList<Int>()
    val evenNumber = ArrayList<Int>()

    for (i in numbers){

        if( i%2==0 ){
            evenNumber.add(i)

        }
        else{
            oddNumber.add(i)
        }
    }
    println("$evenNumber : even numbers")
    println("$oddNumber : odd numbers")

}