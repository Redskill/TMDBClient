package com.redskill.tmdbclient.domain.repository

import com.redskill.tmdbclient.data.model.TvShow

interface TvShowRepository {
    suspend fun getTvShows(): List<TvShow>?
    suspend fun updateTvShows(): List<TvShow>?
}