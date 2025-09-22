package org.example

fun creeTableauAleatoire(n: Int): Array<Int>
{
  return Array(n) { Random().nextInt(0,101) }
}