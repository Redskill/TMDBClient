package com.redskill.tmdbclient.presentation.di.tvshow

import com.redskill.tmdbclient.presentation.tvshow.TvShowActivity
import dagger.Subcomponent

@TvShowScope
@Subcomponent(modules = [TvShowModule::class])
interface TvShowSubComponent {
    fun inject(tvShowActivity: TvShowActivity) {}

    @Subcomponent.Factory
    interface Factory {
        fun create(): TvShowSubComponent
    }
}