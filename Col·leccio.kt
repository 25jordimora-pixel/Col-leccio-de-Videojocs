package org.example.model

class Colleccio(
var nom: String
) {
    val videojocs = mutableListOf<Videojoc>()

    fun afegirJoc(joc: Videojoc) {
        videojocs.add(joc)
    }

    fun eliminarJoc(id: String) {
        videojocs.removeIf { it.id == id }
    }

    fun cercarJoc(id: String): Videojoc? {
        return videojocs.find { it.id == id }
    }
}