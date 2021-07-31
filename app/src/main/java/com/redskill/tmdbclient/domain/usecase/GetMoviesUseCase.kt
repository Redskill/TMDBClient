package com.redskill.tmdbclient.domain.usecase

import com.redskill.tmdbclient.data.model.Movie
import com.redskill.tmdbclient.domain.repository.MovieRepository

class GetMoviesUseCase(private val movieRepository: MovieRepository) {
    suspend fun execute(): List<Movie>? = movieRepository.getMovies()
}