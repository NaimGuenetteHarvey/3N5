package org.example
import kotlin.random.Random

fun creeTableauAleatoire(n: Int): Array<Int> {
 return Array(n) { Random.nextInt(0,101)}
}
fun Calcul(tableau: Array<Int>) {
    val somme = tableau.sum()
    val moyenne = tableau.average()
    val min = tableau.minOrNull()
    val max = tableau.maxOrNull()
    println("$somme $moyenne $moyenne $min")
}
fun main()
{
    val tab = creeTableauAleatoire(10)
     Calcul(tab)

}