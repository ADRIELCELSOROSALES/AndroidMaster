package com.example.androidmaster.superheroapp

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("api/7130301963686062/search/{name}")
    suspend fun getSuperheroes(@Path("name") superheroName: String):Response<SuperHeroDataResponse>


}