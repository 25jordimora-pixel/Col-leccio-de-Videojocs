package org.example.model

class Videojoc(
    id: String,
    nom: String,
    var genere: String,
    var horesJugades: Int,
    var dataLlançament: String
) : Item(id, nom) {

    fun afegirHores(hores: Int) {
        horesJugades += hores
    }

    override fun mostrarInfo(): String {
        return "$nom ($genere) - $horesJugades hores"
    }
}
