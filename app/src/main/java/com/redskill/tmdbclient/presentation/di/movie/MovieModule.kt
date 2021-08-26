package com.redskill.tmdbclient.presentation.di.movie

import com.redskill.tmdbclient.domain.usecase.GetMoviesUseCase
import com.redskill.tmdbclient.domain.usecase.UpdateMoviesUseCase
import com.redskill.tmdbclient.presentation.movie.MovieViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class MovieModule {
    @MovieScope
    @Provides
    fun provideMovieViewModelFactory(
        getMoviesUseCase: GetMoviesUseCase,
        updateMoviesUseCase: UpdateMoviesUseCase
    ): MovieViewModelFactory {
        return MovieViewModelFactory(getMoviesUseCase, updateMoviesUseCase)
    }
}