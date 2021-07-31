package com.redskill.tmdbclient.data.repository.movie.datasource

import com.redskill.tmdbclient.data.model.Movie

interface MovieLocalDataSource {
    suspend fun getMoviesFromDB(): List<Movie>
    suspend fun saveMoviesFromDB(movies: List<Movie>)
    suspend fun clearAllMoviesFromDB()
}