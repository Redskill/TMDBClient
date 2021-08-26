package com.redskill.tmdbclient.presentation.di.movie

import com.redskill.tmdbclient.presentation.movie.MovieActivity
import dagger.Subcomponent

@MovieScope
@Subcomponent(modules = [MovieModule::class])
interface MovieSubComponent {
    fun inject(movieActivity: MovieActivity) {}

    @Subcomponent.Factory
    interface Factory {
        fun create(): MovieSubComponent
    }
}