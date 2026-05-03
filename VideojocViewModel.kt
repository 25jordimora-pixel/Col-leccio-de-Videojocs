package org.example.viewmodel

import org.example.models.Videojoc
import org.example.repository.Repository

class VideojocViewModel(
    private val repository: Repository<Videojoc>
) {
    var videojocs = mutableListOf<Videojoc>()

    fun carregar() {
        videojocs = repository.findAll().toMutableList()
    }

    fun guardarJoc(joc: Videojoc) {
        repository.save(joc)
        carregar()
    }
}