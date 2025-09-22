package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(args: Array<String>) {
    val hauteur: Int = 4
    var ligne: String

    for (i in 1..hauteur)
    {
        val nombreEtoiles: Int = 2 * i -1
        val nombreEspace: Int = (hauteur - i)
        ligne = " ".repeat(nombreEspace) + "*".repeat(nombreEtoiles)
        println(ligne)



    }
}