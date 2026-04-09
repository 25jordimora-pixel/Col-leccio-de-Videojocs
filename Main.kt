package org.example

import org.example.model.Colleccio
import org.example.model.Item
import org.example.model.Plataforma
import org.example.model.Usuari
import org.example.model.Videojoc


fun main() {
    val item: Item = Videojoc("1", "Mario Bros", "Aventura", 150, "1985")
    val colleccio = Colleccio("Favorits")
    val plataforma = Plataforma(
        id = item.id, nom = item.nom,
        fabricant = "Nintendo",
        anySortida = "1981"
    )
    val usuari = Usuari(
        id = String(), nom = String(), email = String(),
    )

    println(item.mostrarInfo())
    println(colleccio.videojocs.size)
    println(plataforma.anySortida)
    println(plataforma.nom)
    println(plataforma.fabricant)
    println(usuari.nom)
    println(usuari.email)
}



