package org.example.models

abstract class Item(
    val id: String,
    var nom: String
) {
    abstract fun mostrarInfo(): String
}