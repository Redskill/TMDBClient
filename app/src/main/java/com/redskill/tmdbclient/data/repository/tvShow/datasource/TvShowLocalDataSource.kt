package com.redskill.tmdbclient.data.repository.tvShow.datasource

import com.redskill.tmdbclient.data.model.TvShow

interface TvShowLocalDataSource {
    suspend fun getTvShowsFromDB(): List<TvShow>
    suspend fun saveTvShowsFromDB(movies: List<TvShow>)
    suspend fun clearAllTvShowsFromDB()
}