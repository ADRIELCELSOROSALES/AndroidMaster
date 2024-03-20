package com.example.androidmaster.ejercicios

fun main(){
    val morningNotification = 51
    val eveningNotification = 135

         println(morningNotification)
        println(eveningNotification)
}

fun printNotificationSummary(numberOfMessages: Int) {

    if (numberOfMessages >= 100){
        println("you have $numberOfMessages notification")
    }else println("your phone is blowing up! you have $numberOfMessages notification")
}