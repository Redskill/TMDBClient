package com.redskill.tmdbclient.presentation

import android.app.Application
import com.redskill.tmdbclient.BuildConfig
import com.redskill.tmdbclient.presentation.di.Injector
import com.redskill.tmdbclient.presentation.di.artist.ArtistSubComponent
import com.redskill.tmdbclient.presentation.di.core.AppComponent
import com.redskill.tmdbclient.presentation.di.core.AppModule
import com.redskill.tmdbclient.presentation.di.core.NetModule
import com.redskill.tmdbclient.presentation.di.core.RemoteDataModule
import com.redskill.tmdbclient.presentation.di.movie.MovieSubComponent
import com.redskill.tmdbclient.presentation.di.tvshow.TvShowSubComponent

class App : Application(), Injector {

    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(applicationContext))
            .netModule(NetModule(BuildConfig.BASE_URL))
            .remoteDataModule(RemoteDataModule(BuildConfig.API_KEY))
            .build()

    }

    override fun createMoviesSubComponent(): MovieSubComponent {
        return appComponent.movieSubComponent().create()
    }

    override fun createTvShowSubComponent(): TvShowSubComponent {
        return appComponent.tvShowSubComponent().create()
    }

    override fun createArtistSubComponent(): ArtistSubComponent {
        return appComponent.artistSubComponent().create()
    }
}