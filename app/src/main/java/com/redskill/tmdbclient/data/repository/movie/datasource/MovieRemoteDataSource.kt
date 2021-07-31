package com.redskill.tmdbclient.data.repository.movie.datasource

import com.redskill.tmdbclient.data.model.MovieList
import retrofit2.Response

interface MovieRemoteDataSource {
    suspend fun getMovies(): Response<MovieList>
}