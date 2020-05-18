package com.joeychiu.guess

import java.util.*

class SecretNumber {
    val secret = Random().nextInt(10)+1
    var count = 0

    fun vaildate(number : Int):Int{
        return number - secret
    }
}

fun main(){
    val secretNumber = SecretNumber()
    println(secretNumber.secret)
    println("${secretNumber.vaildate(2)},count=${secretNumber.count}")
}