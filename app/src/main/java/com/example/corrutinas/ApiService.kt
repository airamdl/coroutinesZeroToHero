package com.example.corrutinas


import com.google.gson.annotations.SerializedName
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiServices {

    @GET("/api/ceadc7deddaac24c8b8a2e88bdde852b/search/{name}")
    suspend fun getSuperheroes(@Path("name") superheroName:String): Response<SuperHeroDataResponse>
}

data class SuperHeroDataResponse(@SerializedName("response") val response:String)