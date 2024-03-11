package com.example.kotlin.ArrayList

fun main(){

    val s1 = Student(1,"Maria","Math")
    val s2 = Student(2,"Batu","Science")
    val s3 = Student(3,"Bugra","Physics")
    val s4 = Student(4,"Ceyda","Math")

    val students = ArrayList<Student>()

    students.add(s1)
    students.add(s2)
    students.add(s3)
    students.add(s4)

    val filterList = students.filter { (it.name).contains("a")}

    for (s in students){
        println("*****************")
        println("No : ${s.no}")
        println("Name : ${s.name}")
        println("Lesson : ${s.lesson}")

    }

}