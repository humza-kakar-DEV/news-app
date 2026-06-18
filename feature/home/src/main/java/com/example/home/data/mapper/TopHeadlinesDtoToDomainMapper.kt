package com.example.home.data.mapper

import com.example.common.mapper.Mapper
import com.example.home.data.remote.dto.TopHeadlinesDTO
import com.example.home.domain.model.Article
import com.example.home.domain.model.Source
import com.example.home.domain.model.TopHeadlines

class TopHeadlinesDtoToDomainMapper: Mapper<TopHeadlinesDTO, TopHeadlines> {
    override fun map(input: TopHeadlinesDTO): TopHeadlines {
        return TopHeadlines(
            articles = input.articles.map { Article(
                author = it.author,
                content = it.content,
                description = it.description,
                publishedAt = it.publishedAt,
                source = Source(it.source.id, it.source.name),
                title = it.title,
                url = it.url,
                urlToImage = it.urlToImage
            ) },
            status = input.status,
            totalResults = input.totalResults
        )
    }
}