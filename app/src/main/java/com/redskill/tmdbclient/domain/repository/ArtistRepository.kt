package com.redskill.tmdbclient.domain.repository

import com.redskill.tmdbclient.data.model.Artist

interface ArtistRepository {
    suspend fun getArtists(): List<Artist>?
    suspend fun updateArtists(): List<Artist>?
}