package com.redskill.tmdbclient.data.model

import com.google.gson.annotations.SerializedName

data class TvShowList(
    @SerializedName("results")
    val tvShows : List<TvShow>
)