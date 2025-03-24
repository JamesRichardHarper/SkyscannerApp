package org.example.project.feature.settings

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import kotlinx.serialization.Serializable

@Serializable
data object Settings

fun NavGraphBuilder.settingsPaths(
    actionOne: () -> Unit,
    actionTwo: () -> Unit,
    testPull: () -> Unit,
    goBack: () -> Unit,
){
    composable<Settings>{
        SettingsScreen(
            actionOne = actionOne,
            actionTwo = actionTwo,
            testPull = testPull,
            goBack = goBack,
            modifier = Modifier.fillMaxSize()
        )
    }
}