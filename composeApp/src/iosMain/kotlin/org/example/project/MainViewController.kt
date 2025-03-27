package org.example.project

import androidx.compose.ui.window.ComposeUIViewController
import org.example.project.data.flights.createDataStore

fun MainViewController() = ComposeUIViewController {
    val datastore = createDataStore()
    App(

    )
}