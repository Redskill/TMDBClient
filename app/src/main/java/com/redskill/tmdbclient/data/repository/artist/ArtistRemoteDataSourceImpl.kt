package com.redskill.tmdbclient.data.repository.artist

import com.redskill.tmdbclient.data.db.TMDBService
import com.redskill.tmdbclient.data.model.ArtistList
import com.redskill.tmdbclient.data.repository.artist.datasource.ArtistRemoteDataSource
import retrofit2.Response

class ArtistRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey: String
) : ArtistRemoteDataSource {

    override suspend fun getArtists(): Response<ArtistList> {
        return tmdbService.getPopularArtist(apiKey)
    }
}