package com.laptrinhdidong.nhom3.btvntuan1.rest
import com.laptrinhdidong.nhom3.btvntuan1.Model.MovieResp
import retrofit2.http.GET
import retrofit2.http.Query
interface MovieDBService {
        @GET("movie/now_playing")
        suspend fun listNowPlayMovies(
            @Query("language") language: String, @Query("page") page: Int
        ): MovieResp

        @GET("movie/top_rated")
        suspend fun listTopRated(
            @Query("language") language: String,@Query("page") page: Int
        ): MovieResp
}