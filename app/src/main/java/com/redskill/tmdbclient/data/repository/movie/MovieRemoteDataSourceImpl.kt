package com.redskill.tmdbclient.data.repository.movie

import com.redskill.tmdbclient.data.db.TMDBService
import com.redskill.tmdbclient.data.model.MovieList
import com.redskill.tmdbclient.data.repository.movie.datasource.MovieRemoteDataSource
import retrofit2.Response

class MovieRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey: String
) : MovieRemoteDataSource {

    override suspend fun getMovies(): Response<MovieList> {
        return tmdbService.getPopularMovies(apiKey)
    }
}