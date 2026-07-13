package com.example.home_impl.data.mapper

import com.example.common.base.BaseMapper
import com.example.home_impl.data.remote.dto.TopHeadlinesDTO
import com.example.home_impl.domain.model.Article
import com.example.home_impl.domain.model.Source
import com.example.home_impl.domain.model.TopHeadlines

class TopHeadlinesDtoToDomainBaseMapper: BaseMapper<TopHeadlinesDTO, TopHeadlines> {
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