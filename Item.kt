package org.example.model

abstract class Item(
    val id: String,
    var nom: String
) {
    abstract fun mostrarInfo(): String
}
