package com.redskill.tmdbclient.presentation.di.artist

import com.redskill.tmdbclient.presentation.artist.ArtistActivity
import dagger.Subcomponent

@ArtistScope
@Subcomponent(modules = [ArtistModule::class])
class ArtistSubComponent {
    fun inject(artistActivity: ArtistActivity) {}

    @Subcomponent.Factory
    interface Factory {
        fun create(): ArtistSubComponent
    }
}