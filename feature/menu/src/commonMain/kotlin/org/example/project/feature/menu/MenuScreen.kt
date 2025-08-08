package org.example.project.feature.menu

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
internal fun MenuScreen(
    goToSettings: () -> Unit,
    goToHistory: () -> Unit,
    testPull: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier,
    ) {
        TextButton(
            onClick = testPull
        ){
            Text("Test API Pull")
        }
        TextButton(
            onClick = goToSettings
        ){
            Text("Settings")
        }
        TextButton(
            onClick = goToHistory
        ){
            Text("History")
        }
    }
}