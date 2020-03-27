package br.com.aisdigital.retrofit2.mock.example.network.datasource

import br.com.aisdigital.retrofit2.mock.example.network.ApiResult
import br.com.aisdigital.retrofit2.mock.example.network.api.AuthApi
import br.com.aisdigital.retrofit2.mock.example.network.request.LoginRequest
import br.com.aisdigital.retrofit2.mock.example.network.response.LoginResponse
import br.com.aisdigital.retrofit2.mock.example.network.response.LogoutResponse
import br.com.aisdigital.retrofit2.mock.example.network.util.BaseRetrofitCallback

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
class LoginDataSource(private val authApi: AuthApi) {

    fun login(request: LoginRequest, handler: (ApiResult<LoginResponse>) -> Unit){
        val call = authApi.login(request)
        call.enqueue(BaseRetrofitCallback<LoginResponse>(handler))
    }

    fun logout(handler: (ApiResult<LogoutResponse>) -> Unit) {
        val call = authApi.logout()
        call.enqueue(BaseRetrofitCallback<LogoutResponse>(handler))
    }
}

