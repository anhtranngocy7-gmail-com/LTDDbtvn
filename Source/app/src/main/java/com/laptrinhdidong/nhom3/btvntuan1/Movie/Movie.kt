package com.laptrinhdidong.nhom3.btvntuan1.Movie

import com.google.gson.annotations.SerializedName

data class Movie (
    val adult: Boolean?= null,

    @SerializedName(value = "backdrop_path")
    val backdropPath: String?= null,
    @SerializedName(value = "genre_ids")
    val genreIDS: List<Long>?= null,
    val id: Long?= null,
    @SerializedName(value = "original_language")
    val originalLanguage: OriginalLanguage?= null,

    @SerializedName(value = "original_title")
    val originalTitle: String?= null,

    val overview: String?= null,
    val popularity: Double?= null,

    @SerializedName(value = "poster_path")
    val posterPath: String?= null,

    @SerializedName(value = "release_date")
    val releaseDate: String?= null,

    val title: String?= null,
    val video: Boolean?= null,

    @SerializedName(value = "vote_average")
    val voteAverage: Double?= null,

    @SerializedName(value = "vote_count")
    val voteCount: Long?= null

)

enum class OriginalLanguage {
    En,
    Ja,
    Ko,
    Ru
}