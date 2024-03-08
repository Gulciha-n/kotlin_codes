package com.example.kotlin

import com.example.kotlin.classes.Customer


fun main(){

    //variables cannot be null , Use the question mark operator to check,?
    //var rocks: Int = null
    var marbles: Int? = null

    var customer:Customer? = null

    lateinit var customer2 :Customer

    //cannot use with primitive types = int,float,boolean,double
    //lateinit var number : Int

    val s :String? = null
    val len = s!!.length   // throws NullPointerException if s is null


    var b: String? = "abc" // assign "abc" to b
    b = null // b , nullable

    val a : String? = null
    val l = a?.length


    val c : String = "Kotlin"
    val d : String? = null
    println(c.length) // Unnecessary safe call
    println(d?.length)


    val e : String? = null
    val lenStr : Int = if (e != null) e.length else -1
    //or you can also express this with the Elvis operator ?:
    val lenStr1 = e?.length ?: -1

    val f = e!!.length  //run anyway
}