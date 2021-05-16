package com.laptrinhdidong.nhom3.btvntuan1.Model

data class MovieResp (
    val dates: Dates,
    val page: Long,
    val results: List<Movie>,
    val totalPages: Long,
    val totalResults: Long
)

data class Dates (
    val maximum: String,
    val minimum: String
)

