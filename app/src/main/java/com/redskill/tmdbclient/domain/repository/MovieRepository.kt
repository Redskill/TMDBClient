package com.redskill.tmdbclient.domain.repository

import com.redskill.tmdbclient.data.model.Movie

interface MovieRepository {
    suspend fun getMovies(): List<Movie>?
    suspend fun updateMovies(): List<Movie>?
}