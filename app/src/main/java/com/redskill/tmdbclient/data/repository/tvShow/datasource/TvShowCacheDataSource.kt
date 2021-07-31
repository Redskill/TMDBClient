package com.redskill.tmdbclient.data.repository.tvShow.datasource

import com.redskill.tmdbclient.data.model.TvShow

interface TvShowCacheDataSource {
    suspend fun getTvShowsFromCache(): List<TvShow>
    suspend fun saveTvShowsToCache(movies: List<TvShow>)
}