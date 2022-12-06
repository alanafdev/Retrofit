package com.alanafdev.retrofit.model

import com.google.gson.annotations.SerializedName

data class User(
    val id: Int,
    val email: String,
    @SerializedName("first name")
    val firstName: String,
    @SerializedName("last name")
    val lastname : String


)
