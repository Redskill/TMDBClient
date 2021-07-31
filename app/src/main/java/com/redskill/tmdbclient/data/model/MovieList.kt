package com.redskill.tmdbclient.data.model

import com.google.gson.annotations.SerializedName

data class MovieList(
    @SerializedName("results")
    val movies : List<Movie>
)