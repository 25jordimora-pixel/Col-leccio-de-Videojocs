package org.example.repository

// Implementació senzilla d'un repositori en memòria
class JsonRepository<T> : Repository<T> {

    // Llista interna per emmagatzemar dades
    private val dades = mutableListOf<T>()

    // Afegeix un element a la llista
    override fun save(item: T) {
        dades.add(item)
    }

    // Retorna tots els elements emmagatzemats
    override fun findAll(): List<T> = dades

    // Mètode per eliminar un element segons identificador
    override fun delete(id: String) {
        // Implementació pendent segons el tipus de dada
    }
}