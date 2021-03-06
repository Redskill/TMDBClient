package com.redskill.tmdbclient.presentation.di.artist

import com.redskill.tmdbclient.domain.usecase.GetArtistUseCase
import com.redskill.tmdbclient.domain.usecase.UpdateArtistsUseCase
import com.redskill.tmdbclient.presentation.artist.ArtistViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class ArtistModule {

    @ArtistScope
    @Provides
    fun provideArtistViewModelFactory(
        getArtistUseCase: GetArtistUseCase,
        updateArtistsUseCase: UpdateArtistsUseCase
    ): ArtistViewModelFactory {
        return ArtistViewModelFactory(getArtistUseCase, updateArtistsUseCase)
    }
}