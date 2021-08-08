package com.redskill.tmdbclient.presentation.di.core

import com.redskill.tmdbclient.data.repository.artist.ArtistRepositoryImpl
import com.redskill.tmdbclient.data.repository.artist.datasource.ArtistCacheDataSource
import com.redskill.tmdbclient.data.repository.artist.datasource.ArtistLocalDataSource
import com.redskill.tmdbclient.data.repository.artist.datasource.ArtistRemoteDataSource
import com.redskill.tmdbclient.data.repository.movie.MovieRepositoryImpl
import com.redskill.tmdbclient.data.repository.movie.datasource.MovieCacheDataSource
import com.redskill.tmdbclient.data.repository.movie.datasource.MovieLocalDataSource
import com.redskill.tmdbclient.data.repository.movie.datasource.MovieRemoteDataSource
import com.redskill.tmdbclient.data.repository.tvShow.TvShowRepositoryImpl
import com.redskill.tmdbclient.data.repository.tvShow.datasource.TvShowCacheDataSource
import com.redskill.tmdbclient.data.repository.tvShow.datasource.TvShowLocalDataSource
import com.redskill.tmdbclient.data.repository.tvShow.datasource.TvShowRemoteDataSource
import com.redskill.tmdbclient.domain.repository.ArtistRepository
import com.redskill.tmdbclient.domain.repository.MovieRepository
import com.redskill.tmdbclient.domain.repository.TvShowRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Singleton
    @Provides
    fun provideMovieRepository(
        movieRemoteDataSource: MovieRemoteDataSource,
        movieLocalDataSource: MovieLocalDataSource,
        movieCacheDataSource: MovieCacheDataSource
    ): MovieRepository {
        return MovieRepositoryImpl(
            movieRemoteDataSource,
            movieLocalDataSource,
            movieCacheDataSource
        )
    }

    @Singleton
    @Provides
    fun provideTvShowRepository(
        tvShowRemoteDataSource: TvShowRemoteDataSource,
        tvShowLocalDataSource: TvShowLocalDataSource,
        tvShowCacheDataSource: TvShowCacheDataSource
    ): TvShowRepository {
        return TvShowRepositoryImpl(
            tvShowCacheDataSource,
            tvShowLocalDataSource,
            tvShowRemoteDataSource
        )
    }

    @Singleton
    @Provides
    fun ArtistRepository(
        artistRemoteDataSource: ArtistRemoteDataSource,
        artistLocalDataSource: ArtistLocalDataSource,
        artistCacheDataSource: ArtistCacheDataSource
    ): ArtistRepository {
        return ArtistRepositoryImpl(
            artistCacheDataSource,
            artistLocalDataSource,
            artistRemoteDataSource
        )
    }
}