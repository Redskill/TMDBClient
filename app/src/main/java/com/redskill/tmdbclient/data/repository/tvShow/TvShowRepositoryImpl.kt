package com.redskill.tmdbclient.data.repository.tvShow

import android.util.Log
import com.redskill.tmdbclient.data.model.TvShow
import com.redskill.tmdbclient.data.repository.tvShow.datasource.TvShowCacheDataSource
import com.redskill.tmdbclient.data.repository.tvShow.datasource.TvShowLocalDataSource
import com.redskill.tmdbclient.data.repository.tvShow.datasource.TvShowRemoteDataSource
import com.redskill.tmdbclient.domain.repository.TvShowRepository

class TvShowRepositoryImpl(
    private val tvShowCacheDataSource: TvShowCacheDataSource,
    private val tvShowLocalDataSource: TvShowLocalDataSource,
    private val tvShowRemoteDataSource: TvShowRemoteDataSource
) : TvShowRepository {

    override suspend fun getTvShows(): List<TvShow>? {
        return getTvShowsFromCache()
    }

    override suspend fun updateTvShows(): List<TvShow>? {
        val newListOfMovies = getTvShowsFromAPI()
        tvShowLocalDataSource.clearAllTvShowsFromDB()
        tvShowLocalDataSource.saveTvShowsFromDB(newListOfMovies)
        tvShowCacheDataSource.saveTvShowsToCache(newListOfMovies)
        return newListOfMovies
    }

    suspend fun getTvShowsFromAPI(): List<TvShow> {
        lateinit var tvShowList: List<TvShow>
        try {
            val response = tvShowRemoteDataSource.getTvShows()
            val body = response.body()
            if (body != null) {
                tvShowList = body.tvShows
            }
        } catch (exception: Exception) {
            Log.i("MyTag", exception.message.toString())
        }
        return tvShowList
    }

    suspend fun getTvShowsFromDB(): List<TvShow> {
        lateinit var tvShowList: List<TvShow>
        try {
            tvShowList = tvShowLocalDataSource.getTvShowsFromDB()
        } catch (exception: Exception) {
            Log.i("MyTag", exception.message.toString())
        }

        if (tvShowList.isNotEmpty()) {
            return tvShowList
        } else {
            tvShowList = getTvShowsFromAPI()
            tvShowLocalDataSource.saveTvShowsFromDB(tvShowList)
        }
        return tvShowList
    }

    suspend fun getTvShowsFromCache(): List<TvShow> {
        lateinit var tvShowList: List<TvShow>
        try {
            tvShowList = tvShowCacheDataSource.getTvShowsFromCache()
        } catch (exception: Exception) {
            Log.i("MyTag", exception.message.toString())
        }

        if (tvShowList.isNotEmpty()) {
            return tvShowList
        } else {
            tvShowList = getTvShowsFromDB()
            tvShowCacheDataSource.saveTvShowsToCache(tvShowList)
        }
        return tvShowList
    }
}