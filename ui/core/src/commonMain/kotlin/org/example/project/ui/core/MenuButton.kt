package org.example.project.ui.core

import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
//TODO("
// This could really do with being shifted into the UI layer
// the component is re-usable for the other screens
// ")
fun MenuButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
){
    TextButton(
        onClick = onClick,
        modifier = modifier
    ){
        Text(text)
    }
}