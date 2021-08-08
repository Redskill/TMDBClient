package com.redskill.tmdbclient.presentation.di.core

import com.redskill.tmdbclient.data.repository.artist.ArtistCacheDataSourceImpl
import com.redskill.tmdbclient.data.repository.artist.datasource.ArtistCacheDataSource
import com.redskill.tmdbclient.data.repository.movie.MovieCacheDataSourceImpl
import com.redskill.tmdbclient.data.repository.movie.datasource.MovieCacheDataSource
import com.redskill.tmdbclient.data.repository.tvShow.TvShowCacheDataSourceImpl
import com.redskill.tmdbclient.data.repository.tvShow.datasource.TvShowCacheDataSource
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CacheDataModule {

    @Singleton
    @Provides
    fun provideMovieCacheDataSource(): MovieCacheDataSource {
        return MovieCacheDataSourceImpl()
    }

    @Singleton
    @Provides
    fun provideTvShowCacheDataSource(): TvShowCacheDataSource {
        return TvShowCacheDataSourceImpl()
    }

    @Singleton
    @Provides
    fun provideArtistCacheDataSource(): ArtistCacheDataSource {
        return ArtistCacheDataSourceImpl()
    }
}