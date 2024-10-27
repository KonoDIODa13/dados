package com.example.ejerdados.modelo

class Dado {
    var lados = 6

    fun girar(): Int {
        return (1..lados).random()
    }
}

fun main() {
    val dado = Dado()
    println(dado.lados)
    println(dado.girar())

}