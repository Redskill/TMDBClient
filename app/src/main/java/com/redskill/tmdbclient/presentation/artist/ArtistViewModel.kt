package com.redskill.tmdbclient.presentation.artist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.redskill.tmdbclient.domain.usecase.GetArtistUseCase
import com.redskill.tmdbclient.domain.usecase.UpdateArtistsUseCase

class ArtistViewModel(
    private val getArtistUseCase: GetArtistUseCase,
    private val updateArtistsUseCase: UpdateArtistsUseCase
) : ViewModel() {

    fun getArtists() = liveData {
        val movieList = getArtistUseCase.execute()
        emit(movieList)
    }

    fun updateArtists() = liveData {
        val movieList = updateArtistsUseCase.execute()
        emit(movieList)
    }
}
