package org.example.model

class Plataforma(
    id: String,
    nom: String,
    var fabricant: String,
    var anySortida: String
) : Item(id, nom) {

    override fun mostrarInfo(): String {
        return "$nom - $fabricant ($anySortida)"
    }
}
