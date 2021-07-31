package com.redskill.tmdbclient.data.repository.tvShow.datasource

import com.redskill.tmdbclient.data.model.TvShowList
import retrofit2.Response

interface TvShowRemoteDataSource {
    suspend fun getTvShows(): Response<TvShowList>
}