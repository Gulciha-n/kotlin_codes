package com.example.kotlin.composition

fun main(){

    val category1 = Category(1,"Drama")
    val category2 = Category(2,"Comedy")

    val director1 = Directors(1,"Nuri Bilge Ceylan")
    val director2 = Directors(2,"Quentin Tarantino")

    val movie1 =  Movies(1,"Django",2013,category1,director2)

    println(movie1.movieId)
    println(movie1.movieName)
    println(movie1.movieYear)
    println(movie1.category.categoryId)
    println(movie1.category.categoryName)
    println(movie1.director.directorId)
    println(movie1.director.directorName)



}