package com.redskill.tmdbclient.presentation.di.tvshow

import com.redskill.tmdbclient.domain.usecase.GetTvShowsUseCase
import com.redskill.tmdbclient.domain.usecase.UpdateTvShowsUseCase
import com.redskill.tmdbclient.presentation.di.movie.MovieScope
import com.redskill.tmdbclient.presentation.movie.MovieViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class TvShowModule {
    @MovieScope
    @Provides
    fun provideTvShowViewModelFactory(
        getTvShowsUseCase: GetTvShowsUseCase,
        updateTvShowsUseCase: UpdateTvShowsUseCase
    ): MovieViewModelFactory {
        return provideTvShowViewModelFactory(getTvShowsUseCase, updateTvShowsUseCase)
    }
}