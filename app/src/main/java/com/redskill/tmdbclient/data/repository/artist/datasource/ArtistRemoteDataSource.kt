package com.redskill.tmdbclient.data.repository.artist.datasource

import com.redskill.tmdbclient.data.model.ArtistList
import retrofit2.Response

interface ArtistRemoteDataSource {
    suspend fun getArtists(): Response<ArtistList>
}