package org.example.model

// Classe Videojoc que hereta de Item
class Videojoc(
    id: String,                 // Identificador únic del videojoc
    nom: String,                // Nom del videojoc
    var genere: String,         // Gènere del videojoc
    var horesJugades: Int,      // Nombre d'hores jugades
    var dataLlançament: String  // Any o data de llançament
) : Item(id, nom) {

    // Mètode per afegir hores jugades
    fun afegirHores(hores: Int) {
        horesJugades += hores
    }

    // Bloc d'inicialització (es crida quan es crea l'objecte)
    init {
        // Assertions: comprovacions internes
        assert(horesJugades >= 0) { "Les hores jugades no poden ser negatives" }
        assert(nom.isNotEmpty()) { "El nom del joc no pot estar buit, llavors sabrem si existeix o no" }
    }

    // Sobreescriptura del mètode de la classe base Item
    override fun mostrarInfo(): String {
        return "$nom ($genere) - $horesJugades hores"
    }
}
