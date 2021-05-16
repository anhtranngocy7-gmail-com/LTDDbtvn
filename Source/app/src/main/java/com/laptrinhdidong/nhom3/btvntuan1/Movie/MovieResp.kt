package com.laptrinhdidong.nhom3.btvntuan1.Movie

data class MovieResp (
    val dates: Dates,
    val page: Long,
    val results: MutableList<Movie>,
    val totalPages: Long,
    val totalResults: Long
)

data class Dates (
    val maximum: String,
    val minimum: String
)

