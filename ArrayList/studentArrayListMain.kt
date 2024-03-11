package com.example.kotlin.ArrayList

import java.util.Scanner

fun main(){

    val input = Scanner(System.`in`)

    var counter = 1

    val studentsList = ArrayList<Student>()

    while (true) {

        val name = print("Enter name : ")
        val name1 = input.next()

        val lesson =  print("Enter lesson : ")
        val lesson1 = input.next()

        val student = Student(counter,name1,lesson1)
        counter+=1

        studentsList.add(student)

        println("Press '1' to exit, press other numbers to continue")
        val number = input.nextInt()

        if (number==1){

            for(student in studentsList){
                println("**************")
                println("Student no : ${ student.no }")
                println("Student name : ${student.name}")
                println("lesson : ${student.lesson}")
            }
            println("Exited!")
            break
        }

    }
}