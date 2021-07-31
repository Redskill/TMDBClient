package com.redskill.tmdbclient.data.db

import com.redskill.tmdbclient.data.model.ArtistList
import com.redskill.tmdbclient.data.model.MovieList
import com.redskill.tmdbclient.data.model.TvShowList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface TMDBService {

    @GET("movie/popular")
    suspend fun getPopularMovies(@Query("api_key") apikey: String): Response<MovieList>

    @GET("tv/popular")
    suspend fun getPopularTvShows(@Query("api_key") apikey: String): Response<TvShowList>

    @GET("people/popular")
    suspend fun getPopularArtist(@Query("api_key") apikey: String): Response<ArtistList>
}