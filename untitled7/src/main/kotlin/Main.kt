package org.example

import java.io.File

fun main(args: Array<String>) {
    // On récupère les noms de fichiers donnés en arguments
    val nomFichier1: String = args[0]
    val nomFichier2: String = args[1]

    val fichier1 = File(nomFichier1)

    // Vérifie si le fichier existe
    if (fichier1.exists()) {
        try {
            // Lire le contenu du fichier comme un seul bloc de texte
            val liste1: List<String> = fichier1.readText().split("\n")
            println("Avec readText + split : $liste1")

            // Lire le fichier ligne par ligne directement
            val liste1b: List<String> = fichier1.readLines()
            println("Avec readLines : $liste1b")

            // Transformer la liste en une seule chaîne avec un séparateur
            val texte2: String = liste1.joinToString(separator = "\n------\n")
            println("Texte transformé :\n$texte2")

            // Écrire le texte transformé dans un nouveau fichier
            val fichier2 = File(nomFichier2)
            fichier2.writeText(texte2)

        } catch (e: Exception) {
            println("Erreur lors du traitement : ${e.message}")
        }
    } else {
        println("Le fichier $nomFichier1 n'existe pas.")
    }
}