package br.com.aisdigital.retrofit2.mock.example.network.response

import com.google.gson.annotations.SerializedName

data class LogoutResponse(
    @SerializedName("logout_text")
    val logoutText: String?
)
