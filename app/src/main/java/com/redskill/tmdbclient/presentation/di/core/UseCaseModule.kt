package com.redskill.tmdbclient.presentation.di.core

import com.redskill.tmdbclient.domain.repository.ArtistRepository
import com.redskill.tmdbclient.domain.repository.MovieRepository
import com.redskill.tmdbclient.domain.repository.TvShowRepository
import com.redskill.tmdbclient.domain.usecase.*
import dagger.Module
import dagger.Provides

@Module
class UseCaseModule {

    @Provides
    fun provideGetMovieUseCase(movieRepository: MovieRepository) : GetMoviesUseCase {
        return GetMoviesUseCase(movieRepository)
    }

    @Provides
    fun provideUpdateMovieUseCase(movieRepository: MovieRepository) : UpdateMoviesUseCase {
        return UpdateMoviesUseCase(movieRepository)
    }

    @Provides
    fun provideGetTvShowUseCase(tvShowRepository: TvShowRepository) : GetTvShowsUseCase {
        return GetTvShowsUseCase(tvShowRepository)
    }

    @Provides
    fun provideUpdateTvShowUseCase(tvShowRepository: TvShowRepository) : UpdateTvShowsUseCase {
        return UpdateTvShowsUseCase(tvShowRepository)
    }

    @Provides
    fun provideGetArtistUseCase(artistRepository: ArtistRepository) : GetArtistUseCase {
        return GetArtistUseCase(artistRepository)
    }

    @Provides
    fun provideUpdateArtistUseCase(artistRepository: ArtistRepository) : UpdateArtistsUseCase {
        return UpdateArtistsUseCase(artistRepository)
    }
}