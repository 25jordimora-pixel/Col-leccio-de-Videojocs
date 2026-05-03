package org.example.models

// Això és la classe Usuari, el qual hereta de Item
class Usuari(
    id: String,
    nom: String,
    var email: String
) : Item(id, nom) {

    // Això mostra la llista de col·leccions de l'usuari
    val colleccions = mutableListOf<Colleccio>()

    // Aquesta funció afegeix una nova col·lecció
    fun afegirColleccio(colleccio: Colleccio) {
        colleccions.add(colleccio)
    }

    // Amb això mostrem informació breu de l'usuari
    override fun mostrarInfo(): String {
        return "$nom - $email"
    }

    // Aquest bloc init serveix per validar dades en crear a l'usuari
    init {
        if (id.isEmpty()) {
            throw DadesInvalidesException("L'ID de l'usuari no pot estar buit")
        }

        if (!email.contains("@")) {
            throw DadesInvalidesException("Email invàlid")
        }
    }
}