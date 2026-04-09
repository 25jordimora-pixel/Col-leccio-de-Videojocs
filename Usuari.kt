package org.example.model

// Amb això validem aquelles daddes que son invàlides
class DadesInvalidesException(message: String) : Exception(message)

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
            // Aquests assertions serveixen per detectar errors en el desenvolupament de l'usuari
            assert(id.isNotEmpty()) { "L'ID de l'usuari no pot estar buit"}
            assert(email.isNotEmpty()) { "L'email de l'usuari no pot estar buit"}
            assert(email.contains("@")) { "L'email ha de contenir @"}

        // Aquestes expressions regulars mostren si les dades són incorrectes
        if (id.isEmpty()) {
           throw DadesInvalidesException("L'ID no pot estar buit")
        }

        if (!validarEmail(email)) {
            throw DadesInvalidesException("Email no vàlid")
        }
    }

    // Aquesta funció serveix per validar l'email de l'usuari amb Regex
    fun validarEmail(email: String): Boolean {
        val regex = "^[A-Za-z0-9+_.-]+@(.+)$".toRegex()
        return regex.matches(email)
    }
}

