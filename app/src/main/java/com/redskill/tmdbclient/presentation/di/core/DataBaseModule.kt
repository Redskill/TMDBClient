package com.redskill.tmdbclient.presentation.di.core

import android.content.Context
import androidx.room.Room
import com.redskill.tmdbclient.data.db.ArtistDao
import com.redskill.tmdbclient.data.db.MovieDao
import com.redskill.tmdbclient.data.db.TMDBDatabase
import com.redskill.tmdbclient.data.db.TvShowDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DataBaseModule {

    @Singleton
    @Provides
    fun provideMovieDataBase(context: Context) : TMDBDatabase {
        return Room.databaseBuilder(context, TMDBDatabase::class.java, "tmdbclient").build()
    }

    @Singleton
    @Provides
    fun provideMovieDao(tmdbDatabase: TMDBDatabase) : MovieDao {
        return tmdbDatabase.movieDao()
    }

    @Singleton
    @Provides
    fun provideTvShowDao(tmdbDatabase: TMDBDatabase) : TvShowDao {
        return tmdbDatabase.tvDao()
    }

    @Singleton
    @Provides
    fun provideArtistDao(tmdbDatabase: TMDBDatabase) : ArtistDao {
        return tmdbDatabase.artistDao()
    }
}