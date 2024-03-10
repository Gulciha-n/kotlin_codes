package com.example.kotlin.Interface2

open class Apple : Eatable , Squeezable {

    override fun howToEat() {
        println("Eat by slicing")
    }

    override fun howToSqueeze() {
        println("Use the juicer machine to squeeze")
    }

}