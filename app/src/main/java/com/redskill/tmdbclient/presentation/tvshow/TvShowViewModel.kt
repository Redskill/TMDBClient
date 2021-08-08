package com.redskill.tmdbclient.presentation.tvshow

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.redskill.tmdbclient.domain.usecase.GetTvShowsUseCase
import com.redskill.tmdbclient.domain.usecase.UpdateTvShowsUseCase

class TvShowViewModel(
    private val getTvShowsUseCase: GetTvShowsUseCase,
    private val updateTvShowsUseCase: UpdateTvShowsUseCase
) : ViewModel() {

    fun getTvShows() = liveData {
        val movieList = getTvShowsUseCase.execute()
        emit(movieList)
    }

    fun updateTvShows() = liveData {
        val movieList = updateTvShowsUseCase.execute()
        emit(movieList)
    }
}