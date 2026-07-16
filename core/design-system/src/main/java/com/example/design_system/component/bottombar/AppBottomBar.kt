package com.example.design_system.component.bottombar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.Explore
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.example.design_system.preview.AppPreview
import com.example.design_system.preview.PreviewTheme

@Composable
fun AppBottomBar(
    modifier: Modifier = Modifier,
) {
    var selectedItem by remember { mutableIntStateOf(0) }
    val items = listOf("Home", "Explore", "Bookmark", "Profile")
    val icons = listOf(
        Icons.Default.Home,
        Icons.Default.Explore,
        Icons.Default.Bookmark,
        Icons.Default.Person
    )

    NavigationBar(
        modifier = modifier,
        containerColor = MaterialTheme.colorScheme.background,
        contentColor = MaterialTheme.colorScheme.onBackground
    ) {
        items.forEachIndexed { index, item ->
            NavigationBarItem(
                icon = { Icon(icons[index], contentDescription = item) },
                label = { Text(item, style = MaterialTheme.typography.labelSmall) },
                selected = selectedItem == index,
                onClick = { selectedItem = index },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = MaterialTheme.colorScheme.primary,
                    selectedTextColor = MaterialTheme.colorScheme.primary,
                    unselectedIconColor = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.4f),
                    unselectedTextColor = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.4f),
                    indicatorColor = MaterialTheme.colorScheme.background
                )
            )
        }
    }
}

@AppPreview
@Composable
fun AppBottomBarPreview() {
    PreviewTheme {
        AppBottomBar()
    }
}
