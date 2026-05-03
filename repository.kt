package org.example.repository

// Defineix el contracte bàsic d'un repositori genèric
interface Repository<T> {
        fun save(item: T)
        fun findAll(): List<T>
        fun delete(id: String)
    }

