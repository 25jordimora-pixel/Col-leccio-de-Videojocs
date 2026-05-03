package org.example

import org.example.models.*
import org.example.repository.JsonRepository
import org.example.viewmodel.VideojocViewModel

fun main() {

    println("=== INICI PROVA DE CONSOLA ===\n")

    val repository = JsonRepository<Videojoc>("videojocs.json")
    val viewModel = VideojocViewModel(repository)

    val joc1 = Videojoc("1", "Zelda", "Aventura", 100, "1986")
    val joc2 = Videojoc("2", "FIFA", "Esports", 200, "1993")
    val joc3 = Videojoc("3", "Minecraft", "Sandbox", 300, "2011")


    val usuari = Usuari("U1", "Marc", "marc@gmail.com")
    val colleccio = Colleccio("Favorits")

    println("-> Guardant videojocs...")
    viewModel.guardarJoc(joc1)
    viewModel.guardarJoc(joc2)
    viewModel.guardarJoc(joc3)

    viewModel.carregar()

    println("\n-> Videojocs guardats:")
    viewModel.videojocs.forEach {
        println(it.mostrarInfo())
    }

    println("\n-> Col·lecció:")
    colleccio.afegirJoc(joc1)
    colleccio.afegirJoc(joc2)

    colleccio.videojocs.forEach {
        println(it.mostrarInfo())
    }

    usuari.afegirColleccio(colleccio)

    println("\nUsuari: ${usuari.mostrarInfo()}")
}
