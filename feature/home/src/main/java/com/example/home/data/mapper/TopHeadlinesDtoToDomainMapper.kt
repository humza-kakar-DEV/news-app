package com.example.home.data.mapper

import com.example.common.base.BaseMapper
import com.example.home.data.remote.dto.TopHeadlinesDTO
import com.example.home.domain.model.Article
import com.example.home.domain.model.Source
import com.example.home.domain.model.TopHeadlines

class TopHeadlinesDtoToDomainMapper : BaseMapper<TopHeadlinesDTO, TopHeadlines> {
    override fun map(input: TopHeadlinesDTO): TopHeadlines {
        return TopHeadlines(
            status = input.status,
            totalResults = input.totalResults,
            articles = input.articles.map { articleDto ->
                Article(
                    author = articleDto.author,
                    content = articleDto.content,
                    description = articleDto.description,
                    publishedAt = articleDto.publishedAt,
                    source = Source(
                        id = articleDto.source.id,
                        name = articleDto.source.name
                    ),
                    title = articleDto.title,
                    url = articleDto.url,
                    urlToImage = articleDto.urlToImage
                )
            }
        )
    }
}