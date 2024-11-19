package com.example.corrutinas



import retrofit2.http.GET


interface ApiServices {
    @GET("users")
    suspend fun getUsers(): List<User>
}

data class User(
    val id: Int,
    val name: String,
    val username: String,
    val email: String,
    val phone: String,
    val website: String
)