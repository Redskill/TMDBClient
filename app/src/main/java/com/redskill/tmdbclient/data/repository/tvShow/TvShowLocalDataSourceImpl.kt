package com.redskill.tmdbclient.data.repository.tvShow

import com.redskill.tmdbclient.data.db.TvShowDao
import com.redskill.tmdbclient.data.model.TvShow
import com.redskill.tmdbclient.data.repository.tvShow.datasource.TvShowLocalDataSource
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class TvShowLocalDataSourceImpl(private val tvDao: TvShowDao) : TvShowLocalDataSource {

    override suspend fun getTvShowsFromDB(): List<TvShow> {
        return tvDao.getTvShows()
    }

    override suspend fun saveTvShowsFromDB(tvShows: List<TvShow>) {
        CoroutineScope(Dispatchers.IO).launch {
            tvDao.saveTvShows(tvShows)
        }
    }

    override suspend fun clearAllTvShowsFromDB() {
        CoroutineScope(Dispatchers.IO).launch {
            tvDao.deleteAllTvShows()
        }
    }
}