package com.example.movilautomotriz
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.*


interface APIService {
    @GET
    fun getUser(@Url url: String): Call<getUserRes>

    @GET
    fun searchFolio(@Url url: String): Call<searchFolioRes>
}