package com.redskill.tmdbclient.data.repository.tvShow

import com.redskill.tmdbclient.data.db.TMDBService
import com.redskill.tmdbclient.data.model.TvShowList
import com.redskill.tmdbclient.data.repository.tvShow.datasource.TvShowRemoteDataSource
import retrofit2.Response

class TvShowRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey: String
) : TvShowRemoteDataSource {
    override suspend fun getTvShows(): Response<TvShowList> {
       return tmdbService.getPopularTvShows(apiKey)
    }
}