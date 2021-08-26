package com.redskill.tmdbclient.presentation.di

import com.redskill.tmdbclient.presentation.di.artist.ArtistSubComponent
import com.redskill.tmdbclient.presentation.di.movie.MovieSubComponent
import com.redskill.tmdbclient.presentation.di.tvshow.TvShowSubComponent

interface Injector {
    fun createMoviesSubComponent(): MovieSubComponent
    fun createTvShowSubComponent(): TvShowSubComponent
    fun createArtistSubComponent(): ArtistSubComponent
}