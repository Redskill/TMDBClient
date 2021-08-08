package com.redskill.tmdbclient.presentation.artist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.redskill.tmdbclient.domain.usecase.GetArtistUseCase
import com.redskill.tmdbclient.domain.usecase.UpdateArtistsUseCase

class ArtistViewModelFactory(
    private val getArtistUseCase: GetArtistUseCase,
    private val updateArtistsUseCase: UpdateArtistsUseCase
) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return ArtistViewModel(getArtistUseCase, updateArtistsUseCase) as T
    }
}