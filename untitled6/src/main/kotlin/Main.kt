package org.example

import kotlin.random.Random

fun creeTableauAleatoire(n: Int): Array<Int>

{
   return Array(n) {Random.nextInt(0, 100)}
}