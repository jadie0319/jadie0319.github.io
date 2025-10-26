package com.jadie.stockservice.collect.infra

import com.jadie.stockservice.collect.config.FeignConfig
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient(
    name = "stock-service",
    url = "\${kiwoom.url}",
    configuration = [FeignConfig::class]
)
interface StockApiClient {
    @GetMapping("/oauth2/token")
    fun getToken(request: TokenRequest): TokenResponse
}
