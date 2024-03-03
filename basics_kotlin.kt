package com.example.kotlin

import java.util.Objects
import java.util.Scanner
import java.util.Random
import java.util.function.Function
import java.util.Arrays
import java.util.*

fun randomDay() : String {
    val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}


fun main(){


    /*
    val b  = 60.35
    val c = 45
    val result = b.toInt()
    val result2 = c.toFloat()

    println(result)
    println(result2)

    var str1 = b.toString()
    println(str1)



    val str2 = "34T"

    try {
        val x = str2.toInt()
        println(x)

    }
    catch (e:Exception){
        println(e)
    }




    val str3 = "47.45T"
    val y = str3.toDoubleOrNull()

    if (y != null){
        println("Y : $y")
    }
    else{
        println("Error")

    }



    val str4 = "78"
    val z = str4.toIntOrNull()
    z?.let {
        println("Z : $z")

    }



    print("Enter Name : ")
    val input = Scanner(System.`in`)
    val name = input.next()
    println("Name : $name")



    val day = 5
    when (day){
        1 -> println("Mon")
        2 -> println("Tu")
        3 -> println("wen")
        4 -> println("th")
        5 -> println("fr")
        6 -> println("sat")
        7 -> println("sun")
        else -> println("!")

    }

    */



    /*
    val input = Scanner(System.`in`)

    while (true){
        print("Enter Number : ")
        val number = input.nextInt()

        if (number %2 == 0){
            println("Even number")
            println("Press '1' to exit")
            if(number == 1){
                break
            }
        }
        else{
            println("Odd number")
            println("Press '1' to exit")
            if(number == 1){
                break
            }
        }

    }

    */



    /*
    val input = Scanner(System.`in`)

    while (true){

        print("Enter Number : ")
        val number = input.nextInt()
        if (number %2 == 0){
            println("Even number")

        }
        else{
            println("Odd number")

        }
        println("Press '1' to exit , to continue with other numbers")

        print("Enter Number : ")
        val exit = input.nextInt()

        if(exit == 1){
            break
        }
    }
     */



    /*
    //Empty array
    val array1 = Array<Int> (5) {0}

    val array2 = Array<String> (7) {""}

    val array3 = arrayOf<Int>(5,4,7,9)

    val array4 = arrayOf( 7, 8 , 4, 5 )

    println(array4.get(2))
    array4[0] = 1
    println(array4.contentToString())

    array4.set(1, 7)
    println(array4.contentToString())


    println(array4.isEmpty())
    println(array4.count())
    println(array4.first())
    println(array4.last())
    println(array4.indexOf(7))
    println(array4.contains(4))
    println(array4.sort())
    println(array4.contentToString())
    println(array4.reverse())
    println(array4.contentToString())

*/



    /*
    val input = Scanner(System.`in`)

    val names = Array<String> (5){""}

    for(i in 0 until names.count() ){
        println("Enter ${i+1}.  :  ")
        val name = input.next()
        names[i] = name
    }
    println(names.contentToString())

    for((index , name) in names.withIndex()){
        println("${index+1}. name = $name")

    }
     */



    /*
    val lessons = Array<String> (5){""}
    val grades = Array<Int> (5) {0}
    val input = Scanner(System.`in`)

    for(i in 0 until lessons.count()){
        println("${i+1}.Lesson : ")
        val less = input.next()
        lessons[i] = less

        println("${i+1}.Grade : ")
        val g = input.nextInt()
        grades[i] = g
    }

    var sum = 0

    for (i in 0 until lessons.count()){
        println("${lessons[i]} : ${grades[i]}")

        sum = sum + grades[i]

    }

    val ort = sum/lessons.count()
    if (ort < 50){
        println("Failed! , average : $ort")
    }
    else{
        println("Pass! , average : $ort")
    }

     */


    /*

    for(i in 1..10){
        val randomNumber = kotlin.random.Random.nextInt(0,10)
        println(randomNumber)

    }

    val c = Math.ceil(5.4)
    val f = Math.floor(5.4)

     */


    /*

    val numbers = intArrayOf(1, 2, 3)
    val oceans = listOf("Atlantic", "Pacific")
    val oddList = listOf(numbers, oceans, "salmon")
    println(oddList)


    val num = intArrayOf(1, 2, 3)
    val ocean = listOf("Atlantic", "Pacific" , 5)
    val oddlist = listOf(num.contentToString(), ocean, "salmon")
    println(oddlist)


    val n = arrayOf(1, 2, 3)
    println(n.contentToString())
    val o = listOf("Atlantic", "Pacific")
    val list = listOf(n, o, "salmon") //writing address of n
    println(list)


    val array = Array (5) { it * 2 }  // it refers to the array index
    println(array.contentToString())


     */


    /*
    // Will assign kotlin.Unit
    val isUnit = println("This is an expression")
    println(isUnit)

     */


    println(randomDay())



}


