package com.example.kotlin.Interface2

fun main(){

    val lion = Lion()
    val apple = Apple()
    val amasyaApple : Apple = AmasyaApple()  //polymorphism
    val chicken : Eatable = Chicken()        //polymorphism

    val objects = arrayOf(lion,apple,amasyaApple,chicken)

    for(x in objects){
        if(x is Eatable){
            x.howToEat()
        }

        if (x is Squeezable){
            x.howToSqueeze()
        }
    }
}