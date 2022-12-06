package com.alanafdev.retrofit.api

import com.alanafdev.retrofit.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET

interface Api {
    @GET("users")
    fun getUsers(): Call<UserResponse>
}