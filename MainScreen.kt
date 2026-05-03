package org.example.ui

import org.example.viewmodel.VideojocViewModel

fun MainScreen(viewModel: VideojocViewModel) {

    val videojocs = viewModel.videojocs

    for (joc in videojocs) {
        println(joc.mostrarInfo())
    }
}