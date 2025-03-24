package org.example.project.feature.settings

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
internal fun SettingsScreen(
    actionOne: () -> Unit,
    actionTwo: () -> Unit,
    testPull: () -> Unit,
    goBack: () -> Unit,
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
            onClick = actionOne
        ){
            Text("actionOne")
        }
        TextButton(
            onClick = actionTwo
        ){
            Text("actionTwo")
        }
        FloatingActionButton(
            onClick = goBack
        ){
            Text("Go Back")
        }
    }
}