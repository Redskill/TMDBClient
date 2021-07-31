package com.redskill.tmdbclient.data.repository.artist.datasource

import com.redskill.tmdbclient.data.model.Artist

interface ArtistLocalDataSource {
    suspend fun getArtistsFromDB(): List<Artist>
    suspend fun saveArtistsFromDB(artists: List<Artist>)
    suspend fun clearAllArtistsFromDB()
}