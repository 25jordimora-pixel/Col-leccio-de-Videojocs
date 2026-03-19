package org.example.model

class Usuari(
    id: String,
    nom: String,
    var email: String
) : Item(id, nom) {

    val colleccions = mutableListOf<Colleccio>()

    fun afegirColleccio(colleccio: Colleccio) {
        colleccions.add(colleccio)
    }

    override fun mostrarInfo(): String {
        return "$nom - $email"
    }
}