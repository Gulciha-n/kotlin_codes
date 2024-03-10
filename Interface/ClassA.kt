package com.example.kotlin.Interface

class ClassA() : interface1 {

    override val variable = 10

    override fun method1() {
        println("Hello Interface")
    }

    override fun method2(): String {
        return "Hi Interface"

    }

}