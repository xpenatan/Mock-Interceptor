package br.com.aisdigital.retrofit2.mock.example.network.api

import br.com.aisdigital.retrofit2.mock.example.network.BaseUrl
import br.com.aisdigital.retrofit2.mock.example.network.request.LoginRequest
import br.com.aisdigital.retrofit2.mock.example.network.response.LoginResponse
import br.com.aisdigital.retrofit2.mock.example.network.response.LogoutResponse
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthApi {

    @POST(BaseUrl.PATH_DEFAULT + BaseUrl.PATH_LOGIN)
    fun login(@Body loginRequest: LoginRequest): Call<LoginResponse>

    @POST(BaseUrl.PATH_DEFAULT + BaseUrl.PATH_LOGOUT)
    fun logout(): Call<LogoutResponse>

}