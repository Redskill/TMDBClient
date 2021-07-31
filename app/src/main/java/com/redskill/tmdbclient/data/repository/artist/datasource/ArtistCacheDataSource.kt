package com.redskill.tmdbclient.data.repository.artist.datasource

import com.redskill.tmdbclient.data.model.Artist

interface ArtistCacheDataSource {
    suspend fun getArtistsFromCache(): List<Artist>
    suspend fun saveArtistsToCache(movies: List<Artist>)
}