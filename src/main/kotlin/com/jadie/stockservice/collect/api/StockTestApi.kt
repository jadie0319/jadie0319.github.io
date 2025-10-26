package com.jadie.stockservice.collect.api

import com.jadie.stockservice.collect.infra.StockApiClient
import com.jadie.stockservice.collect.infra.TokenRequest
import org.springframework.beans.factory.annotation.Value
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
class StockTestApi(
    private val client: StockApiClient,
    @Value("\${kiwoom.app-key}") private val appKey: String,
    @Value("\${kiwoom.secret-key}") private val secretKey: String
) {

    @GetMapping("/stocks")
    @ResponseStatus(HttpStatus.OK)
    fun getStock() {

        val request = TokenRequest("client_credentials", appKey, secretKey)
        val token = client.getToken(request)
        println(token);
    }

}
