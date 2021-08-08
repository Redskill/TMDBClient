package com.redskill.tmdbclient.presentation.di.core

import com.redskill.tmdbclient.data.db.TMDBService
import com.redskill.tmdbclient.data.repository.artist.ArtistRemoteDataSourceImpl
import com.redskill.tmdbclient.data.repository.artist.datasource.ArtistRemoteDataSource
import com.redskill.tmdbclient.data.repository.movie.MovieRemoteDataSourceImpl
import com.redskill.tmdbclient.data.repository.movie.datasource.MovieRemoteDataSource
import com.redskill.tmdbclient.data.repository.tvShow.TvShowRemoteDataSourceImpl
import com.redskill.tmdbclient.data.repository.tvShow.datasource.TvShowRemoteDataSource
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RemoteDataModule(private val apiKey: String) {

    @Singleton
    @Provides
    fun provideMovieRemoteDataSource(tmdbService: TMDBService): MovieRemoteDataSource {
        return MovieRemoteDataSourceImpl(tmdbService, apiKey)
    }

    @Singleton
    @Provides
    fun provideTvShowRemoteDataSource(tmdbService: TMDBService): TvShowRemoteDataSource {
        return TvShowRemoteDataSourceImpl(tmdbService, apiKey)
    }

    @Singleton
    @Provides
    fun provideArtistRemoteDataSource(tmdbService: TMDBService): ArtistRemoteDataSource {
        return ArtistRemoteDataSourceImpl(tmdbService, apiKey)
    }
}