package org.example.repository

import java.io.File

class JsonRepository<T>(
    private val fileName: String
) : Repository<T> {

    private val file = File(fileName)

    private val memory = mutableListOf<T>()

    override fun save(item: T) {
        memory.add(item)
    }

    override fun findAll(): List<T> {
        return memory
    }

    override fun delete(id: String) {
        println("Delete no implementat")
    }
}