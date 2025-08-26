package org.example.project.feature.menu

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import kotlinx.serialization.Serializable

@Serializable
data object Menu

fun NavGraphBuilder.menuPaths(
    goToSettings: () -> Unit,
    goToHistory: () -> Unit,
    goToFlightsMenu: () -> Unit,
){
    composable<Menu>{
        MenuScreen(
            goToSettings = goToSettings,
            goToHistory = goToHistory,
            testPull = goToFlightsMenu,
            modifier = Modifier.fillMaxSize()
        )
    }
}