package com.example.kotlin

fun main(){

    var str1 = String()  //empty string
    var str2 = ""

    var str3 = """
        Hello
        how
        are
        you?
    """.trimIndent()   //trimIndent , removes blanks

    println(str3)

    if(str1.isEmpty()){
        str1 = "Hi"
        println(str1)
    }
    else{
        println(str1)

    }





}