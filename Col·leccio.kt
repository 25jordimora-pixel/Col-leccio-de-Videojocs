package org.example.models

class Colleccio(
    var nom: String
) {
    val videojocs = mutableListOf<Videojoc>()

    fun afegirJoc(joc: Videojoc) {
        if (videojocs.any { it.id == joc.id }) {
            throw ElementDuplicatException("Ja existeix")
        }
        videojocs.add(joc)
    }

    fun eliminarJoc(id: String) {
        val joc = videojocs.find { it.id == id }
            ?: throw ElementNoTrobatException("El videojoc $id no existeix")

        videojocs.remove(joc)
    }

    fun cercarJoc(id: String): Videojoc? {
        return videojocs.find { it.id == id }
    }

    fun existeixJoc(id: String): Boolean {
        return videojocs.any { it.id == id }
    }

    fun filtrarPerGenere(genere: String): List<Videojoc> {
        return videojocs.filter { it.genere == genere }
    }

    fun ordenarPerHores(): List<Videojoc> {
        return videojocs.sortedByDescending { it.horesJugades }
    }

    init {
        assert(nom.isNotEmpty()) { "El nom de la col·lecció no pot estar buit" }
    }
}