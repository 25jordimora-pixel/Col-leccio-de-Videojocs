package org.example

import org.example.model.Colleccio
import org.example.model.Videojoc

fun main() {
    val joc1 = Videojoc("1", "Mario Bros", "Aventura", 150, "1985")
    val colleccio = Colleccio("Favorits")

    colleccio.afegirJoc(joc1)

    println(joc1.mostrarInfo())
    println(colleccio.videojocs.size)
}
