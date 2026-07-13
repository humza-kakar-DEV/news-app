package com.example.design_system.component.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.design_system.preview.AppPreview
import com.example.design_system.preview.PreviewTheme

data class NavigationTab(
    val route: String,
    val label: String,
    val icon: ImageVector
)

@Composable
fun NewsBottomNavigation(
    tabs: List<NavigationTab>,
    currentRoute: String?,
    onTabSelected: (NavigationTab) -> Unit,
    modifier: Modifier = Modifier
) {
    NavigationBar(
        modifier = modifier,
    ) {
        tabs.forEach { tab ->
            NavigationBarItem(
                selected = currentRoute == tab.route,
                onClick = { onTabSelected(tab) },
                icon = {
                    Icon(
                        imageVector = tab.icon,
                        contentDescription = tab.label
                    )
                },
                label = {
                    Text(text = tab.label)
                }
            )
        }
    }
}

@AppPreview
@Composable
fun NewsBottomNavigationPreview() {
    val tabs = listOf(
        NavigationTab("home", "Home", Icons.Default.Home),
        NavigationTab("explore", "Explore", Icons.Default.Search),
        NavigationTab("bookmark", "Bookmark", Icons.Default.Bookmark),
        NavigationTab("profile", "Profile", Icons.Default.Person)
    )
    PreviewTheme {
        NewsBottomNavigation(
            tabs = tabs,
            currentRoute = "home",
            onTabSelected = {}
        )
    }
}
