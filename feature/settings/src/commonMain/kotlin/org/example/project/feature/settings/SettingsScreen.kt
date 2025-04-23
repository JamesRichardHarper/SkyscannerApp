package org.example.project.feature.settings

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Button
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle

@Composable
internal fun SettingsScreen(
    actionOne: () -> Unit,
    actionTwo: () -> Unit,
    testPull: () -> Unit,
    goBack: () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: SettingsViewModel,
) {
    val username by viewModel.username.collectAsStateWithLifecycle()
    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center
    ){
        Column(
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Center,
            modifier = modifier,
        ){
            Text("Username")
            TextField(
                value = username,
                onValueChange = {
                    viewModel.setUsername(it)
                }
            )
            Button(
                onClick = {
                    viewModel.save()
                },
            ){
                Text("Save")
            }
        }
        Column(
            horizontalAlignment = Alignment.End,
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
}