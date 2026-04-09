package org.example.repository

// Defineix el contracte bàsic d'un repositori genèric
interface Repository<T> {

    // Desa un element
    fun save(item: T)

    // Retorna tots els elements
    fun findAll(): List<T>

    // Elimina un element a partir d'un identificador
    fun delete(id: String)
}