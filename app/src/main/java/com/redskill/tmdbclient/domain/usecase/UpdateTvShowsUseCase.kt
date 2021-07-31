package com.redskill.tmdbclient.domain.usecase

import com.redskill.tmdbclient.data.model.TvShow
import com.redskill.tmdbclient.domain.repository.TvShowRepository

class UpdateTvShowsUseCase(private val tvShowRepository: TvShowRepository) {
    suspend fun execute(): List<TvShow>? = tvShowRepository.updateTvShows()
}