package com.redskill.tmdbclient.presentation.di.core

import com.redskill.tmdbclient.data.db.ArtistDao
import com.redskill.tmdbclient.data.db.MovieDao
import com.redskill.tmdbclient.data.db.TvShowDao
import com.redskill.tmdbclient.data.repository.artist.ArtistLocalDataSourceImpl
import com.redskill.tmdbclient.data.repository.artist.datasource.ArtistLocalDataSource
import com.redskill.tmdbclient.data.repository.movie.MovieLocalDataSourceImpl
import com.redskill.tmdbclient.data.repository.movie.datasource.MovieLocalDataSource
import com.redskill.tmdbclient.data.repository.tvShow.TvShowLocalDataSourceImpl
import com.redskill.tmdbclient.data.repository.tvShow.datasource.TvShowLocalDataSource
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LocalDataModule {

    @Singleton
    @Provides
    fun provideMovieLocalDataSource(movieDao: MovieDao) : MovieLocalDataSource {
        return MovieLocalDataSourceImpl(movieDao)
    }

    @Singleton
    @Provides
    fun provideMovieLocalDataSource(tvShowDao: TvShowDao) : TvShowLocalDataSource {
        return TvShowLocalDataSourceImpl(tvShowDao)
    }

    @Singleton
    @Provides
    fun provideArtistLocalDataSource(artistDao: ArtistDao) : ArtistLocalDataSource {
        return ArtistLocalDataSourceImpl(artistDao)
    }
}