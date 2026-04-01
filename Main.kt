package org.example

import org.example.model.Colleccio
import org.example.model.ElementDuplicatException
import org.example.model.Item
import org.example.model.Plataforma
import org.example.model.Usuari
import org.example.model.Videojoc

fun main() {

    // Això el que fa és mostrar un exemple de herència entre Item i Videojoc
    val item: Item = Videojoc("0", "Mario Bros", "Aventura", 150, "1985")

    // Aquest apartat crea una col·lecció de videojocs
    val colleccio = Colleccio("Favorits")

    // Aquest apartat crea una plataforma
    val plataforma = Plataforma(
        id = item.id,
        nom = item.nom,
        fabricant = "Nintendo",
        anySortida = "1981"
    )

    // Aquest apartat crea un usuari
    val usuari = Usuari(
        id = "U1",
        nom = "Marc",
        email = "marc@gmail.com"
    )

    // Creació de videojocs amb IDs únics
    val joc1 = Videojoc("1", "Zelda", "Aventura", 100, "1986")
    val joc2 = Videojoc("2", "FIFA", "Esports", 200, "1993")

    // Afegim videojocs a la col·lecció amb control de duplicats
    try {
        colleccio.afegirJoc(joc1)
        colleccio.afegirJoc(joc2)

        // Intent duplicat per provar l'excepció
        colleccio.afegirJoc(joc1)

    } catch (e: ElementDuplicatException) {
        println("Error capturat correctament: ${e.message}")
    }

    // Amb aquest println() filtrem jocs per gènere i els mostrem
    println("Jocs d'aventura:")
    colleccio.filtrarPerGenere("Aventura").forEach {
        println(it.mostrarInfo())
    }

    // Aquests println() mostren l'informació general del videojoc
    println("\nInformació general:")
    println(item.mostrarInfo())
    println("Número de jocs a la col·lecció: ${colleccio.videojocs.size}")
    println("Plataforma: ${plataforma.nom}, Fabricant: ${plataforma.fabricant}, Any: ${plataforma.anySortida}")
    println("Usuari: ${usuari.nom}, Email: ${usuari.email}")

    // Aquests pirntln() mostren l'informació detallada de joc1
    println("\nDetalls Joc 1:")
    println("ID: ${joc1.id}")
    println("Nom: ${joc1.nom}")
    println("Hores jugades: ${joc1.horesJugades}")
    println("Data llançament: ${joc1.dataLlançament}")
    println("Gènere: ${joc1.genere}")

    // Amb aquest println() ordenem videojocs per hores jugades i els mostrem
    println("\nJocs ordenats per hores jugades:")
    colleccio.ordenarPerHores().forEach {
        println(it.mostrarInfo())
    }
}



