package com.example.kotlin

import kotlin.random.Random

fun sum(num1 : Int , num2 : Int) :Int {
    val top = num1+num2
    return top
}

fun sum2(num1 : Int , num2 : Int){
    val top = num1+num2
    println(top)

}

fun days() : String{
    val weekday = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday")
    return weekday[Random.nextInt(weekday.size)]
}


fun Dayfood(day : String) : String{
    var food = " "
    when (day){
        "Monday" -> food = "flakes"
        "Tuesday" -> food = "pellets"
        "Wednesday" -> food = "redworms"
        "Thursday" -> food = "granules"
        "Friday" -> food = "mosquitoes"
        "Saturday" -> food = "lettuce"
        "Sunday" -> food = "plankton"

    }
    return food
    }



//single-expression functions
fun isTooHot(temperature: Int) = temperature > 30
fun isSunday(day: String) = day == "Sunday"
fun shouldChangeWater (day: String, temperature: Int = 22): Boolean {
    return when {
        isTooHot(temperature) -> true    //return true if temperature > 30
        isSunday(day) -> true           //return tru if day == "Sunday"
        else  -> false
    }
}
/* Note : A function used as a default value is evaluated at runtime
, so do not put an expensive operation like a file read or a large memory allocation in the function
 */


//vararg
fun summ(vararg numbers :Int) {
    for (n in numbers){
        println(n)
    }
}

//filter
val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

//Extension functions
fun Int.multiply(number : Int) : Int{
    return this * number
}

fun main() {
    val res1 = sum(5,8)
    println(res1)


    sum2(8,7)

    val res2 =  days()
    println(res2)

    val res3 = Dayfood("Monday")
    println(res3)

    val res4 = summ(8,7,89,8)
    println(res4)

    println( decorations.filter {it[0] == 'p'})

    val res5 = 4.multiply(7)
    println(res5)
    

}
