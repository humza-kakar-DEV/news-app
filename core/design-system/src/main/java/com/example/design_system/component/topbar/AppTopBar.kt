package com.example.design_system.component.topbar

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Description
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.design_system.R
import com.example.design_system.preview.AppPreview
import com.example.design_system.preview.PreviewTheme
import com.example.design_system.token.ElevationToken
import com.example.design_system.token.IconToken
import com.example.design_system.token.SizeToken
import com.example.design_system.token.SpacingToken

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppTopBar(
    modifier: Modifier = Modifier,
    onNotificationClick: () -> Unit = {}
) {
    TopAppBar(
        modifier = modifier,
        title = {
            Text(
                text = stringResource(R.string.news_360),
                style = MaterialTheme.typography.titleLarge
            )
        },
        actions = {
            Surface(
                shape = MaterialTheme.shapes.medium,
                color = MaterialTheme.colorScheme.background,
                shadowElevation = ElevationToken.Small,
                modifier = Modifier.padding(end = SpacingToken.Small)
            ) {
                IconButton(
                    onClick = onNotificationClick,
                    modifier = Modifier.size(SizeToken.IconButtonSize)
                ) {
                    Icon(
                        imageVector = Icons.Default.Notifications,
                        contentDescription = "Notifications",
                        tint = MaterialTheme.colorScheme.onBackground,
                        modifier = Modifier.size(IconToken.Medium)
                    )
                }
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.background
        )
    )
}

@AppPreview
@Composable
fun AppTopBarPreview() {
    PreviewTheme {
        AppTopBar()
    }
}
