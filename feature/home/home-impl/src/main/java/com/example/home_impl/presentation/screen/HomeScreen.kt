package com.example.home_impl.presentation.screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.design_system.component.card.NewsCard
import com.example.design_system.component.text.NewsSectionHeader
import com.example.design_system.preview.AppPreview
import com.example.design_system.preview.PreviewTheme
import com.example.design_system.token.SpacingToken

@Composable
fun HomeScreen() {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            NewsSectionHeader(
                title = "Latest News",
                actionText = "See all",
                onActionClick = {},
            )
        },
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
        ) {
            items(sampleNews) { news ->
                NewsCard(
                    category = news.category,
                    title = news.title,
                    sourceName = news.sourceName,
                    timeAgo = news.timeAgo,
                    imageUrl = news.imageUrl,
                    sourceIconUrl = news.sourceIconUrl,
                    onClick = {},
                    onMoreClick = {},
                    modifier = Modifier.padding(horizontal = SpacingToken.XSmall),
                )
            }
        }
    }
}

private data class NewsItem(
    val category: String,
    val title: String,
    val sourceName: String,
    val timeAgo: String,
    val imageUrl: String? = null,
    val sourceIconUrl: String? = null,
)

private val sampleNews = listOf(
    NewsItem(
        category = "Europe",
        title = "Ukraine's President Zelensky to BBC: Blood money being paid for Russian oil",
        sourceName = "BBC News",
        timeAgo = "14m ago",
    ),
    NewsItem(
        category = "Travel",
        title = "Herbal treatments for skin conditions: What works?",
        sourceName = "CNN",
        timeAgo = "1h ago",
    ),
    NewsItem(
        category = "Politics",
        title = "New environmental laws passed in the European Union",
        sourceName = "Reuters",
        timeAgo = "2h ago",
    ),
)

@AppPreview
@Composable
fun HomeScreenPreview() {
    PreviewTheme {
        HomeScreen()
    }
}
