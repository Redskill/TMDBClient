package com.redskill.tmdbclient.domain.usecase

import com.redskill.tmdbclient.data.model.Artist
import com.redskill.tmdbclient.domain.repository.ArtistRepository

class UpdateArtistsUseCase(private val artistRepository: ArtistRepository) {
    suspend fun execute(): List<Artist>? = artistRepository.updateArtists()
}