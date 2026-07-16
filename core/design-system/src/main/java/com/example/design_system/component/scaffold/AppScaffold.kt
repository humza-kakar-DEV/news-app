package com.example.design_system.component.scaffold

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.design_system.component.bottombar.AppBottomBar
import com.example.design_system.component.topbar.AppTopBar
import com.example.design_system.preview.AppPreview
import com.example.design_system.preview.PreviewTheme

@Composable
fun AppScaffold(
    modifier: Modifier = Modifier,
    topBar: @Composable () -> Unit = { AppTopBar() },
    bottomBar: @Composable () -> Unit = { AppBottomBar() },
    containerColor: Color = MaterialTheme.colorScheme.background,
    content: @Composable (PaddingValues) -> Unit
) {
    Scaffold(
        modifier = modifier.fillMaxSize(),
        topBar = topBar,
        bottomBar = bottomBar,
        containerColor = containerColor,
        content = { paddingValues ->
            content(paddingValues)
        }
    )
}

@AppPreview
@Composable
fun AppScaffoldPreview() {
    PreviewTheme {
        AppScaffold {
        }
    }
}
