package com.redskill.tmdbclient.domain.usecase

import com.redskill.tmdbclient.data.model.Artist
import com.redskill.tmdbclient.domain.repository.ArtistRepository

class GetArtistUseCase(private val artistRepository: ArtistRepository) {
    suspend fun execute(): List<Artist>? = artistRepository.getArtists()
}