package br.com.aisdigital.retrofit2.mock.network

import com.google.gson.annotations.SerializedName

data class RequestMultiDataModel(
    @SerializedName("email") val email: String? = null,
    @SerializedName("name") val name: String? = null,
    @SerializedName("lastName") val lastName: String? = null,
    @SerializedName("my_int") val myInt: Int? = null
)
