package com.redskill.tmdbclient.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.redskill.tmdbclient.data.model.Artist
import com.redskill.tmdbclient.data.model.Movie
import com.redskill.tmdbclient.data.model.TvShow

@Database(
    entities = [Movie::class, TvShow::class, Artist::class],
    version = 1,
    exportSchema = false
)
abstract class TMDBDatabase : RoomDatabase() {
    abstract fun movieDao(): MovieDao
    abstract fun tvDao(): TvShowDao
    abstract fun artistDao(): ArtistDao
}
