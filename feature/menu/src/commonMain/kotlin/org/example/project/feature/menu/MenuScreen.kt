package org.example.project.feature.menu

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.example.project.ui.core.MenuButton
import org.example.project.ui.core.layout.LocalDimensions
import org.example.project.ui.core.layout.LocalPadding

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
        val buttonModifier = Modifier
            .padding(horizontal = LocalPadding.current.normal)
            .widthIn(max = LocalDimensions.current.maxWidthSmall)
            .fillMaxWidth()
        MenuButton(
            text = "Test API Pull",
            onClick = testPull,
            modifier = buttonModifier
        )
        MenuButton(
            text = "Settings",
            onClick = goToSettings,
            modifier = buttonModifier
        )
        MenuButton(
            text = "History",
            onClick = goToHistory,
            modifier = buttonModifier
        )
    }
}