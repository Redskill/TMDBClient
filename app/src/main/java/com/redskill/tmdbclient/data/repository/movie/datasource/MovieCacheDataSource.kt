package com.redskill.tmdbclient.data.repository.movie.datasource

import com.redskill.tmdbclient.data.model.Movie

interface MovieCacheDataSource {
    suspend fun getMoviesFromCache(): List<Movie>
    suspend fun saveMoviesToCache(movies: List<Movie>)
}