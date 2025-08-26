package org.example.project.ui.core

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import org.example.project.ui.core.layout.LocalDimensions
import org.example.project.ui.core.layout.LocalPadding

@Composable
fun MenuButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
        .padding(horizontal = LocalPadding.current.normal)
        .widthIn(max = LocalDimensions.current.maxWidthSmall)
        .fillMaxWidth()
){
    TextButton(
        onClick = onClick,
        modifier = modifier
    ){
        Text(text)
    }
}