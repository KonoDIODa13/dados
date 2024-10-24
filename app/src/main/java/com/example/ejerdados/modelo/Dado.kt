package com.example.ejerdados.modelo

class Dado {
    var lados = 6

    fun girar() {
        val randomNum = (1..6).random()
        println(randomNum)
    }
}

fun main() {
    val dado = Dado()
    println(dado.lados)
    println(dado.girar())

}