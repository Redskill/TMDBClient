package com.redskill.tmdbclient.data.model

import com.google.gson.annotations.SerializedName

data class ArtistList(
    @SerializedName("results")
    val artistList : List<Artist>
)